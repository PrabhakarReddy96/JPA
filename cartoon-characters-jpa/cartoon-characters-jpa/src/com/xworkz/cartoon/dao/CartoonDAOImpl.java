package com.xworkz.cartoon.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import com.xworkz.cartoon.entity.CartoonEntity;

import static com.xworkz.cartoon.util.EMFactory.*;

import java.time.LocalDateTime;
import java.util.List;

public class CartoonDAOImpl implements CartoonDAO {
	EntityManagerFactory factory = getFactory();

	@Override
	public boolean save(List<CartoonEntity> entity) {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			for (CartoonEntity cartoonEntity : entity) {
				manager.persist(cartoonEntity);
			}
			tx.commit();
		} catch (PersistenceException e) {
			e.printStackTrace();
			manager.getTransaction().rollback();
		} finally {
			manager.close();
		}
		return false;
	}

	@Override
	public CartoonEntity findByName(String name) {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			Query query = manager.createNamedQuery("findByName");
			query.setParameter("nm", name);
			Object object = query.getSingleResult();
			if (object != null) {
				CartoonEntity entity = (CartoonEntity) object;
				return entity;
			}

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return CartoonDAO.super.findByName(name);
	}

	@Override
	public int totalCount() {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			Query query = manager.createNamedQuery("totalCount");
			// query.setParameter("dat", date);
			Object object = query.getSingleResult();
			if (object != null) {
				Integer entity = Integer.parseInt(object.toString());
				return entity;
			}
		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return CartoonDAO.super.totalCount();
	}

	@Override
	public LocalDateTime findByMaxCreateDate() {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			Query query = manager.createNamedQuery("findByMaxCreateDate");
			// query.setParameter("dat", date);
			Object object = query.getSingleResult();
			if (object != null) {
				LocalDateTime entity = (LocalDateTime) object;
				return entity;
			}
		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return CartoonDAO.super.findByMaxCreateDate();
	}

	@Override
	public CartoonEntity findByNameAndCountryAndGenderAndAuthor(String name, String country, String gender,
			String author) {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			Query query = manager.createNamedQuery("findByNameAndCountryAndGenderAndAuthor");
			query.setParameter("nm", name);
			query.setParameter("cou", country);
			query.setParameter("gen", gender);
			query.setParameter("aut", author);
			Object object = query.getSingleResult();
			if (object != null) {
				CartoonEntity entity = (CartoonEntity) object;
				return entity;
			}

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return CartoonDAO.super.findByNameAndCountryAndGenderAndAuthor(name, country, gender, author);
	}

	@Override
	public String findAuthorByName(String name) {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			Query query = manager.createNamedQuery("findAuthorByName");
			query.setParameter("nm", name);
			Object object = query.getSingleResult();
			if (object != null) {
				String entity = (String) object;
				return entity;
			}

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return CartoonDAO.super.findAuthorByName(name);
	}

	@Override
	public Object[] findNameAndCountryByAuthor(String author) {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			Query query = manager.createNamedQuery("findNameAndCountryByAuthor");
			query.setParameter("aut", author);
			Object object = query.getSingleResult();
			if (object != null) {
				Object[] entity = (Object[]) object;
				return entity;
			}

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return CartoonDAO.super.findNameAndCountryByAuthor(author);
	}

	@Override
	public LocalDateTime findCreatedDateByAuthor(String author) {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			Query query = manager.createNamedQuery("findCreatedDateByAuthor");
			query.setParameter("aut", author);
			Object object = query.getSingleResult();
			if (object != null) {
				LocalDateTime entity = (LocalDateTime) object;
				return entity;
			}
		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return CartoonDAO.super.findCreatedDateByAuthor(author);
	}

	@Override
	public void updateAuthorByName(String newAuthor, String name) {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			EntityTransaction txEntityTransaction = manager.getTransaction();
			txEntityTransaction.begin();
			Query query = manager.createNamedQuery("updateAuthorByName");
			query.setParameter("aut", newAuthor);
			query.setParameter("nm", name);
			// manager.flush();
			int integer = query.executeUpdate();
			System.out.println(integer);
			txEntityTransaction.commit();
			// manager.clear();
		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		CartoonDAO.super.updateAuthorByName(newAuthor, name);
	}

	@Override
	public void updateTypeByName(String type, String name) {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			EntityTransaction txEntityTransaction = manager.getTransaction();
			txEntityTransaction.begin();
			Query query = manager.createNamedQuery("updateTypeByName");
			query.setParameter("ty", type);
			query.setParameter("nm", name);
			// manager.flush();
			int integer = query.executeUpdate();
			System.out.println(integer);
			txEntityTransaction.commit();
			// manager.clear();
		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		CartoonDAO.super.updateTypeByName(type, name);
	}

	@Override
	public void deleteByName(String name) {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			EntityTransaction txEntityTransaction = manager.getTransaction();
			txEntityTransaction.begin();
			Query query = manager.createNamedQuery("deleteByName");
			query.setParameter("nm", name);
			// manager.flush();
			int integer = query.executeUpdate();
			System.out.println(integer);
			txEntityTransaction.commit();
			// manager.clear();
		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		CartoonDAO.super.deleteByName(name);
	}

	@Override
	public List<CartoonEntity> findAll() {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			Query query = manager.createNamedQuery("findAll");
			List<CartoonEntity> entities = query.getResultList();
			return entities;

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return CartoonDAO.super.findAll();
	}

	@Override
	public List<CartoonEntity> findAllByAuthor(String author) {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			Query query = manager.createNamedQuery("findAllByAuthor");
			query.setParameter("aut", author);
			List<CartoonEntity> entities = query.getResultList();
			return entities;

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return CartoonDAO.super.findAllByAuthor(author);
	}

	@Override
	public List<CartoonEntity> findAllByAuthorAndGender(String author, String gender) {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			Query query = manager.createNamedQuery("findAllByAuthorAndGender");
			query.setParameter("aut", author);
			query.setParameter("gen", gender);
			List<CartoonEntity> entities = query.getResultList();
			return entities;

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return CartoonDAO.super.findAllByAuthorAndGender(author, gender);
	}

	@Override
	public List<String> findAllName() {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			Query query = manager.createNamedQuery("findAllName");
			List<String> entities = query.getResultList();
			return entities;

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return CartoonDAO.super.findAllName();
	}

	@Override
	public List<String> findAllCountry() {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			Query query = manager.createNamedQuery("findAllCountry");
			List<String> entities = query.getResultList();
			return entities;

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return CartoonDAO.super.findAllCountry();
	}

	@Override
	public List<Object[]> findAllNameAndCountry() {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			Query query = manager.createNamedQuery("findAllNameAndCountry");
			List<Object[]> entities = query.getResultList();
			for (Object[] objects : entities) {
				System.out.println("Name: " + objects[0] + "           " + "Country: " + objects[1]);
			}

		} catch (PersistenceException e) {
			e.printStackTrace();

		} finally {
			manager.close();
		}
		return CartoonDAO.super.findAllNameAndCountry();
	}

	@Override
	public List<Object[]> findAllNameAndCountryAndAuthor() {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			Query query = manager.createNamedQuery("findAllNameAndCountryAndAuthor");
			List<Object[]> entities = query.getResultList();
			for (Object[] objects : entities) {
				System.out.println("Name: " + objects[0] + "           " + "Country: " + objects[1] + "         "
						+ "Author: " + objects[2]);
			}

		} catch (PersistenceException e) {
			e.printStackTrace();

		} finally {
			manager.close();
		}
		return CartoonDAO.super.findAllNameAndCountryAndAuthor();
	}

}
