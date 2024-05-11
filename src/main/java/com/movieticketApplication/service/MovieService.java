package com.movieticketApplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movieticketApplication.entity.MovieEntity;
import com.movieticketApplication.repository.MovieRepo;

@Service
public class MovieService {
	
	@Autowired
	private MovieRepo movierepo;
	
	public void BookMovie(MovieEntity movieentity)
	{
		movierepo.save(movieentity);
	}
	public void deleteMovieById(Long id)
	{
		movierepo.deleteById(id);
	}
}
