package chapter02;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Ex12 {
	public static String toString(LocalDate date) {
		String year = date.getYear() + "��";
		String month = date.getMonthValue() + "��";
		String day = date.getDayOfMonth() + "��";
		
		return year + " " + month + " " + day;
	}
	public static void main(String[] args) {
		LocalTime time1 = LocalTime.of(0, 0, 0);
		LocalTime time2 = LocalTime.of(9, 12, 34);
		
		//�� ���� ���̸� �� ���� ����
		Duration duration = Duration.between(time1, time2);
		
		//�ʴ��� ����
		long second = duration.get(ChronoUnit.SECONDS);
		
		//������ ���� ���� / �и���(1/1000), ����ũ����(1/1000000), ������(1/100000000)
		long nano = duration.get(ChronoUnit.NANOS);
		
		//0�� 0�� 0�� ������ ���� �ִ� ��ü ����
		LocalTime time = LocalTime.of(0, 0, 0);
		//�� ���� ���̸�ŭ �ʸ� ����
		time = time.plusSeconds(second);
		
		System.out.println(time.getHour()+ "�ð�" + time.getMinute() + "��" + time.getSecond() + "�� ����");
		
		
//		long hour = second / 3600;
//		long min = (second - (hour * 3600)) / 60;
//		second = second - (hour*60*60) - (min*60);
//		
//		System.out.println(hour + "�ð� " + min + "�� " + second + "�� ����");
//		
//	
//		System.out.println(second);
//		System.out.println(nano);
//		
//	
		
//		LocalDate date1 = LocalDate.of(2020, 1, 19);
//		LocalDate date2 = LocalDate.now();
//		
//		//1�� 2���� 11��
//		Period period = Period.between(date1, date2);
//		System.out.println(period);
//		
//		//1��
//		long year = period.get(ChronoUnit.YEARS);
//		System.out.println(year);
//		
//		//2����
//		long month = period.get(ChronoUnit.MONTHS);
//		System.out.println(month);
//		
//		//11��
//		long day = period.get(ChronoUnit.DAYS);
//		System.out.println(day);
//		
//		//��¥�� ���̸� �ϴ����� ���� �ִ� ����
//		long dayPeriod = (year *365) + (month * 30) +day;
//		//��¥�� ���̸� ������ ������ ���� �ִ� ����
//		long monthPeriod = (year * 12) + month;
//		
//		
//		String date1String = toString(date1);
//		String date2String = toString(date2);
//		String periodString = year + "�� " + month + "���� " + day + "�� ���̰����ϴ�.";
//	
//		
//		
//		System.out.println(date1String + "�� " + date2String + "�� " + periodString);
//		System.out.println(date1String + "�� " + date2String + "�� " + dayPeriod + "�� ���̰� ���ϴ�.");
//		System.out.println(date1String + "�� " + date2String + "�� " + monthPeriod + "���� ���̰� ���ϴ�.");
//	
		
		
	}

}
