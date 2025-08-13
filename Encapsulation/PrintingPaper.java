package encapsulation;

public class PrintingPaper {
	
	private void blackInk() {
		System.out.println("Adding ink..");
	}
	
	private void whitePaper() {
		System.out.println("get paper..");
	}
	
	public void printingPaper(int count) {
		
		blackInk();
		whitePaper();
		
		System.out.println("printing "+ count + " paper");
		
	}

}
