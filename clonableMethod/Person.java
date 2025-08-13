package com.clonableMethod;

public class Person implements Cloneable {
	
	private String name;
	private int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Person(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	//The clone() method is protected to restrict its use. By default, it’s not accessible from outside the class hierarchy (or package). This prevents accidental cloning of objects.
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	public void display() {
		System.out.println("Name:"+name+"  id:"+id);
	}
	

}
