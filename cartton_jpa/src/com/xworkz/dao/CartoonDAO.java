package com.xworkz.dao;

import java.util.List;

import com.xworkz.entity.CartoonEntity;

public interface CartoonDAO {

	boolean save(CartoonEntity entity);

	boolean saveAll(List<CartoonEntity> entity);

}
