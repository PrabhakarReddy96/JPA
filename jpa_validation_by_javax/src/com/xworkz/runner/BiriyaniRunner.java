package com.xworkz.runner;

import java.time.LocalDate;

import com.xworkz.entity.BiriyaniEntity;
import com.xworkz.serviecs.BiriyaniService;
import com.xworkz.serviecs.BiriyaniServiceImpl;

public class BiriyaniRunner {

	public static void main(String[] args) {

		BiriyaniEntity entity = new BiriyaniEntity();
		entity.setName("Reddyy");
		entity.setLocation("HSR LAYOUT");
		entity.setType("veg");
		entity.setPrice(50);
		entity.setCreatedBy("Prabha");
		entity.setCreatedDate(LocalDate.of(1196, 8, 30));
		entity.setUpdatedBy("Karthik");
		entity.setUpdatedDate(LocalDate.of(2022, 8, 30));

		BiriyaniService dao = new BiriyaniServiceImpl();
		boolean saved = dao.validateAndSave(entity);
		System.out.println(saved);
	}

}
