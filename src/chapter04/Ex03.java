package chapter04;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex03 {

	public static void main(String[] args) {
		Set<Passenger> passengerList = new HashSet<>();
		
		Passenger passenger1 = new Passenger("ȫ�浿", "010-5465-5466" , "���ڳ��");
		Passenger passenger2 = new Passenger("�Ѹ�", "010-5468-4185", "�۽�Ʈ");
		Passenger passenger3 = new Passenger("����", "010-5468-4886", "����Ͻ�");
		
		passengerList.add(passenger1);
		passengerList.add(passenger2);
		passengerList.add(passenger3);
		
		System.out.println(passengerList);
				
		
		//�̸� -��Ʃ 
		//����ó - 010-7591 - 1534
		//��� - ���ڳ��
		
		Passenger passenger0 = new Passenger("��Ʃ", "010-7591-1534" , "���ڳ��");
	}

}
