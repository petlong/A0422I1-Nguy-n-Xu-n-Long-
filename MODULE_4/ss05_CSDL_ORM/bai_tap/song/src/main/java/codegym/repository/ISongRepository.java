package codegym.repository;

import codegym.bean.Song;

import java.util.List;

public interface ISongRepository {
    List<Song> findAll();
    void save(Song song);
    void update(Song song);
    void remove(String name);
    Song findOfName(String name);
}
