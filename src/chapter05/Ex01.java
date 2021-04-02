package chapter05;

public class Ex01 {

	public static void main(String[] args) {
		System.out.println(Gender.MALE);
		System.out.println(Gender.FEMALE);
		
		Gender[] genderArr = Gender.values();
		for(int i = 0; i <genderArr.length; i ++) {
			Gender gender = genderArr[i];
			System.out.println(genderArr[i]);
		}
		
		for(Gender gender : genderArr) {
			System.out.println(gender);
		}
		
		//BirthMonth Enum의 모든 상수를 출력하세요.
		
		
		BirthMonth[] birthArr = BirthMonth.values()	;
		for(int i = 0; i < birthArr.length; i++) {
			BirthMonth birth = birthArr[i];
			System.out.println(birthArr[i] );
		}
}
}
