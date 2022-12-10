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
    public void save(Song song) {
        iSongRepository.save(song);
    }

    @Override
    public void update(Song song) {
        iSongRepository.update(song);
    }

    @Override
    public void remove(String name) {
        iSongRepository.remove(name);
    }

    @Override
    public Song findOfName(String name) {
        return iSongRepository.findOfName(name);
    }
}
