package chapter04;

import java.util.ArrayList;
import java.util.List;

public class Ex04 {

	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<>();
		
		for(int i = 1; i<=10; i++) {
			intList.add(i);
		}
		
		System.out.println(intList.get(2));
		
		Integer el1 = intList.get(5);
		System.out.println(el1);
		
		int el2 = intList.get(5);
		System.out.println(el2);
	}

}
