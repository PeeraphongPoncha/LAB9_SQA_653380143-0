package sqa.lab.api;

import java.util.List;

public interface MovieService {
	public List<String> getMoviesByPlaylist(String playlistName);
}
