package com.org.serviceone;

public class Rating  {

	private int rating;
	private int movieId;
	private String movieName;
	private String description;
	
	public Rating () {}
	
	public Rating (int rating, int movieId, String movieName, String description) {
		this.rating = rating;
		this.movieId = movieId;
		this.movieName = movieName;
		this.description = description;
	}
	
	public int getRating() {
		return rating;
	}
	
	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
