package chapter07;

//Ŭ������ ���� -> Ʋ
//�����带 ���� -> �������� Ʋ
public class MyThread implements Runnable {

   @Override
   public void run() {
			//�����尡 �����ؾߵ� �۾�
	   System.out.println(Thread.currentThread().getName()  + " start ! ");
	   
	   try {
	   int result = 10 / 0;
	   System.out.println(result);
		}
	   catch(ArithmeticException e){
		   System.out.println("���ܹ߻�");
	   }
   }
}
