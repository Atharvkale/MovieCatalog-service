package com.wu.movie.MovieCatalogService.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="moviecatalog")
public class MovieCatalog {
	@Id
	@Column(name="moviename")
	private String name;
	@Column(name="description")
	private String description;
	@Column(name="rating")
	private int rating;
	
	public MovieCatalog()
	{
		
	}
	public MovieCatalog(String name, String description, int rating) {
		super();
		this.name = name;
		this.description = description;
		this.rating = rating;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "MovieCatalog [name=" + name + ", description=" + description + ", rating=" + rating + "]";
	}
	
	
}
