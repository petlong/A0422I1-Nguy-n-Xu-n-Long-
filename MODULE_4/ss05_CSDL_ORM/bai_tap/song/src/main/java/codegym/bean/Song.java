package codegym.bean;

import javax.persistence.*;

@Entity (name = "song")

public class Song {
    @Id
    @Column(name = "name_song", columnDefinition = " varchar(250)")
    private String nameSong;
    private String singer;
    private String kindOfMusic;
    private String file;

    public Song() {
    }

    public Song(String nameSong, String singer, String kindOfMusic, String file) {
        this.nameSong = nameSong;
        this.singer = singer;
        this.kindOfMusic = kindOfMusic;
        this.file = file;
    }

    public String getNameSong() {
        return nameSong;
    }

    public void setNameSong(String nameSong) {
        this.nameSong = nameSong;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getKindOfMusic() {
        return kindOfMusic;
    }

    public void setKindOfMusic(String kindOfMusic) {
        this.kindOfMusic = kindOfMusic;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }
}
