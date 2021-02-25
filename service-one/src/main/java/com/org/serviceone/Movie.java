package com.org.serviceone;

public class Movie {
	private int movieId;
	private String name;
	private String type;
	private String description;
	
	public Movie() {}
	
	public Movie(int movieId, String name, String type, String description) {
		this.movieId = movieId;
		this.name = name;
		this.type = type;
		this.description = description;
	}
	
	
	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getName(){
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
