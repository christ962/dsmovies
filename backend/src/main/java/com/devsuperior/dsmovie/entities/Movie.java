package com.devsuperior.dsmovie.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_movie")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Double score;
	private Integer count;
	private String title;
	private String image;

	public Movie() {
		super();
	}

	public Movie(Long id, Double score, Integer conut, String title, String image) {
		super();
		this.id = id;
		this.score = score;
		this.count = conut;
		this.title = title;
		this.image = image;
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
		return count;
	}

	public void setConut(Integer conut) {
		this.count = conut;
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
