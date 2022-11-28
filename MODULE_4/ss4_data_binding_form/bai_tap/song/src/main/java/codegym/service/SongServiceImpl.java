package codegym.service;

import codegym.bean.Song;
import codegym.repository.ISongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongServiceImpl implements ISongService{
    @Autowired
    ISongRepository iSongRepository;

    @Override
    public List<Song> findAll() {
        return iSongRepository.findAll();
    }

    @Override
    public void createOrUpdate(Song song) {
        iSongRepository.createOrUpdate(song);
    }

    @Override
    public Song findOfName(String name) {
        return iSongRepository.findOfName(name);
    }
}
