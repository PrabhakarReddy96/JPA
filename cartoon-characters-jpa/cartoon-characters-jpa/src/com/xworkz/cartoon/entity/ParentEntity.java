package com.xworkz.cartoon.entity;

import java.time.LocalDateTime;

import javax.persistence.MappedSuperclass;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public class ParentEntity {

	private String createdBy;
	private LocalDateTime createDateTime;
	private String updatedBy;
	private LocalDateTime updateDateTime;
	
	public ParentEntity() {
		// TODO Auto-generated constructor stub
	}
	
	
	

	/**
	 * @param createdBy
	 * @param createDateTime
	 * @param updatedBy
	 * @param updateDateTime
	 */
	public ParentEntity(String createdBy, LocalDateTime createDateTime, String updatedBy,
			LocalDateTime updateDateTime) {
		super();
		this.createdBy = createdBy;
		this.createDateTime = createDateTime;
		this.updatedBy = updatedBy;
		this.updateDateTime = updateDateTime;
	}




	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public LocalDateTime getCreateDateTime() {
		return createDateTime;
	}

	public void setCreateDateTime(LocalDateTime createDateTime) {
		this.createDateTime = createDateTime;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public LocalDateTime getUpdateDateTime() {
		return updateDateTime;
	}

	public void setUpdateDateTime(LocalDateTime updateDateTime) {
		this.updateDateTime = updateDateTime;
	}

}
