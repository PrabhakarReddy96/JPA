package com.xworkz.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.entity.BiriyaniEntity;

public class BiriyaniDAOImpl implements BiriyaniDAO {

	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");

	@Override
	public boolean save(BiriyaniEntity entity) {
		EntityManager manager =null;
		try {
			manager = factory.createEntityManager();
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			manager.persist(entity);
			tx.commit();

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return false;
	}

}
