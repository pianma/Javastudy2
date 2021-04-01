package chapter04;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex08 {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		Set<String> lyricsSet = new HashSet<>();
		
		while(true) {
		System.out.println("노래 가사를 입력하세요. (종료 : -1) : ");
		
		String lyrics = scanf.next();
		if(lyrics.equals("-1")) {
			break;
		}
		
		if(lyricsSet.add(lyrics)){
			
		}else {
			System.out.println("이미 입력된 가사입니다. => " + lyrics );
		}
		System.out.println();
	}
}
}

