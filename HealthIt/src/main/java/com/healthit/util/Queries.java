package com.healthit.util;

public class Queries {
	public static final String CREATETABLE="create table fruits(fruitName varchar(100),fruitId Integer primary key ,fruitType varchar(50),category varchar(50),region varchar(50),price double)";
	public static final String INSERTQUERY="insert into fruits(fruitName,fruitId,fruitType,category,region,price) values (?,?,?,?,?,?)";
	public static final String UPDATEQUERY="update fruits set price=? where fruitId=?";
	public static final String DELETEQUERY="delete from fruits where fruitId=?";
	public static final String FINDALLFRUITS="select * from fruits";
	public static final String FINDBYFRUITNAME="select * from fruits where fruitName like ?";
	public static final String FINDBYREGION="select * from fruits where region like ?";
	public static final String FINDBYPRICE="select * from fruits where price=?";
	public static final String FINDBYFRUITNAMEANDTYPE="select * from fruits where fruitName like ? and fruitType like ?";
	public static final String FINDBYFRUITNAMEANDREGION="select * from fruits where fruitName like ? and region like ?";
	public static final String FINDBYFRUITID="select * from fruits where fruitId=?";
}
