package com.movieticketApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movieticketApplication.entity.MovieEntity;


public interface MovieRepo extends JpaRepository<MovieEntity, Long>{

}
