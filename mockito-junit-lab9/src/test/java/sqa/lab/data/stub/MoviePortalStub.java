package sqa.lab.data.stub;

import java.util.Arrays;
import java.util.List;

import sqa.lab.api.MovieService;

public class MoviePortalStub implements MovieService {
	@Override
    public List<String> getMoviesByPlaylist(String playlistName) {
        if ("datenight".equalsIgnoreCase(playlistName)) {
            return Arrays.asList(
                "The Notebook", 
                "50 First Dates", 
                "A Walk to Remember", 
                "First Love", 
                "The Lucky One"
            );
        } else if ("horror".equalsIgnoreCase(playlistName)) {
            return Arrays.asList(
                "The Conjuring", 
                "Insidious", 
                "Annabelle"
            );
        }
        return Arrays.asList("No movies found");
    }
}
