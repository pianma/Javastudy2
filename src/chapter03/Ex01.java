package chapter03;

public class Ex01 {

	public static void main(String[] args) {
		
		//<Object>생략가능.
		ClassName<Object> object1 = new ClassName<>();
		
		//<String>을 선언하면 generic타입이 string형인 인스턴스 생성
		ClassName<String> object2 = new ClassName<>();
		
		//<Integer>을 선언하면 generic타입이 integer형인 인스턴스 생성
		ClassName<Integer>object3 = new ClassName<>();
		
		//<Double>을 선언하면 generic타입이 double형인 인스턴스 생성
		ClassName<Double>object4 = new ClassName<>();
		
		
		//제네릭 타입 자리에는 기본 데이터타입은 들어갈 수 없음
		//제네릭 타입 자리에는 클래스만 올 수가 있다.
		//기본 데이터 타입을 클래스로 만들어두었다.
		//정수, 실수, 문자를 제네릭 타입 자리에 쓰려면
//		//기본 데이터 타입을 클래스로 만들어둔 클래스를 사용해야한다.
//		Person<Integer> p3 = new Person<>();
//		
//		p3.setID(10);
//		
//		int Id = p3.getID();
//		
		
		Person<String> p1 = new Person<>("123-4567-4866");
		Person<Integer> p2 = new Person<>(1012345678);
		
		
	}

}
