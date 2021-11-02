package com.epam.part2.unit0;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Hotel {
	private String name;
	private List<Room> rooms = new ArrayList<Room>();
	private List<Guest> guests = new ArrayList<Guest>();
	
	public List<Room> findAvailableRoom (Calendar date) {
		List<Room> result = new ArrayList<Room>();
		
		return result;
	};
	
	

}


public class Room {
	private int roomNum;
	private boolean isAvailable;
	private boolean seeView;
	
	public void ChekIn (Guest guest) {
		
	}

}

public class Guest{
	private String firstName;
	private String secondName;
	private Calendar chekInDate;
	private Calendar checkOutDate;
	
}