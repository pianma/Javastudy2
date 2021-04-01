package chapter04;

import java.util.HashMap;
import java.util.Map;

public class Customer {
	
	private String tel;
	private String paymentMethod;
	
	public Customer(String tel, String paymentMethod) {
		this.tel = tel;
		this.paymentMethod = paymentMethod;
		
		Customer customer1 = new Customer("010-1473-3698", "Çö±Ý");
		Customer customer2 = new Customer("010-1598-7894", "Ä«µå");
		Customer customer3 = new Customer("010-4564-1236", "Ä«µå ");
		Customer customer4 = new Customer("010-4516-1856", "Çö±Ý");
		Customer customer5 = new Customer("010-4862-2845", "Çö±Ý");
		
		Map<String, String> customerList = new HashMap<>();
		customerList.put("È«±æµ¿", customer1);
		customerList.put("±èÃ¶¼ö", customer1);
		customerList.put("°í¿µÈñ", customer1);
		customerList.put("À¯³ëÀ±È£", customer1);
		customerList.put("È²±¤Èñ", customer1);
		
	}

}
