package sqa.lab.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import sqa.lab.api.MovieService;

public class FavoriteMovieMockTest {
	 	
	@Test
	    public void testGetActionMovies_withMock() {

	        MovieService movieServiceMock = Mockito.mock(MovieService.class);

	        when(movieServiceMock.getMoviesByPlaylist("mixed"))
	            .thenReturn(Arrays.asList(
	                "Action - Avengers",
	                "Romance - The Notebook",
	                "Action - Mad Max",
	                "Horror - The Conjuring"
	            ));

	        FavoriteMovie favoriteMovie = new FavoriteMovie(movieServiceMock);

	        List<String> actionMovies = favoriteMovie.getActionMovies("mixed");

	        assertEquals(2, actionMovies.size());
	        assertTrue(actionMovies.contains("Action - Avengers"));
	        assertTrue(actionMovies.contains("Action - Mad Max"));

	        verify(movieServiceMock, times(1)).getMoviesByPlaylist("mixed");
	    }
}
