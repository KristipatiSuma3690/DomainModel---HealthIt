package com.healthit.service;

import java.util.List;

import com.healthit.model.Fruits;

public interface IFruitService {
	void addFruit(Fruits fruits);
	void updateFruit(double price,int fruitId);
	void deleteFruit(int fruitId);
	
	List<Fruits> getAllFruits();
	List<Fruits> getByFruitName(String fruitName);
	List<Fruits> getByRegion(String region);
	List<Fruits> getByPrice(double price);
	List<Fruits> getByFruitNameAndType(String fruitName,String fruitType);
	List<Fruits> getByFruitNameAndRegion(String fruitName,String region);
	Fruits getById(int fruitId);

}
