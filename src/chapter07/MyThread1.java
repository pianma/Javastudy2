package chapter07;

public class MyThread1 implements Runnable {
	
	@Override
	public static run() {
		long[] time = new long[2];
		
		long start = System.currentTimeMillis();
	
			//ù ��° �۾��� �����ϱ� ���� �ð�
		long start = System.currentTimeMillis()	;
		
		int count = 0;
		for(int i =0 ; i< 10000; i++) {
			count++;
			
			if(count%50==0){
				System.out.println();
			
			}//end if
			
			System.out.println("-");
		
		}//end for
		
		//ù��° �۾����� �ð�
		long end = System.currentTimeMillis();
		
		//ù��° �۾��� �ҿ� �ð�
		time[0] = end - start;
		
		//�� ��° �۾��� �����ϱ� ���� �ð�
		 start = System.currentTimeMillis()	;
		
		count = 0;
		for(int i =0 ; i< 10000; i++) {
			count++;
			
			if(count%50==0){
				System.out.println();
			
			}//end if
			
			System.out.println("-");
		
		}
		System.out.println("�ҿ�ð�1 = " + time[0]);
		System.out.println("�ҿ�ð�2 = " + time[1]);
	}
}
