package chapter07;

public class Ex03 {

	public static void main(String[] args) {
		Thread thread1 = new Thread(new MyThread2());
		Thread thread2 = new Thread(new MyThread3());
		
		//��Ƽ������ ȯ�濡�� 2���� �۾��� ó���ϴµ� �ҿ�� �ð� = 660��
		thread1.start();
		thread2.start();
	}

}
