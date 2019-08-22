package manishlab11.example.songr.controllers;

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
public class SongController {

    @Autowired
    SongRepository songRepository;

    @GetMapping("/songs")
    public String getOneDirector(Model m) {
        List<Song> songs = songRepository.findAll();

//    public String getOneDirector(@PathVariable long id, Model m) {
//        Director d = directorRepository.findById(id).get();
//        System.out.println(d.getMovies().size());
        m.addAttribute("song", songs);
        return "/songs";
    }

//    @PostMapping("/movies")
//    public RedirectView addMovie(String title, String albumTitle, int length, int trackNumberString) {
//
//        Director d = directorRepository.findByFirstNameAndLastName(names[0], names[1]);
//        if (d == null) {
//            d = new Director(director);
//            directorRepository.save(d);
//        }
//        Movie m = new Movie(title, d, Date.valueOf(releaseDate), 0.0, "R");
//        movieRepository.save(m);
//        return new RedirectView("/movies");
//    }
}

