package chapter02;

import java.util.Calendar;

public class Ex02 {

	public static void main(String[] args) {
		
		//현재의 날짜와 시간정보를 갖고있는 인스턴스
		Calendar calendar = Calendar.getInstance();
		
		System.out.println("올 해 : " + calendar.get(Calendar.YEAR));
		//Calendar클래스는 월을 0부터 샌다.
		//0~11월까지 존재하므로 사용할 때는 1을 더해서 사용해야한다.
		System.out.println("이번 달 : "+ (calendar.get(Calendar.MONTH)+1));
		System.out.println("오늘의 이번 달 주차 : " + calendar.get(Calendar.WEEK_OF_MONTH));
		
		//이번달의 오늘의 날짜
		System.out.println("오늘의 날짜 : " + calendar.get(Calendar.DAY_OF_MONTH));
		//올해의 오늘의 날짜(1월 1일 기준)
		System.out.println("오늘의 날짜 : " + calendar.get(Calendar.DAY_OF_YEAR));
		// 1-일요일 7-토요일
		System.out.println("오늘의 요일 : " + calendar.get(Calendar.DAY_OF_WEEK));
		
		System.out.println("시: " + calendar.get(Calendar.HOUR));
		System.out.println("분: " + calendar.get(Calendar.MINUTE));
		System.out.println("초: " + calendar.get(Calendar.SECOND));
		
		System.out.println("이 달의 마지막 날 : " + calendar.getActualMaximum(Calendar.DATE));
		
		//Calendar 클래스의 인스턴스를 이용해서 오늘의 요일을 숫자가아닌 문자열로 출력
		int dayOfweek= calendar.get(Calendar.DAY_OF_WEEK);
		String[] weekName = {"", "일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};
		System.out.println("오늘의 요일 : " + weekName[dayOfweek]);
	}
	}
	
}
