package codegym.controller;

import codegym.bean.Song;
import codegym.service.ISongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/song")
public class SongController {
    @Autowired
    ISongService iSongService;

    @GetMapping("/list")
    public String displayList (Model model){
        model.addAttribute("songList", iSongService.findAll());
        return ("song/list");
    }

    @GetMapping ("/create")
    public String showUpdate (Model model){
        model.addAttribute("song", new Song());

        String[] kindOfMusicList = {"classic", "pop", "jazz"};
        model.addAttribute("kindOfMusicList", kindOfMusicList);

        String[] fileList = {".mp3", ".mp4", ".mp5"};
        model.addAttribute("fileList", fileList);

        return "song/create";
    }

    @PostMapping("/create")
    public String doUpdate (@ModelAttribute ("song") Song song){
        iSongService.createOrUpdate(song);
        return "redirect:/song/list";
    }

}
