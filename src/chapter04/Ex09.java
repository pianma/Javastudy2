package chapter04;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex09 {

	public static void main(String[] args) {
		Set<Passenger> passengerList = new HashSet<>();
		
		Passenger p1 = new Passenger("ȫ�浿", "010-1234-5678", "���ڳ��");
		Passenger p2 = new Passenger("ȫ�浿", "010-1234-5678", "���ڳ��");
		
		passengerList.add(p1);
		
		p1.equals(p2.hashCode());
		//add�� �ϸ� ������ ����ִ� �����͵��� equals �޼��带 ȣ���ϴµ�
		//�Ű������� �߰��Ϸ��� �������� �ؽð����� ����
		passengerList.add(p2);
		
		System.out.println(passengerList);
		
		passengerList.remove(p1);
		System.out.println(passengerList);
		
		Iterator<Passenger> iterator = passengerList.iterator()	;
		
	}

}
