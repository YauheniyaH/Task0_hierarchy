package com.epam.part2.unit0;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VisitLog {
	private List <Visitor> visitors = new ArrayList<Visitor>();
	

}

public class Visitor{
	private String visitorName;
	private List<Visit> visitList = new ArrayList <Visit>();
	
	public void addPresence (Visitor v, Date date) {
		
	}
	
	public Visit findVisit (Date date) {}
}

public class Visit{
	private Date visitDate;
	private boolean visitPresence;
	
	
	
}