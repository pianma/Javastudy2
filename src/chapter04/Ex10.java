package chapter04;

import java.util.Iterator;
import java.util.Set;

public class Ex10 {

	public static void main(String[] args) {
		Set<Passenger> passengerList = new hashSet<>();
		
		Passenger p1 = new Passenger("ȫ�浿", "010-1473-3698", "���ڳ��");
		Passenger p2 = new Passenger("��ö��", "010-1598-7894", "�۽�Ʈ");
		Passenger p3 = new Passenger("����", "010-4569-1236", "����Ͻ�");
		Passenger p4 = new Passenger("������ȣ", "010-2568-2584", "�۽�Ʈ");
		Passenger p5 = new Passenger("Ȳ����", "010-7418-5296", "���ڳ��");
		
		passengerList.add(p1);
		passengerList.add(p2);
		passengerList.add(p3);
		passengerList.add(p4);
		passengerList.add(p5);
		
		//Iterator�� ����ؼ� ��� �°��� ������ ����ϼ���.
		Iterator<Passenger> iterator = passengerList.iterator();
		while(iterator.hasNext()) {
			Passenger passenger = iterator.next();
			System.out.println("�̸� : " + passenger.getName());
			System.out.println("����ó : " + passenger.getTel() );
			System.out.println("�ּ� : " + passenger.getSeat());
			
		}
		
		
	}

}
