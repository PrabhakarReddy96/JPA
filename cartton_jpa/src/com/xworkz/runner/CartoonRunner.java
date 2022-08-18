package com.xworkz.runner;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

import com.xworkz.dao.CartoonDAO;
import com.xworkz.dao.CartoonDAOImpl;
import com.xworkz.entity.CartoonEntity;

public class CartoonRunner {

	public static void main(String[] args) {

		CartoonEntity cartoon = new CartoonEntity();
		cartoon.setCreatedBy("Reddy");
		cartoon.setCreatedDate(LocalDate.now());
		cartoon.setUpdatedBy("prabha");
		cartoon.setUpdatedDate(LocalDate.now());
		cartoon.setName("Tom and Jerry");
		cartoon.setCountry("india");
		cartoon.setAnimater("Reddy");
		cartoon.setStartingTime(LocalTime.of(8, 30));
		cartoon.setDuration(LocalTime.of(1, 30));
		

		CartoonDAO dao = new CartoonDAOImpl();
		boolean saved = dao.save(cartoon);
		System.out.println(saved);
	}

}
