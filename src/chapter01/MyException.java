package chapter01;

//������ ���� Ŭ������ ����
//MyExcpetion�� ArrayIndexOutofBoundsException ��� ������ ���ܰ� �ȴ�.
public class MyException extends Exception {
	//����ȭ
	private static final long serialVersionUID = -548694543534L;

	//msg -> ���ܰ� �� �߻��ߴ���, ������
	public MyException(String msg) {
		super(msg);
		
	}
}
