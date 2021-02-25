package com.org.serviceone;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;


@RestController
public class RatingController {

	@Autowired
	WebClient.Builder webClient;
	
	
	@GetMapping("/rating/{ratingId}")
	public Rating getMovie(@PathVariable("ratingId") int ratingId){
		
		Map<Integer, Rating> ratingList = getRatingList();
		Rating rating = ratingList.get(ratingId);
		Movie movie = webClient.build().get().uri("http://service-two/movie/"+rating.getMovieId()).retrieve().bodyToMono(Movie.class).block();
		
		rating.setMovieId(movie.getMovieId());
		rating.setMovieName(movie.getName());
		return rating;
	}
	
	
	private static Map<Integer, Rating> getRatingList(){
		Map<Integer, Rating> map = new HashMap<>();
		Rating rating1 = new Rating(1, 1, null, "5 Start");
		Rating rating2 = new Rating(2, 2, null, "3 Start");
		Rating rating3 = new Rating(3, 3, null, "4 Start");
		map.put(rating1.getRating(), rating1);
		map.put(rating1.getRating(), rating2);
		map.put(rating3.getRating(), rating3);
		return map;
		
	}
}
