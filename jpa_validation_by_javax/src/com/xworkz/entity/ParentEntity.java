package com.xworkz.entity;

import java.time.LocalDate;

import javax.persistence.MappedSuperclass;
import javax.persistence.PreUpdate;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public class ParentEntity {

	@NotNull(message = "enter valid createdBy")
	private String createdBy;
	
	private LocalDate createdDate;

	@NotNull(message = "enter valid updatedBy")
	private String updatedBy;

	private LocalDate updatedDate;

	public ParentEntity() {

	}

	public ParentEntity(String createdBy, LocalDate createdDate, String updatedBy, LocalDate updatedDate) {
		super();
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public LocalDate getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDate updatedDate) {
		this.updatedDate = updatedDate;
	}

}
