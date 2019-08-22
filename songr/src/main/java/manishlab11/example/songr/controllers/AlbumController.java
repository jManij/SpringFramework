package manishlab11.example.songr.controllers;
import manishlab11.example.songr.models.Album;
import manishlab11.example.songr.models.AlbumRepository;
import manishlab11.example.songr.models.Song;
import manishlab11.example.songr.models.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class AlbumController {

    @Autowired
    AlbumRepository albumRepository;
    SongRepository songRepository;

    @GetMapping("/albums")
    public String getAllAlbums(Model m) {
        List<Album> albums = albumRepository.findAll();
        m.addAttribute("album", albums);
        return "allalbums";
    }

    @GetMapping("/albums/{id}")
    public String getOneAlbum(@PathVariable long id, Model m) {
        Album a = albumRepository.findById(id).get();
        m.addAttribute("album", a);
        return "onealbum";
    }

    @GetMapping("/albums/{id}/songs")
    public String getAlbumWithSongs(@PathVariable long id, Model m) {
        Album a = albumRepository.findById(id).get();
        m.addAttribute("album", a);
        return "onealbum";
    }


    @PostMapping("/albums")
    public RedirectView addAlbum(String title, String artist, String songTitle, int songCount, int length, String imageURL) {

        Album album = new Album(title, artist, Integer.valueOf(songCount),length, imageURL);
        albumRepository.save(album);
        return new RedirectView("/albums");
    }


    @PostMapping("/albums/{id}/songs")
    public RedirectView addSong(@PathVariable long id, String title, int length, int trackNumber) {
        Album album = albumRepository.findById(id).get();
        System.out.println("Post mapping: " + album.getArtist() + title + length + trackNumber);
        Song song = new Song(album,title, Integer.valueOf(length), Integer.valueOf(trackNumber));
        songRepository.save(song);
        return new RedirectView("/albums/{id}/songs");
    }

}