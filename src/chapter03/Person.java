package chapter03;

//E - Element
//k - Key
//V - Value
//T - Type
//N - Nnumber
public class Person <T> {
	
	private int eye;
	
	private int nose;
	
	private int mouth;
	
	private  T  id;
	
	private T tel;
	
	
	
	public void  add(T val1, T val2) {
		System.out.println(1);
	}
	
	public void setID(T id) {
		this.id = id;
	}
	
	public T getID() {
		return id;
	}

	

	public Person(T tel) {
		this.tel = tel;
	}
	
	public void setTel(T tel) {
		this.tel= tel;	
	}
	
}
