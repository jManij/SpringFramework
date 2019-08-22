package manishlab11.example.songr.controllers;
import manishlab11.example.songr.models.Album;
import manishlab11.example.songr.models.AlbumRepository;
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

    @GetMapping("/albums")
    public String getAllAlbums(Model m) {
//        Movie theMovie = new Movie("Forrest Gump", "Robert Zemeckis", Date.valueOf("1994-07-06"), 72.0, "PG-13");
//        Movie secondMovie = new Movie("Shawshank Redemption", "Frank Darabont", Date.valueOf("1994-09-23"), 91.0, "R");
//        Movie[] movies = new Movie[]{theMovie, secondMovie};
//        List<Album> albums = songRepository.findAll();
//        m.addAttribute("album", albums);
//        Album album = new Album("Fireworks", "Katy Perry", 5, 24, "www.google.com");
//        songRepository.save(album);  //saves into db
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
    public RedirectView addAlbum(String title, String artist, int songCount, int length, String imageURL) {
        Album album = new Album(title, artist, Integer.valueOf(songCount),length, imageURL);
//        System.out.println(album.toString());
        albumRepository.save(album);
        return new RedirectView("/albums");
    }


    @PostMapping("/albums/{id}/songs")
    public RedirectView addSong(String title, int length, int trackNumber) {
        System.out.println(title);

        return new RedirectView("/albums/{id}/songs");
    }




}