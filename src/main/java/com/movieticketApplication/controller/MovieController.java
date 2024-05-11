package com.movieticketApplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movieticketApplication.entity.MovieEntity;
import com.movieticketApplication.service.MovieService;

@RestController
@RequestMapping("/online-movie")
public class MovieController {
	 
	@Autowired
	 private MovieService movieservice;
	
	@RequestMapping("/")
	public String home() {
		return "index";
	}
	
	@PostMapping("/bookmovie")
	public void BooksAnMovie(@RequestBody MovieEntity movieentity)
	{
		movieservice.BookMovie(movieentity);
	}
	
	@DeleteMapping("online-movie/{id}")
	public void deletemovie(@PathVariable("id") long id)
	{
		this.movieservice.deleteMovieById(id);
	}
}
