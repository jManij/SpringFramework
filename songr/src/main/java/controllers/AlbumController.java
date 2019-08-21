package controllers;
import models.Album;
import models.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;
import java.util.List;

@Controller
public class AlbumController {

    @Autowired
    SongRepository songRepository;

    @GetMapping("/albums")
    public String getAllMovies(Model m) {
//        Movie theMovie = new Movie("Forrest Gump", "Robert Zemeckis", Date.valueOf("1994-07-06"), 72.0, "PG-13");
//        Movie secondMovie = new Movie("Shawshank Redemption", "Frank Darabont", Date.valueOf("1994-09-23"), 91.0, "R");
//        Movie[] movies = new Movie[]{theMovie, secondMovie};
        List<Album> albums = songRepository.findAll();
        m.addAttribute("album", albums);
        return "allalbums";
    }

    @PostMapping("/albums")
    public RedirectView addAlbum(String title, String artist, int songCount, long length, String imageURL) {
        Album album = new Album(title, artist, songCount, length, imageURL);
        songRepository.save(album);
        return new RedirectView("/allalbums");
    }

}