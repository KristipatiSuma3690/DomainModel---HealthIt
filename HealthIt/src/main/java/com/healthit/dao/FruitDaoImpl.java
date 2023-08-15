package com.healthit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.healthit.model.Fruits;
import com.healthit.util.DBConnection;
import com.healthit.util.Queries;

public class FruitDaoImpl implements IFruitDao{

	@Override
	public void addFruit(Fruits fruits) {
		try {Connection connection = DBConnection.openConnection();
				PreparedStatement statement = connection.prepareStatement(Queries.INSERTQUERY);
			statement.setString(1, fruits.getFruitName());
			statement.setInt(2, fruits.getFruitId());
			statement.setString(3, fruits.getFruitType());
			statement.setString(4, fruits.getCategory());
			statement.setString(5, fruits.getRegion());			
			statement.setDouble(6, fruits.getPrice());
			statement.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void updateFruit(double price, int fruitId) {
		try (
			Connection connection = DBConnection.openConnection();
		
			PreparedStatement statement = connection.prepareStatement(Queries.UPDATEQUERY)){
			
			statement.setInt(2, fruitId);			
			statement.setDouble(1, price);
			statement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteFruit(int fruitId) {
		try (Connection connection = DBConnection.openConnection();
				PreparedStatement statement = connection.prepareStatement(Queries.DELETEQUERY)) {
			
			statement.setInt(1, fruitId);			
			statement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Fruits> findAllFruits() {
		Connection connection=DBConnection.openConnection();
		PreparedStatement statement=null;
		List<Fruits> fruitList=new ArrayList<>();
		try {
			statement=connection.prepareStatement(Queries.FINDALLFRUITS);
			ResultSet resultSet=statement.executeQuery();
			while(resultSet.next()) {
				String fruitName=resultSet.getString("fruitName");
				int fruitId=resultSet.getInt("fruitId");
				String fruitType=resultSet.getString("fruitType");
				String category=resultSet.getString("category");
				String region=resultSet.getString("region");
				double price=resultSet.getDouble("price");
				Fruits fruits=new Fruits(fruitName,fruitId,fruitType,category,region,price);
				fruitList.add(fruits);
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(statement!=null)
				try {
					statement.close();
				}catch(SQLException e) {
					System.out.println(e.getMessage());
				}
			DBConnection.closeConnection();
		}
		return fruitList;
	}

	@Override
	public List<Fruits> findByFruitName(String fruitName) {
		Connection connection=DBConnection.openConnection();
		PreparedStatement statement=null;
		List<Fruits> fruitList=new ArrayList<>();
		try {
			statement=connection.prepareStatement(Queries.FINDBYFRUITNAME);
			statement.setString(1, "%"+fruitName+"%");
			ResultSet resultSet=statement.executeQuery();
			while(resultSet.next()) {
				String Name=resultSet.getString("fruitName");
				int fruitId=resultSet.getInt("fruitId");
				String fruitType=resultSet.getString("fruitType");
				String category=resultSet.getString("category");
				String region=resultSet.getString("region");
				double price=resultSet.getDouble("price");
				Fruits fruits=new Fruits(Name,fruitId, fruitType,category,region,price);
				fruitList.add(fruits);
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(statement!=null)
				try {
					statement.close();
				}catch(SQLException e) {
					System.out.println(e.getMessage());
				}
			DBConnection.closeConnection();
		}
		return fruitList;
	}

	@Override
	public List<Fruits> findByRegion(String region) {
		Connection connection=DBConnection.openConnection();
		PreparedStatement statement=null;
		List<Fruits> fruitList=new ArrayList<>();
		try {
			statement=connection.prepareStatement(Queries.FINDBYREGION);
			statement.setString(1, "%"+region+"%");
			ResultSet resultSet=statement.executeQuery();
			while(resultSet.next()) {
				String Name=resultSet.getString("fruitName");
				int fruitId=resultSet.getInt("fruitId");
				String fruitType=resultSet.getString("fruitType");
				String category=resultSet.getString("category");
				String place=resultSet.getString("region");
				double price=resultSet.getDouble("price");
				Fruits fruits=new Fruits(Name,fruitId, fruitType,category,place,price);
				fruitList.add(fruits);
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(statement!=null)
				try {
					statement.close();
				}catch(SQLException e) {
					System.out.println(e.getMessage());
				}
			DBConnection.closeConnection();}
		return fruitList;
	}

	@Override
	public List<Fruits> findByPrice(double price) {
		Connection connection=DBConnection.openConnection();
		PreparedStatement statement=null;
		List<Fruits> fruitList=new ArrayList<>();
		try {
			statement=connection.prepareStatement(Queries.FINDBYPRICE);
			statement.setDouble(1, price);
			ResultSet resultSet=statement.executeQuery();
			while(resultSet.next()) {
				String Name=resultSet.getString("fruitName");
				int fruitId=resultSet.getInt("fruitId");
				String fruitType=resultSet.getString("fruitType");
				String category=resultSet.getString("category");
				String region=resultSet.getString("region");
				double cost=resultSet.getDouble("price");
				Fruits fruits=new Fruits(Name,fruitId, fruitType,category,region,cost);
				fruitList.add(fruits);
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(statement!=null)
				try {
					statement.close();
				}catch(SQLException e) {
					System.out.println(e.getMessage());
				}
			DBConnection.closeConnection();
		}
		return fruitList;
	}

	@Override
	public List<Fruits> findByFruitNameAndType(String fruitName, String fruitType) {
		Connection connection=DBConnection.openConnection();
		PreparedStatement statement=null;
		List<Fruits> fruitList=new ArrayList<>();
		try {
			statement=connection.prepareStatement(Queries.FINDBYFRUITNAMEANDTYPE);
			statement.setString(1, "%"+fruitName+"%");
			statement.setString(2, "%"+fruitType+"%");

			ResultSet resultSet=statement.executeQuery();
			while(resultSet.next()) {
				String Name=resultSet.getString("fruitName");
				int fruitId=resultSet.getInt("fruitId");
				String type=resultSet.getString("fruitType");
				String category=resultSet.getString("category");
				String region=resultSet.getString("region");
				double price=resultSet.getDouble("price");
				Fruits fruits=new Fruits(Name,fruitId, type,category,region,price);
				fruitList.add(fruits);
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(statement!=null)
				try {
					statement.close();
				}catch(SQLException e) {
					System.out.println(e.getMessage());
				}
			DBConnection.closeConnection();
		}
		return fruitList;
	}

	@Override
	public List<Fruits> findByFruitNameAndRegion(String fruitName, String region) {
		Connection connection=DBConnection.openConnection();
		PreparedStatement statement=null;
		List<Fruits> fruitList=new ArrayList<>();
		try {
			statement=connection.prepareStatement(Queries.FINDBYFRUITNAMEANDREGION);
			statement.setString(1, "%"+fruitName+"%");
			statement.setString(2, "%"+region+"%");

			ResultSet resultSet=statement.executeQuery();
			while(resultSet.next()) {
				String Name=resultSet.getString("fruitName");
				int fruitId=resultSet.getInt("fruitId");
				String fruitType=resultSet.getString("fruitType");
				String category=resultSet.getString("category");
				String place=resultSet.getString("region");
				double price=resultSet.getDouble("price");
				Fruits fruits=new Fruits(Name,fruitId, fruitType,category,place,price);
				fruitList.add(fruits);
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(statement!=null)
				try {
					statement.close();
				}catch(SQLException e) {
					System.out.println(e.getMessage());
				}
			DBConnection.closeConnection();
		}
		return fruitList;
	

	}

	@Override
	public Fruits findById(int fruitId) {
		Connection connection=DBConnection.openConnection();
		PreparedStatement statement=null;
		List<Fruits> fruitList=new ArrayList<>();
		Fruits fruit = null;
		try {
			statement=connection.prepareStatement(Queries.FINDBYFRUITID);
			statement.setInt(1, fruitId);

			ResultSet resultSet=statement.executeQuery();
			while(resultSet.next()) {
				String Name=resultSet.getString("fruitName");
				int Id=resultSet.getInt("fruitId");
				String fruitType=resultSet.getString("fruitType");
				String category=resultSet.getString("category");
				String region=resultSet.getString("region");
				double price=resultSet.getDouble("price");
				fruit=new Fruits(Name,Id, fruitType,category,region,price);
				
			}
			
		} catch (SQLException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}finally {
			if(statement!=null)
				try {
					statement.close();
				}catch(SQLException e) {
					System.out.println(e.getMessage());
				}
			DBConnection.closeConnection();
		}
		return fruit;
	}

}
