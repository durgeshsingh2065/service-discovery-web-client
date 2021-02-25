package com.org;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {
	
	@GetMapping("/movie/{moveId}")
	public Movie getMovie(@PathVariable("moveId") int movieId){
		return getMovieList().get(movieId);
	}
	
	private static Map<Integer, Movie> getMovieList(){
		Map<Integer, Movie> map = new HashMap<>();
		Movie movie1 = new Movie(1, "One", "Triller", "Triller Movie");
		Movie movie2 = new Movie(2, "two", "Commedy", "Commedy Movie");
		Movie movie3 = new Movie(3, "three", "Action", "Action Movie");
		map.put(movie1.getMovieId(), movie1);
		map.put(movie2.getMovieId(), movie2);
		map.put(movie3.getMovieId(), movie3);
		return map;
		
	}

}
