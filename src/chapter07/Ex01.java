package chapter07;

public class Ex01 {

	public static void main(String[] args) {
		Thread thread = new Thread(new MyThread());
		
		thread.start();
		
		//thread.start(); 한번더 실행시키면 에러발생
		//한번더 실행시킬려면 한번더 호출해야함
		
		thread = new Thread(new MyThread());
		
		thread.start();
		
	}

}
