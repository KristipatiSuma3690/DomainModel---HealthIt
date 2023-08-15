package com.healthit.dao;

import java.util.List;

import com.healthit.model.Fruits;

public interface IFruitDao {
	void addFruit(Fruits fruits);
	void updateFruit(double price,int fruitId);
	void deleteFruit(int fruitId);
	
	List<Fruits> findAllFruits();
	List<Fruits> findByFruitName(String fruitName);
	List<Fruits> findByRegion(String region);
	List<Fruits> findByPrice(double price);
	List<Fruits> findByFruitNameAndType(String fruitName,String fruitType);
	List<Fruits> findByFruitNameAndRegion(String fruitName,String region);
	Fruits findById(int fruitId);
	

}
