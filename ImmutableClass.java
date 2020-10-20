class Address implements Cloneable{
	private String street;
	private int postalCode;
	
	Address(String street, int postalCode) {
		super();
		this.street = street;
		this.postalCode = postalCode;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", postalCode=" + postalCode + "]";
	}
	
	public Object clone() throws CloneNotSupportedException {
	      return super.clone();
	   }
	
}
	

public final class ImmutableClass{
	private final String name;
	private final int age;
	private final Address address;
	public ImmutableClass(String name, int age, Address address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Address getAddress() throws CloneNotSupportedException {
		
		return (Address) address.clone();
	}

	@Override
	public String toString() {
		return "ImmutableClass [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
}


