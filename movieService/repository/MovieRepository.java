package pl.pjatk.movieService.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.pjatk.movieService.model.Movie;


@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
}
