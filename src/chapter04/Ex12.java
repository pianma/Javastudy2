package chapter04;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex12 {

	public static void main(String[] args) {
	Map<String, String> classOneKor = new HashMap<>();
		
		classOneKor.put("홍길동", "이코노미");	
		classOneKor.put("김철수", "퍼스트");
		classOneKor.put("고영희", "비즈니스");
		classOneKor.put("유노윤호", "퍼스트");
		classOneKor.put("황광희", "이코노미");
		
		System.out.println("초기 상태 : " + classOneKor);
		
		classOneKor.put("유노윤호", "이코노미");
		
		System.out.println("변경 상태 : " + classOneKor);
		
		
		//황광희의 좌석확인
		System.out.println("변경 상태 : " + classOneKor.get("황광희"));
		
		//남은 승객들의 모든 좌석 확인

		Set<String> keySet = hashMap.keySet();
		Iterator<String> iterator = keySet.iterator();
		while(iterator.hasNext()) {
			String key = iterator.next()	;
			
			System.out.println(key + " = " + hashMap.get(key));
		}
		
		
	}

}
