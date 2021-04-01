package chapter04;

public class Ex06 {

	public static void main(String[] args) {
		Passenger p1 = new Passenger("홍길동", "010-7591-8524", "이코노미");
		Passenger p2 = new Passenger("홍길동", "010-7591-8524", "이코노미");
		
		//두 인스턴스의 이름이 같다.
		
		String p1Name = p1.getName();
		String p2Name = p2.getName();
		boolean nameSame = p1Name.equals(p2Name);
		
		
		//두 인스턴스의 연락처가 같다
		
		String tel1 = p1.getTel();
		String tel2 = p2.gteTel();
		boolean telSame = tel1.equals(tel2);
		
		//두 인스턴스의 좌석등급이 같다.
		
		String seat1 = p1.getSeat();
		String seat2 = p2.getSeat();
		boolean seatSame = seat1.equals(seat2);
		
		//이름과 연락처와 좌석등급 모두 같다면 true
		
		if(nameSame && telSame && seatSame) {
			
		}
		
		//해시코드사용
		boolean same = p1.hashCode() == p2.hashCode();
		if(same) {
			System.out.println("p1과 p2가 같습니다.");
		}else {
			System.out.println("p1과 p2가 다릅니다.");
		}
		
		//그렇지 않다면 false
		boolean same =  p1==p2   ;
		if(same) {
			System.out.println("p1과 p2가 같습니다.");
		}else {
			System.out.println("p1과 p2가 다릅니다.");
		}
	}

}
