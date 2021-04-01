package chapter04;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex07 {

	public static void main(String[] args) {
		//�����ϴ� �������� ������ ���������� ����
		Set<Integer> hashSet = new HashSet<>();
		
		
		hashSet.add(1);
		hashSet.add(3);
		hashSet.add(5);
		hashSet.add(7);
		System.out.println("�ʱ� ���� : " + hashSet);
		
		//�־����մ°��� ������� ����.
		hashSet.add(1);
		System.out.println("��� 1�� �߰� : " + hashSet);
		
		boolean isAdd = hashSet.add(7);
		if(isAdd) {
			System.out.println("��� 7�� �߰� : " + hashSet);
		}
		
		isAdd = hashSet.add(9);
		if(isAdd) {
			System.out.println("��� 9�� �߰� : " + hashSet);
		}
		
		hashSet.remove(1);
		System.out.println("��� 1�� ���� : " + hashSet);
		
		Iterator<Integer> iterator = hashSet.iterator();
		while(iterator.hasNext()) {
			Integer el = iterator.next();
			
			System.out.println(el);
		}
		
	}

}
