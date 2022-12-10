package codegym.controller;

import codegym.bean.Song;
import codegym.service.ISongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@PropertySource("classpath:upload_file.properties")
@RequestMapping("/song")
public class SongController {
    @Value("${file-upload}")
    private String fileUpload;

    @Autowired
    private ISongService iSongService;

    @GetMapping("/list")
    public String displayList (Model model){
        model.addAttribute("songs", iSongService.findAll());
        return ("list");
    }

    @GetMapping ("/create")
    public String showCreate (Model model){
        model.addAttribute("song", new Song());

        String[] kindOfMusicList = {"classic", "pop", "jazz"};
        model.addAttribute("kindOfMusicList", kindOfMusicList);

        String[] fileList = {".mp3", ".mp4", ".mp5"};
        model.addAttribute("fileList", fileList);

        return "song/create";
    }

    @PostMapping("/create")
    public String doUpdate (@ModelAttribute ("song") Song song){
        iSongService.save(song);
        return "redirect:/song/list";
    }

}
