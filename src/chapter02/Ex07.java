package chapter02;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Ex07 {

	public static void main(String[] args) {
		
		//��ü�� Ÿ�Կ� Date �ܾ �����Ƿ� ��¥�� �ٷ��.
		LocalDate localDate = LocalDate.now();
		
		//��ü�� Ÿ�Կ� Time �ܾ �����Ƿ� �ð��� �ٷ��.
		LocalTime localTime = LocalTime.now();
		
		//��ü�� Ÿ�Կ� Date, Time �ܾ ��� �����Ƿ� ��¥�� �ð��� �ٷ��.
		LocalDateTime localDateTime = LocalDateTime.now();
		
		//Zone ->�ð���, Date ->��¥, Time ->�ð� / �ð������ ���� �ִ� ��¥�� �ð��� �ٷ��.
		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		
		System.out.println("==== ====");
		
		//2021 - 03 -25 ��¥�� ���� �ִ� ��ü
		LocalDate ld = LocalDate.of(2021,03,25);
		System.out.println(ld);
		
		// 1:12:34�ð��� ���� �ִ� ��ü
		LocalTime lt = LocalTime.of(1, 12,34);
		System.out.println(lt);
		
		//2021-03-25 1:12:34 ��¥�� �ð��� ���� �ִ� ��ü
		LocalDateTime ldt = LocalDateTime.of(ld, lt);
		System.out.println(ldt);
		
		//��¥, �ð� + �ð������ ���� �ִ� ��ü
		ZonedDateTime zdt = ZonedDateTime.of(ldt, ZoneId.of("Aisa/Seoul"));
		System.out.println(zdt);
	}

}
