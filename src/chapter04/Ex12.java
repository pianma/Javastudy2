package chapter04;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex12 {

	public static void main(String[] args) {
	Map<String, String> classOneKor = new HashMap<>();
		
		classOneKor.put("ȫ�浿", "���ڳ��");	
		classOneKor.put("��ö��", "�۽�Ʈ");
		classOneKor.put("����", "����Ͻ�");
		classOneKor.put("������ȣ", "�۽�Ʈ");
		classOneKor.put("Ȳ����", "���ڳ��");
		
		System.out.println("�ʱ� ���� : " + classOneKor);
		
		classOneKor.put("������ȣ", "���ڳ��");
		
		System.out.println("���� ���� : " + classOneKor);
		
		
		//Ȳ������ �¼�Ȯ��
		System.out.println("���� ���� : " + classOneKor.get("Ȳ����"));
		
		//���� �°����� ��� �¼� Ȯ��

		Set<String> keySet = hashMap.keySet();
		Iterator<String> iterator = keySet.iterator();
		while(iterator.hasNext()) {
			String key = iterator.next()	;
			
			System.out.println(key + " = " + hashMap.get(key));
		}
		
		
	}

}
