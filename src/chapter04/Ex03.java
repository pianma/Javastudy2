package chapter04;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex03 {

	public static void main(String[] args) {
		Set<Passenger> passengerList = new HashSet<>();
		
		Passenger passenger1 = new Passenger("홍길동", "010-5465-5466" , "이코노미");
		Passenger passenger2 = new Passenger("둘리", "010-5468-4185", "퍼스트");
		Passenger passenger3 = new Passenger("고영희", "010-5468-4886", "비즈니스");
		
		passengerList.add(passenger1);
		passengerList.add(passenger2);
		passengerList.add(passenger3);
		
		System.out.println(passengerList);
				
		
		//이름 -메튜 
		//연락처 - 010-7591 - 1534
		//등급 - 이코노미
		
		Passenger passenger0 = new Passenger("메튜", "010-7591-1534" , "이코노미");
	}

}
