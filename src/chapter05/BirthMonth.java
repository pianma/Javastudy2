package chapter05;

import java.util.Scanner;

public enum BirthMonth {
	
	Jan("1월"), Feb("2월"), Mar("3월"), Apr("4월"), May("5월"),
	Jun("6월"), Jul("7월"), Aug("8월"), Sep("9월"), Oct("10월"),
	Nov("11월"), Dec("12월");
	
	private final String korMonth;
	BirthMonth(String korMonth){
		this.korMonth = korMonth;
	}
	
	public String getkorMonth() {
		return korMonth;
	}
	
	
	//사용자가 xx월을 입력했을때 해당하는 월의 상수를 반환하는 메서드
	public static BirthMonth getBirthMonth(String month) {
		BirthMonth[] birthMonthArr = BirthMonth.values();
		
		BirthMonth result = null;
		
		for(BirthMonth birthMonth : birthMonthArr) {
			//n번째 상사구 갖고 있는 데이터인 xx월 문자열을 저장
			String korMonth = birthMonth.getkorMonth()	;
		
			}
		if(month.equals(korMonth)) {
			result = birthMonth;
		}
	}
	return result;

}
