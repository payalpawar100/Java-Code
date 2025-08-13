package inheritance;

public class Cat extends Animal {
	
	@Override
	void sound() {
		System.out.println("cat mewww");
		super.sound();
	}

}
