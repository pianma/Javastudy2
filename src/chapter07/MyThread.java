package chapter07;

//클래스를 정의 -> 틀
//쓰래드를 정의 -> 쓰래드의 틀
public class MyThread implements Runnable {

   @Override
   public void run() {
			//쓰레드가 수행해야될 작업
	   System.out.println(Thread.currentThread().getName()  + " start ! ");
	   
	   try {
	   int result = 10 / 0;
	   System.out.println(result);
		}
	   catch(ArithmeticException e){
		   System.out.println("에외발생");
	   }
   }
}
