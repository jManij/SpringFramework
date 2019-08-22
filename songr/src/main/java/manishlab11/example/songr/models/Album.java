package manishlab11.example.songr.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    String title;
    String artist;
    int songCount;
    int length;
    String imageURL;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "album")
    List<Song> songs;


    public Album(String title, String artist, int songCount, int length, String imageURL) {
        this.title = title;
        this.artist = artist;
//        this.songs.add(song);
        this.songCount = songCount;
        this.length = length;
        this.imageURL = imageURL;
    }

    //Default constructor
    public Album() {

    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getSongCount() {
        return songCount;
    }

    public int getLength() {
        return length;
    }

    public String getImageURL() {
        return imageURL;
    }

//    public List<Song> getSongs() {
//        return songs;
//    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setSongCount(int songCount) {
        this.songCount = songCount;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

//    public void setSongs(List<Song> songs) {
//        this.songs = songs;
//    }
}
