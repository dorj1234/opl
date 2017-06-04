package dorj.openlegacy.com.service;

import javax.persistence.*;

import dorj.openlegacy.com.Customer;

public class CreateCustomer {

	public static void main(String[] args) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("h2openlegacydb");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		Customer customer = new Customer();
		customer.setCustomerId(777);
		customer.setCustomerName("Dor Juravski test");
		customer.setCustomerNumber("052-3870974 test");
		customer.setCustomerAddress("Ben Gurion 59, Gedera 70700 test");
		
		entitymanager.persist(customer);
		entitymanager.getTransaction().commit();
		entitymanager.close();
		emfactory.close();
	}

}
