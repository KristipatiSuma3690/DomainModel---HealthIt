package com.healthit.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.healthit.dao.FruitDaoImpl;
import com.healthit.dao.IFruitDao;
import com.healthit.exceptions.FruitNotFoundException;
import com.healthit.model.Fruits;

public class FruitServiceImpl implements IFruitService{
	IFruitDao fruitDao=new FruitDaoImpl();
	List<Fruits> fruits=new ArrayList<>();


	@Override
	public void addFruit(Fruits fruits) {
		fruitDao.addFruit(fruits);
		System.out.println("Added Successfully");
	}

	@Override
	public void updateFruit(double price, int fruitId){
		fruitDao.updateFruit(price, fruitId);
		System.out.println("Updated Successfully");
		
	}

	@Override
	public void deleteFruit(int fruitId) {
		fruitDao.deleteFruit(fruitId);
		System.out.println("Deleted Successfully");
	}

	@Override
	public List<Fruits> getAllFruits(){
		fruits=fruitDao.findAllFruits().stream().sorted((o1,o2)->o1.getFruitId().compareTo(o2.getFruitId()))
				.collect(Collectors.toList());
		return fruits;
		
		
	}

	@Override
	public List<Fruits> getByFruitName(String fruitName) {
		fruits.addAll(fruitDao.findByFruitName(fruitName));
		if(fruits.size()==0){
			throw new FruitNotFoundException("Fruit Not Found");
		}
		return fruits;
		

	}

	@Override
	public List<Fruits> getByRegion(String region) {
		fruits.addAll(fruitDao.findByRegion(region));
		if(fruits.size()==0){
			throw new FruitNotFoundException("Fruit Not Found");
		}
		return fruits;
	}

	@Override
	public List<Fruits> getByPrice(double price) {
		fruits.addAll(fruitDao.findByPrice(price));
		if(fruits.size()==0){
			throw new FruitNotFoundException("Fruit Not Found");
		}
		return fruits;
	}

	@Override
	public List<Fruits> getByFruitNameAndType(String fruitName, String fruitType) {
		fruits.addAll(fruitDao.findByFruitNameAndType(fruitName,fruitType));
		if(fruits.size()==0){
			throw new FruitNotFoundException("Fruit Not Found");
		}
		return fruits;
	}

	@Override
	public List<Fruits> getByFruitNameAndRegion(String fruitName, String region) {
		fruits.addAll(fruitDao.findByFruitNameAndRegion(fruitName,region));
		if(fruits.size()==0){
			throw new FruitNotFoundException("Fruit Not Found");
		}
		return fruits;
	}

	@Override
	public Fruits getById(int fruitId) {
		Fruits fruit=fruitDao.findById(fruitId);
		if(fruit==null) {
			throw new FruitNotFoundException("fruit Not Found");
		}
		return fruit;
	}

}
