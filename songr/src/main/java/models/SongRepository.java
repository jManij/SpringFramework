package models;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Album, Long> {
}