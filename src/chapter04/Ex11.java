package chapter04;

import java.util.HashMap;
import java.util.Map;

public class Ex11 {

	public static void main(String[] args) {
		Map<String, Integer> classOneKor = new HashMap<>();
		
		
		classOneKor.put("ȫ�浿", 95);	
		classOneKor.put("��ö��", 18);
		classOneKor.put("����", 86);
		classOneKor.put("������ȣ", 36);
		classOneKor.put("Ȳ����", 69);
		
		System.out.println("�ʱ� ���� : " + classOneKor);
		//put �޼��带 ����� �� �̹� �����ϴ� Ű�� �����͸� �����ϸ�
		//�ش� Ű�� ����ִ� �����Ͱ� ���������.
		classOneKor.put("ȫ�浿", 73);
		
		System.out.println("key = ȫ�浿, value = 73 �߰� : " + classOneKor);
		
		
		
	}

}
