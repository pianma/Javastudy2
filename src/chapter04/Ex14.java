package chapter04;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex14 {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		
		//set은 get 메서드가 존재하지 않음
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//foreach
		//항상된 for문
		for(Integer i : set) {
			System.out.println(i);
		}
		
		
	}

}
