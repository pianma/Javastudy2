package chapter02;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ex09 {

	public static void main(String[] args) {
		LocalDateTime dateTime = LocalDateTime.now();
		
		dateTime = LocalDateTime.of(2020, 01, 19, 00, 00, 00);
		
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		
		//합치기
		dateTime = LocalDateTime.of(date, time);
		System.out.println(dateTime);
		
		//쪼개기
		date = dateTime.toLocalDate();
		System.out.println(date);
		
		time = dateTime.toLocalTime();
		System.out.println(time);
		
		dateTime = date.atTime(time);
		System.out.println(dateTime);
		
		dateTime = time.atDate(date);
		System.out.println(dateTime);
	}

}
