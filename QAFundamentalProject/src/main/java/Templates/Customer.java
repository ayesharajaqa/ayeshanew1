package Templates;

public class Customer {
	
	private int customer_id;
	
	private String 
		customer_first, 
		customer_last,
		customer_addr_1,
		customer_addr_2,
		customer_city,
		customer_county,
		customer_country,
		customer_postcode,
		customer_email,
		customer_tel;
	
	//private ArrayList<Product> cart;
	
	public Customer() {
		//Default Constructor
	}
	
	public Customer(String customer_first, String customer_last, String customer_addr_1, String customer_addr_2, String customer_city, String customer_county, String customer_country, String customer_postcode, String customer_email, String customer_tel) {
		this.customer_first = customer_first;
		this.customer_first = customer_last;
		this.customer_first = customer_addr_1;
		this.customer_first = customer_addr_2;
		this.customer_first = customer_city;
		this.customer_first = customer_county;
		this.customer_first = customer_country;
		this.customer_first = customer_postcode;
		this.customer_first = customer_email;
		this.customer_first = customer_tel;
	}
	
	public Customer(int customer_id, String customer_first, String customer_last, String customer_addr_1, String customer_addr_2, String customer_city, String customer_county, String customer_country, String customer_postcode, String customer_email, String customer_tel) {
		this.customer_id = customer_id;
		this.customer_first = customer_first;
		this.customer_first = customer_last;
		this.customer_first = customer_addr_1;
		this.customer_first = customer_addr_2;
		this.customer_first = customer_city;
		this.customer_first = customer_county;
		this.customer_first = customer_country;
		this.customer_first = customer_postcode;
		this.customer_first = customer_email;
		this.customer_first = customer_tel;
	}
	
}
