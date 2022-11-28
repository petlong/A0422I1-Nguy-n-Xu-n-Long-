package codegym.service;

import codegym.bean.Song;

import java.util.List;

public interface ISongService {
    List<Song> findAll();
    void createOrUpdate(Song song);
    Song findOfName(String name);
}
