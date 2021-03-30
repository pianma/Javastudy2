package chapter02;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ex06 {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		
		Date date = calendar.getTime();
		
		SimpleDateFormat sdf;
		
		//y-�� , M-��, d-��
		//yyyy -> ���� ����ϴµ� 4�ڸ��� ����϶�
		//MM -> ���� ����ϴµ� ���ڸ����� ���� ����ض�
		//dd -> ���� ����ϴµ� ���ڸ��� �Ϸ� ����ض�
		sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(date));
		
		sdf = new SimpleDateFormat("yyyy�� MM�� dd��");
		System.out.println(sdf.format(calendar));
		
		sdf = new SimpleDateFormat("yy�� M�� d�� HH:mm:ss");
		System.out.println(sdf.format(date));
		
		sdf = new SimpleDateFormat("yy�� M�� d�� H:m:s");
		System.out.println(sdf.format(date));
		
		sdf = new SimpleDateFormat("yy�� M�� d�� h:m:s.SSS");
		System.out.println(sdf.format(date));
		
		sdf = new SimpleDateFormat("yy�� M�� d�� h:m:s.SSS a");
		System.out.println(sdf.format(date));
		
		
		
		
		
		
	}

}
