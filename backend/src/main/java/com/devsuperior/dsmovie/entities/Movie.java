package com.devsuperior.dsmovie.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
	
	@OneToMany(mappedBy = "id.movie")
	private Set<Score> scores = new HashSet<>();

	public Set<Score> getScores() {
		return scores;
	}

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

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer conut) {
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

	public void setScores(Set<Score> scores) {
		this.scores = scores;
	}

}
