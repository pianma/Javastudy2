package chapter07;

import javax.swing.JOptionPane;

public class Ex05 {

	public static void main(String[] args) {
		Thread thread = new Thread(new MyThre	ad4));
		
		thread.start();
		
		String input = JOptionPane.showInputDialog("�ƹ� ���̳� �Է��ϼ���");
		System.out.println("�Է��Ͻ� ���� " + input + "�Դϴ�.");
	}

}
