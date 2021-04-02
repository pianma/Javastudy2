package chapter05;

public class Ex05 {
	@Deprecated
	public static final int oldValue = 10;
	
	@Deprecated
	public static void oldMethod() {
		System.out.println("old");
	}
	
	
	public static final int newValue = 11;
	
	public static void newMethod() {
		System.out.println("new");
	}
	
	public static void main(String[] args) {
		System.out.println(Ex05.oldValue);
		Ex05.oldMethod();
		
		System.out.println(Ex05.newValue);
		Ex05.newMethod();
	}

}
