package chapter05;

import java.util.Scanner;

public enum BirthMonth {
	
	Jan("1��"), Feb("2��"), Mar("3��"), Apr("4��"), May("5��"),
	Jun("6��"), Jul("7��"), Aug("8��"), Sep("9��"), Oct("10��"),
	Nov("11��"), Dec("12��");
	
	private final String korMonth;
	BirthMonth(String korMonth){
		this.korMonth = korMonth;
	}
	
	public String getkorMonth() {
		return korMonth;
	}
	
	
	//����ڰ� xx���� �Է������� �ش��ϴ� ���� ����� ��ȯ�ϴ� �޼���
	public static BirthMonth getBirthMonth(String month) {
		BirthMonth[] birthMonthArr = BirthMonth.values();
		
		BirthMonth result = null;
		
		for(BirthMonth birthMonth : birthMonthArr) {
			//n��° ��籸 ���� �ִ� �������� xx�� ���ڿ��� ����
			String korMonth = birthMonth.getkorMonth()	;
		
			}
		if(month.equals(korMonth)) {
			result = birthMonth;
		}
	}
	return result;

}
