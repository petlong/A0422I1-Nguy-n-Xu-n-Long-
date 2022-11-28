package codegym.repository;

import codegym.bean.Song;

import java.util.List;

public interface ISongRepository {
    List<Song> findAll();
    void createOrUpdate(Song song);
    Song findOfName(String name);
}
