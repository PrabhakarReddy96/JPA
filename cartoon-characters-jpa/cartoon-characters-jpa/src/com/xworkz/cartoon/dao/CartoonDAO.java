package com.xworkz.cartoon.dao;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

import com.xworkz.cartoon.entity.CartoonEntity;

public interface CartoonDAO {

	default boolean save(List<CartoonEntity> entity) {
		return false;
	}

	default CartoonEntity findByName(String name) {
		return null;
	}

	default int totalCount() {
		return 0;

	}

	default LocalDateTime findByMaxCreateDate() {
		return null;

	}

	default CartoonEntity findByNameAndCountryAndGenderAndAuthor(String name, String country, String gender,
			String author) {
		return null;
	}

	default String findAuthorByName(String name) {
		return name;

	}

	default Object[] findNameAndCountryByAuthor(String author) {
		return null;

	}

	default LocalDateTime findCreatedDateByAuthor(String author) {
		return null;

	}

	default void updateAuthorByName(String newAuthor, String name) {

	}

	default void updateTypeByName(String type, String name) {
	}

	default void deleteByName(String name) {
	}

	default List<CartoonEntity> findAll() {
		return Collections.emptyList();

	}

	default List<CartoonEntity> findAllByAuthor(String author) {
		return Collections.emptyList();

	}

	default List<CartoonEntity> findAllByAuthorAndGender(String author, String gender) {
		return Collections.emptyList();

	}

	default List<String> findAllName() {
		return Collections.emptyList();

	}

	default List<String> findAllCountry() {
		return Collections.emptyList();

	}

	default List<Object[]> findAllNameAndCountry() {
		return Collections.emptyList();

	}

	default List<Object[]> findAllNameAndCountryAndAuthor() {
		return Collections.emptyList();

	}

}
