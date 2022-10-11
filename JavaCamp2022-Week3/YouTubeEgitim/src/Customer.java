
public class Customer {
	
	public Customer() {
		System.out.println("Müşteri nesnesi başlatıldı.");
	}

	private int Id;
	private String FirstName;
	private String LastName;
	private String NationalIdentity;
	private String City;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getNationalIdentity() {
		return NationalIdentity;
	}
	public void setNationalIdentity(String nationalIdentity) {
		NationalIdentity = nationalIdentity;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	
	
	
	
	
}
