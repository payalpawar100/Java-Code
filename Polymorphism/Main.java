package polymorphism;

public class Main {

	public static void main(String[] args) {
		
		Temprature t = new Hot();
		Temprature t1= new Cool();
		t.waterState();
		t1.waterState();

	}

}

