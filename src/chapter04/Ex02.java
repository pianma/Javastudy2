package chapter04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex02 {

	public static void main(String[] args) {
		List<Passenger> passengerList = new ArrayList<>();
		
		
		
		
		
	//ArrayList, LinkedLlist, stack, vector ...
	//ArrayList Ư¡ - �߰��� ����, ������ ����� ��Ȳ������ �������� �ڷᱸ��
	//				  �� �ڿ��� ����, ������ ����� ��Ȳ������ ������ �ڷᱸ��
	List<String> arrayList	= new ArrayList<>();
		
		arrayList.add("a");
		arrayList.add("b");
		arrayList.add("c");
		arrayList.add("f");
		System.out.println("�ʱ� ���� : " + arrayList);
		
		arrayList.add(1,"e");
		System.out.println("�ε��� 1��ġ�� e �߰� : " + arrayList);
		arrayList.add(3,"d");
		System.out.println("�ε��� 3��ġ�� d �߰� : " + arrayList);
		
		arrayList.remove(2);
		System.out.println("�ε��� 2 ��ġ�� �� ���� : " + arrayList);
		
		arrayList.remove(4);
		System.out.println("�ε��� 4 ��ġ�� �� ���� : " + arrayList);
		
		System.out.println("�ε��� 2 ��ġ�� �� ��ȯ : " + arrayList.get(2));
		
		System.out.println("�ε��� 3 ��ġ�� �� ��ȯ : " + arrayList.get(3));
		List<Integer> intList = new ArrayList<>();
		
		
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		intList.add(5);
		intList.add(6);
		intList.add(7);
		intList.add(8);
		intList.add(9);
		intList.add(10);
		System.out.println(intList);
		
		
		
		
		
		
		
		
		
		//arrayList = new LinkedList<>();
		
		
	}

}
