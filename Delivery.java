package com.epam.part2.unit0;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Delivery {
	private List<Order> orders = new ArrayList <Order>();

}


public class Order{
	private String customerName;
	private String customerAddress;
	private Date orderDate;
	private String orderTime;

	private String paymentMethod;
	private String orderStatus;
	
	private List<Dish> dishes = new ArrayList<Dish>();
}

public class Dish{
	private String type;
	private int quantity;
	private int cookingTime;
}