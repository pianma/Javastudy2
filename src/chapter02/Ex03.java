package chapter02;

import java.util.Calendar;

public class Ex03 {
	
	static final int DAY_IN_SECOND = 24*60*60;
	static final int HOUR_IN_SECOND = 60*60;
	static final int MINTE_IN_SECOND = 60;
	

	public static void main(String[] args) {
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		
		//Calendar�� ���� 0���� ī������ ��
		cal1.set(2021,Calendar.JANUARY,1);
		cal2.set(2021,Calendar.JANUARY,2);
		
		long cal1ToSecond = cal1.getTimeInMillis();
		long cal2Tosecond = cal2.getTimeInMillis();
		
		long difference =  cal2Tosecond- cal1ToSecond;
		difference = difference/1000;
		
		System.out.println(difference + "�ʰ� �귶���ϴ�.");
		
		//�ʴ����� �� ������ ȯ��
		int period = (int) (difference/DAY_IN_SECOND);
		System.out.println(period + "�� ���");
		
		//�ʴ����� �ð� ������ ȯ��
		int period2 = (int) (difference / HOUR_IN_SECOND);
		System.out.println(period2 + "�ð� ���");
		
		//�ʴ����� �� ������ ȯ��
		int period3 = (int)(difference/MINTE_IN_SECOND);
		System.out.println(period3 + "�� ���");
	}

}
