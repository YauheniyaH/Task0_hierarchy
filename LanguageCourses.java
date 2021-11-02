package com.epam.part2.unit0;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LanguageCourses {
	private List<Course> courses = new ArrayList <Course>();

}


public class Course {
	private String language;
	private String type;
	private Date startDate;
	private Date endDate;
	private String lector;
	private String level;
	private int hours;
	private List<Task> tasks = new ArrayList <Task>();
}

public class Task {
	private String language;
	private int num;
	private String content;
	private String level;
}