package polymorphism;

public class Hot extends Temprature {
	
	@Override
	void waterState() {
		System.out.println("water is boiling");
		super.waterState();
	}
	

}

