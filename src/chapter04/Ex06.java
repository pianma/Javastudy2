package chapter04;

public class Ex06 {

	public static void main(String[] args) {
		Passenger p1 = new Passenger("ȫ�浿", "010-7591-8524", "���ڳ��");
		Passenger p2 = new Passenger("ȫ�浿", "010-7591-8524", "���ڳ��");
		
		//�� �ν��Ͻ��� �̸��� ����.
		
		String p1Name = p1.getName();
		String p2Name = p2.getName();
		boolean nameSame = p1Name.equals(p2Name);
		
		
		//�� �ν��Ͻ��� ����ó�� ����
		
		String tel1 = p1.getTel();
		String tel2 = p2.gteTel();
		boolean telSame = tel1.equals(tel2);
		
		//�� �ν��Ͻ��� �¼������ ����.
		
		String seat1 = p1.getSeat();
		String seat2 = p2.getSeat();
		boolean seatSame = seat1.equals(seat2);
		
		//�̸��� ����ó�� �¼���� ��� ���ٸ� true
		
		if(nameSame && telSame && seatSame) {
			
		}
		
		//�ؽ��ڵ���
		boolean same = p1.hashCode() == p2.hashCode();
		if(same) {
			System.out.println("p1�� p2�� �����ϴ�.");
		}else {
			System.out.println("p1�� p2�� �ٸ��ϴ�.");
		}
		
		//�׷��� �ʴٸ� false
		boolean same =  p1==p2   ;
		if(same) {
			System.out.println("p1�� p2�� �����ϴ�.");
		}else {
			System.out.println("p1�� p2�� �ٸ��ϴ�.");
		}
	}

}
