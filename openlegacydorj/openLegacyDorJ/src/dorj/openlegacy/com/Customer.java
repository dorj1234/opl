package dorj.openlegacy.com;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Customer
 *
 */

@Entity
@Table
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int customer_id;
	private String customer_name;
	private String phone_number;
	private String address;
	
	private static final long serialVersionUID = 1L;	
	public Customer() {
		super();
	} 
	
   public int getCustomerId() {
	   return customer_id;
   }
   public void setCustomerId(int in_id) {
	   this.customer_id = in_id;
   }
   
   public String getCustomerName() {
	   return customer_name;
   }
   public void setCustomerName(String in_name) {
	   this.customer_name = in_name;
   }
   
   public String getCustomerNumber() {
	   return phone_number;
   }
   public void setCustomerNumber(String in_number){
	   this.phone_number = in_number;
   }
   
   public String getCustomerAddress() {
	   return address;
   }
   public void setCustomerAddress(String in_address) {
	   this.address = in_address;
   }
   
   @Override
   public String toString() {
	   return "Customer [id=" + customer_id + ", name=" + customer_name + ", phone number=" + phone_number + ", address=" + address;
   }
}
