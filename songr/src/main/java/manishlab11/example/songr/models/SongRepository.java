package manishlab11.example.songr.models;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Song, Long> {
//    public Director findByFirstNameAndLastName(String firstName, String lastName);
}