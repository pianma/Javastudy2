package chapter07;

public class Ex01 {

	public static void main(String[] args) {
		Thread thread = new Thread(new MyThread());
		
		thread.start();
		
		//thread.start(); �ѹ��� �����Ű�� �����߻�
		//�ѹ��� �����ų���� �ѹ��� ȣ���ؾ���
		
		thread = new Thread(new MyThread());
		
		thread.start();
		
	}

}
