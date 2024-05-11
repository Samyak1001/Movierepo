package com.movieticketApplication.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="Movie")
@Data
public class MovieEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private long id;
	
	@Column(name = "movieName" , length= 755)
	private String moviename;
	
	@Column(name = "ScreenNo" , length =755)
	private String ScreenNo;
	
	@Column(name = "TheatreName" , length = 755)
	private String Theatrename;
	
	@Column(name="ScreenType", length= 755)
	private String ScreenType;

	public MovieEntity(long id, String moviename, String screenNo, String theatrename, String screenType) {
		super();
		this.id = id;
		this.moviename = moviename;
		ScreenNo = screenNo;
		Theatrename = theatrename;
		ScreenType = screenType;
	}
	
	
	
}
