package chapter01;

public class WrongIndexException extends Exception {
	private static final long serialVersionUID = -548694543534L;
	
	public WrongIndexException(String msg) {
		super(msg);
	}
}
