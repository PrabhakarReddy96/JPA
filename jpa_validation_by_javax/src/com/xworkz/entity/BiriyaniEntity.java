package com.xworkz.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Reddy
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "biriyani")
public class BiriyaniEntity extends ParentEntity {

	@Id
	@GenericGenerator(name = "Reddy", strategy = "increment")
	@GeneratedValue(generator = "Reddy")
	
	@NotNull(message = "please enter valid id")
	private int bid;
	@NotNull(message = "enter valid name")
	private String name;
	@NotNull(message = "enter valid location")
	private String location;
	@NotNull(message = "enter valid type")
	private String type;
	@NotNull(message = "enter valid price")
	@Min(value = 20,message = "min price is 20")
	@Max(value=200)
	private double price;

	public BiriyaniEntity() {

	}

	public BiriyaniEntity(String createdBy, LocalDate createdDate, String updatedBy, LocalDate updatedDate, String name,
			String location, String type, double price) {
		super(createdBy, createdDate, updatedBy, updatedDate);
		this.name = name;
		this.location = location;
		this.type = type;
		this.price = price;
	}

	public BiriyaniEntity(LocalDate of, String string, LocalDate of2, String string2, String string3, String string4,
			int i, String string5) {
		// TODO Auto-generated constructor stub
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
