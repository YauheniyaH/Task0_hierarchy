package com.epam.part2.unit0;

import java.util.ArrayList;
import java.util.List;

public class InternetStore {
	private List<Item> itemsInStore = new ArrayList <Item>();
	private List <Order> orders =new ArrayList<Order>();

}

public class Item {
	private String name;
	private double price;
	private String sku;
	private String location;
	private String type;
}


public class Order{
	private Customer customer;
	private List<Item> orderItems = new ArrayList <Item>();
	private String status;
	
	
}

public class Customer{
	private String name;
	private String deliveryAddress;
	private String email;
	
}