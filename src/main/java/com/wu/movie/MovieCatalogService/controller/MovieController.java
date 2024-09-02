package com.wu.movie.MovieCatalogService.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wu.movie.MovieCatalogService.dao.MovieDAO;
import com.wu.movie.MovieCatalogService.entity.MovieCatalog;

@RestController
@RequestMapping("/movie")
public class MovieController {
	
	private MovieDAO movieDAO;
	
	public MovieController(MovieDAO movieDAO)
	{
		this.movieDAO=movieDAO;
		
	}
	
	@GetMapping("/items")
	public ArrayList<MovieCatalog> getMovieCatalogItems()
	{
		return movieDAO.getMovieCatalogItem();
	}
	

}
