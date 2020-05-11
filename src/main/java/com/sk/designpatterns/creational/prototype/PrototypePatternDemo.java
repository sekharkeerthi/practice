package com.sk.designpatterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class PrototypePatternDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		String sql = "select * from movies";
		List<String> parameters = new ArrayList<String>() {{
			add("Star Wars");
		}};

		Record record = new Record();
		
		Statement statement = new Statement(sql, parameters, record);
		
		System.out.println(statement.getSql());
		System.out.println(statement.getParameters());
		System.out.println(statement.getRecord());
		
		Statement statement2 = statement.clone();
		
		System.out.println(statement2.getSql());
		System.out.println(statement2.getParameters());
		System.out.println(statement2.getRecord());
		
	}

}
