package pl.robmic.MovieService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.robmic.MovieService.model.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
}
