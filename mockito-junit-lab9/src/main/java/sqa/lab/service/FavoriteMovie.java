package sqa.lab.service;

import java.util.List;
import java.util.stream.Collectors;

import sqa.lab.api.MovieService;

public class FavoriteMovie {
	private MovieService movieService;

 
    public FavoriteMovie(MovieService movieService) {
    	super();
        this.movieService = movieService;
    }

    public List<String> showMovies(String playlistName) {
        return movieService.getMoviesByPlaylist(playlistName);
    }
    
    public List<String> getActionMovies(String playlistName) {
        List<String> movies = movieService.getMoviesByPlaylist(playlistName);

        return movies.stream()
                .filter(m -> m.toLowerCase().contains("action"))
                .collect(Collectors.toList());
    }
}
