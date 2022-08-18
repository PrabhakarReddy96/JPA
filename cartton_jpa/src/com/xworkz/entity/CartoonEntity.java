package com.xworkz.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="cartoon")
//@NamedQueries({ @NamedQuery(name = "", query = ""), @NamedQuery(name = "", query = "") })
public class CartoonEntity extends ParentEntity {
	
	@Id
	@GenericGenerator(name="cartoon",strategy="increment")
	@GeneratedValue(generator="cartoon")
	private int id;
	private String name;
	private String country;
	private String animater;
	private LocalTime startingTime;
	private LocalTime duration;
	


/**
	 * @param id
	 */
	public CartoonEntity() {
		// TODO Auto-generated constructor stub
	}
	


	/**
 * @param createdBy
 * @param createdDate
 * @param updatedBy
 * @param updatedDate
 * @param id
 * @param name
 * @param country
 * @param animater
 * @param startingTime
 * @param duration
 */
public CartoonEntity(String createdBy, LocalDate createdDate, String updatedBy, LocalDate updatedDate, int id,
		String name, String country, String animater, LocalTime startingTime, LocalTime duration) {
	super(createdBy, createdDate, updatedBy, updatedDate);
	this.id = id;
	this.name = name;
	this.country = country;
	this.animater = animater;
	this.startingTime = startingTime;
	this.duration = duration;
}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getAnimater() {
		return animater;
	}

	public void setAnimater(String animater) {
		this.animater = animater;
	}

	public LocalTime getStartingTime() {
		return startingTime;
	}

	public void setStartingTime(LocalTime startingTime) {
		this.startingTime = startingTime;
	}

	public LocalTime getDuration() {
		return duration;
	}

	public void setDuration(LocalTime duration) {
		this.duration = duration;
	}

}
