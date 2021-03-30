package chapter02;

import java.text.DecimalFormat;

public class Ex05 {

	public static void main(String[] args) {
		int balance = 468546846;
		
		//#(��) - 10����, .(��) - �Ҽ��� , ,(�޸�) - �޸� ���� �� ��ü
		DecimalFormat df = new DecimalFormat("#,###");
		String data = df.format(balance);
		System.out.println(df.format(balance));
		
		double avg = 87.546385;
		df = new DecimalFormat("#.##");
		System.out.println(df.format(avg));
		
	}

}
