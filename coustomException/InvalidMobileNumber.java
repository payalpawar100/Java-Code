package coustomException;

@SuppressWarnings("serial")
public class InvalidMobileNumber extends RuntimeException {
	public InvalidMobileNumber(String msg) {
		super(msg);

	}

}
