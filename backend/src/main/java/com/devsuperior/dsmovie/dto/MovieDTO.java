package com.devsuperior.dsmovie.dto;

import com.devsuperior.dsmovie.entities.Movie;

public class MovieDTO {

	private Long id;

	private Double score;
	private Integer conut;
	private String title;
	private String image;

	public MovieDTO() {
		super();
	}

	public MovieDTO(Long id, Double score, Integer conut, String title, String image) {
		super();
		this.id = id;
		this.score = score;
		this.conut = conut;
		this.title = title;
		this.image = image;
	}

	public MovieDTO(Movie movie) {

		this.id = movie.getId();
		this.title = movie.getTitle();
		this.score = movie.getScore();
		this.conut = movie.getConut();
		this.image = movie.getImage();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public Integer getConut() {
		return conut;
	}

	public void setConut(Integer conut) {
		this.conut = conut;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

}
