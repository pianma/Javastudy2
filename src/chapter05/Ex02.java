package chapter05;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		String birth = "Jan";
		
		//�Ű������� ����� �̸��� �����ؼ�
		//�Ű������� ���޹��� �̸��� ���� �ִ� ����� ã�� �� ����
		BirthMonth birthMonth = BirthMonth.valueOf(birth);
		System.out.println(birthMonth);
		System.out.println(birthMonth.getkorMonth());

		
		
	}
	
}
