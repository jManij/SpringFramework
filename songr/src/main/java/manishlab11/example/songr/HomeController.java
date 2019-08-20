package manishlab11.example.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HomeController {

    @GetMapping("/hello")
    public String getRoot() {
        System.out.println("somebody got the root");
        return "hello";
    }

    @GetMapping("/capitalize/{name}")
    public String getCapital(@PathVariable String name, Model m){
        System.out.println("Asking to capitalize");
        m.addAttribute("word", name.toUpperCase());
        return "capitalize";
    }

    @GetMapping("/reversesentence={name}")
    public String getReverse(@PathVariable String name, Model m){
        System.out.println("Asking to Reverse");
        m.addAttribute("word", reverse(name));
        return "reverse";
    }

    public String reverse(String word) {
        StringBuilder reverseString = new StringBuilder(word);
        return reverseString.reverse().toString();
    }


}
