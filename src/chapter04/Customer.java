package chapter04;

import java.util.HashMap;
import java.util.Map;

public class Customer {
	
	private String tel;
	private String paymentMethod;
	
	public Customer(String tel, String paymentMethod) {
		this.tel = tel;
		this.paymentMethod = paymentMethod;
		
		Customer customer1 = new Customer("010-1473-3698", "����");
		Customer customer2 = new Customer("010-1598-7894", "ī��");
		Customer customer3 = new Customer("010-4564-1236", "ī�� ");
		Customer customer4 = new Customer("010-4516-1856", "����");
		Customer customer5 = new Customer("010-4862-2845", "����");
		
		Map<String, String> customerList = new HashMap<>();
		customerList.put("ȫ�浿", customer1);
		customerList.put("��ö��", customer1);
		customerList.put("����", customer1);
		customerList.put("������ȣ", customer1);
		customerList.put("Ȳ����", customer1);
		
	}

}
