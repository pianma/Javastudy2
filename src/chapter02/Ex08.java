package chapter02;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class Ex08 {

	public static void main(String[] args) {
//		LocalTime time = LocalTime.now();
//		LocalDate date = LocalDate.now();
		LocalDate today = LocalDate.now();
		LocalDate yesterday = today.minusDays(1);
		
		System.out.println(today.isAfter(yesterday));
		System.out.println(today.isBefore(yesterday));
		
		System.out.println(yesterday.isAfter(today));
		System.out.println(yesterday.isAfter(today));
//		System.out.println(date.plusYears(1));
//		System.out.println(date.minusYears(1));
//		System.out.println(date.plusMonths(5));
//		System.out.println(date.plusDays(21));
//		
//		System.out.println(time.plusHours(2));
//		System.out.println(time.plusMinutes(20));
//
//		
//		
//		SYSTEM.OUT.PRINTLN("�� : " + TIME.GETHOUR());
//		SYSTEM.OUT.PRINTLN("�� : " + TIME.GETMINUTE());
//		SYSTEM.OUT.PRINTLN("�� : " + TIME.GETSECOND());
//		
		//date ��ü�� Tear �ʵ� ���� 2022�� �ٲ��
		//date ��ü�� ���� �ִ� ��, �� ���� �״�� �����ϰ� YEAR �ʵ��� ���� 2022�� �ٲ�� ��.
		//year- 2022, month - date��ü�� ���� �ִ� ��, day- date��ü�� ���� �ִ� ��/ �� ���� �ִ�
		//���ο� LocalDate ��ü�� ��ȯ
//		LOCALDATE NEWDATE = DATE.WITH(CHRONOFIELD.YEAR, 2022);
//		SYSTEM.OUT.PRINTLN(NEWDATE);
//		
//		SYSTEM.OUT.PRINTLN(DATE.WITH(CHRONOFIELD.MONTH_OF_YEAR,7));
//		
//		SYSTEM.OUT.PRINTLN(DATE.WITH(CHRONOFIELD.DAY_OF_MONTH,21));
//		
//		SYSTEM.OUT.PRINTLN(TIME.WITH(CHRONOFIELD.HOUR_OF_DAY,11));
//		
//		SYSTEM.OUT.PRINTLN(TIME.WITH(CHRONOFIELD.MINUTE_OF_HOUR,11));
//		
//		SYSTEM.OUT.PRINTLN(TIME.WITH(CHRONOFIELD.SECOND_OF_MINUTE,11));
//		
		
		
//		LocalDate date = LocalDate.now();
//		
//		System.out.println("���� = " + date.getYear());
//		
//		System.out.println("�̹� �� = " + date.getMonth());
//		System.out.println("�̹� �� = " + date.getMonthValue());
//		
//		System.out.println("������ ��¥ = " + date.getDayOfMonth());
//		System.out.println("1�� 1�Ϻ��� ����� �� �� = " + date.getDayOfYear());
//		
//		System.out.println("������ ���� = " + date.getDayOfWeek());
//		
//		System.out.println("�̹� ���� �� �� = " + date.lengthOfMonth());
//		System.out.println("������ �� �� = " + date.lengthOfYear());
//		
//		System.out.println("������ ���� ���� = " + date.isLeapYear());
	}

}
