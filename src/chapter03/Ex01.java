package chapter03;

public class Ex01 {

	public static void main(String[] args) {
		
		//<Object>��������.
		ClassName<Object> object1 = new ClassName<>();
		
		//<String>�� �����ϸ� genericŸ���� string���� �ν��Ͻ� ����
		ClassName<String> object2 = new ClassName<>();
		
		//<Integer>�� �����ϸ� genericŸ���� integer���� �ν��Ͻ� ����
		ClassName<Integer>object3 = new ClassName<>();
		
		//<Double>�� �����ϸ� genericŸ���� double���� �ν��Ͻ� ����
		ClassName<Double>object4 = new ClassName<>();
		
		
		//���׸� Ÿ�� �ڸ����� �⺻ ������Ÿ���� �� �� ����
		//���׸� Ÿ�� �ڸ����� Ŭ������ �� ���� �ִ�.
		//�⺻ ������ Ÿ���� Ŭ������ �����ξ���.
		//����, �Ǽ�, ���ڸ� ���׸� Ÿ�� �ڸ��� ������
//		//�⺻ ������ Ÿ���� Ŭ������ ������ Ŭ������ ����ؾ��Ѵ�.
//		Person<Integer> p3 = new Person<>();
//		
//		p3.setID(10);
//		
//		int Id = p3.getID();
//		
		
		Person<String> p1 = new Person<>("123-4567-4866");
		Person<Integer> p2 = new Person<>(1012345678);
		
		
	}

}
