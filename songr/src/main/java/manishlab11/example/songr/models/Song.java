package manishlab11.example.songr.models;

import javax.persistence.*;

@Entity
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
//    Album album;
    String title;
    int length;
    int trackNumber;


    @ManyToOne
    Album album;

    public Song(Album album, String title, int length, int trackNumber) {
        this.album = album;
        this.title = title;
        this.length = length;
        this.trackNumber = trackNumber;
    }

//    public Song(String title) {
//        this.title = title;
//    }

    public Song() {
    }

    public String getTitle() {
        return title;
    }

    public Album getAlbum() {
        return album;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setTrackNumber(int trackNumber) {
        this.trackNumber = trackNumber;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }
}
