package polymorphism;

public class Cool extends Temprature{
	@Override
	void waterState() {
		System.out.println("water become ice");
		super.waterState();
	}

}
