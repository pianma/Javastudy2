package chapter04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex02 {

	public static void main(String[] args) {
		List<Passenger> passengerList = new ArrayList<>();
		
		
		
		
		
	//ArrayList, LinkedLlist, stack, vector ...
	//ArrayList 특징 - 중간에 삽입, 삭제가 빈번한 상황에서는 부적합한 자료구조
	//				  맨 뒤에서 삽입, 삭제가 빈번한 상황에서는 적합한 자료구조
	List<String> arrayList	= new ArrayList<>();
		
		arrayList.add("a");
		arrayList.add("b");
		arrayList.add("c");
		arrayList.add("f");
		System.out.println("초기 상태 : " + arrayList);
		
		arrayList.add(1,"e");
		System.out.println("인덱스 1위치에 e 추가 : " + arrayList);
		arrayList.add(3,"d");
		System.out.println("인덱스 3위치에 d 추가 : " + arrayList);
		
		arrayList.remove(2);
		System.out.println("인덱스 2 위치의 값 삭제 : " + arrayList);
		
		arrayList.remove(4);
		System.out.println("인덱스 4 위치의 값 삭제 : " + arrayList);
		
		System.out.println("인덱스 2 위치의 값 반환 : " + arrayList.get(2));
		
		System.out.println("인덱스 3 위치의 값 반환 : " + arrayList.get(3));
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
