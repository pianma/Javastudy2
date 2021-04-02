package chapter08;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args) {
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null;
		
		
		//�Է� ��Ʈ�� - ���α׷��� �ٱ����� ������
		//ByteArray - �޸��� �����͸� ��/����ϴµ� ����ϴ� Ŭ����
		
		ByteArrayInputStream input = new ByteArrayInputStream(inSrc);
		
		//��� ��Ʈ�� - ���α׷��� �ȿ��� �ٱ����� 
		ByteArrayOutputStream output = new ByteArrayOutputStream();

		
//		while((data = input.read()) != -1) {
//			output.write(data);
//		}
		while(true) {
			int data = input.read();
			if(data==-1) {
				break;
			}
			output.write(data);
			
		}
		
		outSrc = output.toByteArray();
		System.out.println("Input Source = " + Arrays.toString(inSrc));
		System.out.println("Output Source = " + Arrays.toString(outSrc));
	}

}
