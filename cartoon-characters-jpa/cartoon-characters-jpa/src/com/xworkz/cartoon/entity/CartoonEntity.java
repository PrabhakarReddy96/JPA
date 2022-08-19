package com.xworkz.cartoon.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cartoon_jpa")
@NamedQueries({ @NamedQuery(name = "findByName", query = "select car from CartoonEntity car where car.name=:nm"),
		@NamedQuery(name = "totalCount", query = "select count(*) from CartoonEntity"),
		@NamedQuery(name = "findByMaxCreateDate", query = "select max(createDateTime) from CartoonEntity"),
		@NamedQuery(name = "findByNameAndCountryAndGenderAndAuthor", query = "select car from CartoonEntity car where car.name=:nm and car.country=:cou and car.gender=:gen and car.author=:aut"),
		@NamedQuery(name = "findAuthorByName", query = "select car.author from CartoonEntity car where car.name=:nm"),
		@NamedQuery(name = "findNameAndCountryByAuthor", query = "select car.name,car.country from CartoonEntity car where car.author=:aut"),
		@NamedQuery(name = "findCreatedDateByAuthor", query = "select car.createDateTime from CartoonEntity car where car.author=:aut"),
		@NamedQuery(name = "updateAuthorByName", query = "update CartoonEntity set author=:aut where name=:nm"),
		@NamedQuery(name = "updateTypeByName", query = "update CartoonEntity set type=:ty where name=:nm"),
		@NamedQuery(name = "deleteByName", query = "delete from CartoonEntity where name=:nm"),

		@NamedQuery(name = "findAll", query = "select car from CartoonEntity car"),
		@NamedQuery(name = "findAllByAuthor", query = "select car from CartoonEntity car where car.author=:aut"),
		@NamedQuery(name = "findAllByAuthorAndGender", query = "select car from CartoonEntity car where car.author=:aut and car.gender=:gen"),
		@NamedQuery(name = "findAllName", query = "select car.name from CartoonEntity car"),
		@NamedQuery(name = "findAllCountry", query = "select car.country from CartoonEntity car"),
		@NamedQuery(name = "findAllNameAndCountry", query = "select car.name,car.country from CartoonEntity car"),
		@NamedQuery(name = "findAllNameAndCountryAndAuthor", query = "select car.name,car.country,car.author from CartoonEntity car")

})
public class CartoonEntity extends ParentEntity {

//		Cartoon Character extends ParentEntity 
//		 cid,name,country, gender,author,type
//		 boolean save(Entity e);
//		 10 cartoons Entity findByName(String name) 
//		Integer total();
//		Entity findBy MaxCreatedDate(); 
//		Entity findByNameAndCountryAndGenderAndAuthor(name,country, gender,author)
//		String findAuthorByName(String name);
//		Object] findNameAndCountry ByAuthor(String author)
//		LocalDate Time find Created Date By Author(String author) 
//		void updateAuthorByName(String newAuthir, String name) 
//		void update Type ByName(String name);
//		void delete ByName(String name);
	@Id
	@GenericGenerator(name = "CARTOON", strategy = "increment")
	@GeneratedValue(generator = "CARTOON")
	private int cid;
	private String name;
	private String country;
	private String gender;
	private String author;
	private String type;
	
	public CartoonEntity() {
		// TODO Auto-generated constructor stub
	}

	public CartoonEntity(String createdBy, LocalDateTime createDateTime, String updatedBy, LocalDateTime updateDateTime,
			String name, String country, String gender, String author, String type) {
		super(createdBy, createDateTime, updatedBy, updateDateTime);
		this.name = name;
		this.country = country;
		this.gender = gender;
		this.author = author;
		this.type = type;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "CartoonEntity [cid=" + cid + ", name=" + name + ", country=" + country + ", gender=" + gender
				+ ", author=" + author + ", type=" + type + ", CreatedBy=" + getCreatedBy() + ", CreateDateTime="
				+ getCreateDateTime() + ", UpdatedBy=" + getUpdatedBy() + ", UpdateDateTime=" + getUpdateDateTime()
				+ "]";
	}

}
