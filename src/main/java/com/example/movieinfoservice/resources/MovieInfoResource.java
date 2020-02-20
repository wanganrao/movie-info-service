package com.example.movieinfoservice.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.movieinfoservice.models.MovieItem;

@RestController
@RequestMapping("/movies")
public class MovieInfoResource {
	@RequestMapping("/{movieId}")
	public MovieItem getMovieInfo(@PathVariable("movieId") String movieId) {
		List<MovieItem> movies = Arrays.asList(
				new MovieItem("Titanic", "Jack and Rose's love story"),
				new MovieItem("Pirates", "Story of a funny pirate"),
				new MovieItem("Transformers", "Machines come alive!!")				
				);
		MovieItem movie = null;
		for (MovieItem m : movies) {
			if(m.getName().equals(movieId)) {
				movie = m;
			}
		}
		return movie;
	}

}
