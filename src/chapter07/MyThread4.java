package chapter07;

public class MyThread4 implements Runnable {
	@Override
	public void run() {
		for(int i = 1 ; i <= 10 ; i ++) {
			System.out.println(i);
			
			try {
				Thread.sleep(1000);
			}
		}
	}
}
