package com.epam.part2.unit0;

import java.util.ArrayList;
import java.util.List;

public class TestingSystem {
	private List<Student> students = new ArrayList <Student>();
	private List<Task> tasks = new ArrayList <Task>();
	

}


public class Task {
	private String subject; // предмет
	private String level;
	private int code;  // уникальный код таска
}

public class Student{
	private String name;
	private List<String> subjects =new ArrayList<String>(); //  список предметов, которые изучает студент
	private String level;
	
}