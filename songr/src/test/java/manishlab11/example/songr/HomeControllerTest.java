package manishlab11.example.songr;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HomeControllerTest {
    HomeController test = new HomeController();

    @Test
    public void reverse() {
        assertEquals("It should be a reverse of the string passed.","dlrow olleh", test.reverse("hello world"));
        assertEquals("It should be a reverse of the string passed.","civic", test.reverse("civic"));
        assertEquals("It should be a reverse of the string passed.","esreveR tseT", test.reverse("Test Reverse"));
        assertEquals("It should be a reverse of the string passed.","gnirtS a esreveR", test.reverse("Reverse a String"));
        assertEquals("It should be a reverse of the string passed.","?gnikrow ti sI", test.reverse("Is it working?"));
    }
}