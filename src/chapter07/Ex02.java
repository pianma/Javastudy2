package chapter07;

public class Ex02 {
	public static void main(String[] args) {
		Thread thread = new Thread(new MyThread1());
		
		//�̱۽����忡�� 2���� �۾��� �ҿ��ϴµ� �ɸ��ð� = 450��
		thread.start();
	}
}
