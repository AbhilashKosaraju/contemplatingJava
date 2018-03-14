package org.abhi.jdbc.model;

public class Circle {

	private int Id;
	private String name;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Circle(int Id,String name) {
		setId(Id);
		setName(name);
	}
	
}
