package tutsviews.lms.domain.author;

import javax.persistence.Embeddable;


@Embeddable 
public class AuthorAddress {
	
    private String street; 
    
    private String city; 
    
    private String state;
    
    private String zipCode;

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}


	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public AuthorAddress() {
		super();
	}

	public AuthorAddress(String street, String city, String state, String zipCode) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return "AuthorAddress [street=" + street + ", city=" + city + ", state=" + state + ", zipCode=" + zipCode + "]";
	}
    
    
	
    
}