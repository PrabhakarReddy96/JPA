package com.xworkz.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.entity.CartoonEntity;

public class CartoonDAOImpl implements CartoonDAO {
	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");

	@Override
	public boolean save(CartoonEntity entity) {
		try {
			EntityManager manager = factory.createEntityManager();
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			manager.persist(entity);
			tx.commit();
			manager.close();
		} catch (PersistenceException e) {
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean saveAll(List<CartoonEntity> entity) {
		try {
			EntityManager manager = factory.createEntityManager();
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			for (CartoonEntity cartoonEntity : entity) {
				manager.persist(cartoonEntity);
			}
		} catch (PersistenceException e) {
			e.printStackTrace();

			System.out.println("SavedAll Cartoon Data");
		} finally {
			return false;
		}

	}
}
