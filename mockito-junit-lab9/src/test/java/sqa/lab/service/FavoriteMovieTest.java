package sqa.lab.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.Test;
import sqa.lab.api.MovieService;
import sqa.lab.data.stub.MoviePortalStub;

public class FavoriteMovieTest {
	@Test
    public void testDatenightPlaylist() {
        MovieService movieService = new MoviePortalStub(); // ✅ ทำงานได้ เพราะ Stub implements MovieService
        FavoriteMovie favoriteMovie = new FavoriteMovie(movieService);

        List<String> movies = favoriteMovie.showMovies("datenight");

        assertTrue(movies.contains("The Notebook"));
        assertEquals(5, movies.size());
    }

    @Test
    public void testHorrorPlaylist() {
        MovieService movieService = new MoviePortalStub();
        FavoriteMovie favoriteMovie = new FavoriteMovie(movieService);

        List<String> movies = favoriteMovie.showMovies("horror");

        assertTrue(movies.contains("The Conjuring"));
        assertEquals(3, movies.size());
    }

}
