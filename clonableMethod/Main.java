package com.clonableMethod;

public class Main {
	public static void main(String[] args) {
		try {
			Person p1 = new Person("abcd", 101);
			Person p2 = (Person) p1.clone();
			
			p1.display();
			p2.display();
			
			//modifying p2
			//p2.name ="xyz";
			//p2.id=102;
			
			p2.setId(103);
			p2.setName("raju");
			
			System.out.println("after modifying clone");
			p1.display();
			p2.display();
			

		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
