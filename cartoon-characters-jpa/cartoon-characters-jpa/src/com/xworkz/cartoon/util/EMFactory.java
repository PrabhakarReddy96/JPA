package com.xworkz.cartoon.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import lombok.Getter;

public class EMFactory {

	private static EntityManagerFactory factory;

	public static EntityManagerFactory getFactory() {
		return factory;
	}

	static {
		factory = Persistence.createEntityManagerFactory("com.xworkz");
		System.out.println("creating util entityManagerFactory");
	}
}
