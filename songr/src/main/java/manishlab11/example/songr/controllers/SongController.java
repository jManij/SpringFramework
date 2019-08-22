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
        m.addAttribute("song", songs);
        return "/songs";
    }


}

