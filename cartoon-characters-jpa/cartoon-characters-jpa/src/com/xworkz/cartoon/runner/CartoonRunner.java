package com.xworkz.cartoon.runner;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.metamodel.SetAttribute;

import com.xworkz.cartoon.dao.CartoonDAO;
import com.xworkz.cartoon.dao.CartoonDAOImpl;
import com.xworkz.cartoon.entity.CartoonEntity;

public class CartoonRunner {

	public static void main(String[] args) {

//		CartoonEntity entity1 = new CartoonEntity("Reddy", LocalDateTime.now(), "Prabha", LocalDateTime.now(),
//				"pluto", "america", "male", "walk disney", "animated");
//		CartoonEntity entity2 = new CartoonEntity("Reddy", LocalDateTime.now(), "Prabha", LocalDateTime.now(),
//				"Mickey Mouse", "england", "male", "Les Clark", "animated");
//		CartoonEntity entity3 = new CartoonEntity("Reddy", LocalDateTime.now(), "Prabha", LocalDateTime.now(),
//				"lola bunny", "america", "female", "leo benvenuti", "animated");
//		CartoonEntity entity4 = new CartoonEntity("Reddy", LocalDateTime.now(), "Prabha", LocalDateTime.now(),
//				"tweety", "australia", "male", "thomos mckimson", "animated");
//		CartoonEntity entity5 = new CartoonEntity("Reddy", LocalDateTime.now(), "Prabha", LocalDateTime.now(),
//				"tweety bird", "wi", "male", "bob clampett", "animated");
//		CartoonEntity entity6 = new CartoonEntity("Reddy", LocalDateTime.now(), "Prabha", LocalDateTime.now(),
//				"Donald duck", "south america", "male", "walt disney", "animated");
//		CartoonEntity entity7 = new CartoonEntity("Reddy", LocalDateTime.now(), "Prabha", LocalDateTime.now(),
//				"goofy", "newzeland", "male", "tom palmer", "animated");
//		CartoonEntity entity8 = new CartoonEntity("Reddy", LocalDateTime.now(), "Prabha", LocalDateTime.now(),
//				"winnei the pooh", "eng", "male", "AA milne", "animated");
//		CartoonEntity entity9 = new CartoonEntity("Reddy", LocalDateTime.now(), "Prabha", LocalDateTime.now(),
//				"pete", "usa", "male", "ub iwerks", "animated");
//		CartoonEntity entity10 = new CartoonEntity("Reddy", LocalDateTime.now(), "Prabha", LocalDateTime.now(),
//				"Charlie Brown", "australia", "male", "charles M", "animated");
//
//		List<CartoonEntity> entities = new ArrayList<>();
//		entities.add(entity1);
//		entities.add(entity2);
//		entities.add(entity3);
//		entities.add(entity4);
//		entities.add(entity5);
//		entities.add(entity6);
//		entities.add(entity7);
//		entities.add(entity8);
//		entities.add(entity9);
//		entities.add(entity10);
//
		CartoonDAO dao = new CartoonDAOImpl();
//		System.out.println("============================1] save================================");
//		 boolean save=dao.save(entities);
//		 System.out.println(save);

		System.out.println("============================2] findByName================================");
		CartoonEntity entity = dao.findByName("pluto");
		System.out.println(entity);

		System.out.println("============================3] totalCount================================");
		int total = dao.totalCount();
		System.out.println("Total count: " + total);

		System.out.println("============================4] findByMaxCreateDate================================");
		LocalDateTime time = dao.findByMaxCreateDate();
		System.out.println("MaxCreatedDate: " + time);

		System.out.println(
				"============================5] findByNameAndCountryAndGenderAndAuthor================================");
		CartoonEntity name = dao.findByNameAndCountryAndGenderAndAuthor("tweety", "australia", "male", "sweety");
		System.out.println(name);

		System.out.println("============================6] findAuthorByName================================");
		String author = dao.findAuthorByName("pluto");
		System.out.println("Author: " + author);

		System.out.println("============================7] findNameAndCountryByAuthor================================");
		Object[] objects = dao.findNameAndCountryByAuthor("ub iwerks");
		System.out.println("Name: " + objects[0]);
		System.out.println("Country: " + objects[1]);

		System.out.println("============================8] findCreatedDateByAuthor================================");
		LocalDateTime createDateTime = dao.findCreatedDateByAuthor("tom palmer");
		System.out.println("CreatedDateAndName: " + createDateTime);

		System.out.println("============================9] updateAuthorByName================================");
		dao.updateAuthorByName("sweety", "tweety");

		System.out.println("============================10] updateTypeByName================================");
		dao.updateTypeByName("animated", "tweety");

		System.out.println("============================11] deleteByName================================");
		dao.deleteByName("Charlie Brown");

		System.out.println("============================12] findAll================================");
		dao.findAll().forEach(System.out::println);

		System.out.println("============================13] findAllByAuthor================================");
		dao.findAllByAuthor("AA milne").forEach(System.out::println);

		System.out.println("============================14] findAllByAuthorAndGender================================");
		dao.findAllByAuthorAndGender("AA milne", "male").forEach(System.out::println);

		System.out.println("============================15] findAllName================================");
		dao.findAllName().forEach(System.out::println);

		System.out.println("============================16] findAllCountry================================");
		dao.findAllCountry().forEach(System.out::println);

		System.out.println("============================17] findAllNameAndCountry================================");
		List<Object[]> nameCountry = dao.findAllNameAndCountry();

		System.out.println(
				"============================18] findAllNameAndCountryAndAuthor================================");
		dao.findAllNameAndCountryAndAuthor();

	}

}
