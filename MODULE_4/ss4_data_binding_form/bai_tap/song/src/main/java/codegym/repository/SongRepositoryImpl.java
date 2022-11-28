package codegym.repository;

import codegym.bean.Song;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SongRepositoryImpl implements ISongRepository{
    static List<Song> songList = new ArrayList<>();

    @Override
    public List<Song> findAll() {
        return songList;
    }

    @Override
    public void createOrUpdate(Song song) {
        songList.add(song);
    }

    @Override
    public Song findOfName(String name) {
        for (Song song: songList){
            if(song.getNameSong() == name){
                return song;
            }
        }
        return null;
    }
}
