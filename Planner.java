package com.epam.part2.unit0;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Planner {
	private List<Action> actions = new ArrayList<Action>();
	
	public void addNewAction (Action a) {}
	public void completeAction (Action a) {}
	public Action findAction (Date finishDate) {}
	
	

}


public class Action {
	private String actionName;
	private Date planedDate;
	private boolean isCompleted;
	private Date finishDate;
	
	public Action () {
		this.actionName="";
		this.finishDate=null;
	}
}