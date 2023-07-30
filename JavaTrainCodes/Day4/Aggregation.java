package Lambda;
class Address{
	private String street;
	private String city;
	private String state;
	
	public Address(String street,String city,String state) {
		this.street=street;
		this.city=city;
		this.state=state;
	}

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

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", state=" + state + "]";
	}
	
}
class Person{
	private String name;
	private int age;
	private Address address;
	
	public Person(String name,int age,Address address) {
		this.name=name;
		this.age=age;
		this.address=address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	  
}
public class Main {

	public static void main(String[] args) {
		Address address=new Address("Karnataka", "bangalore", "Devarabeesanahalli");
		Person p1=new Person("Rajesh", 25, address);
		
		 
		
		System.out.println("person name:"+p1.getName()+"address:"+p1.getAddress());
		System.out.println("persons city:"+p1.getAddress().getCity());
		System.out.println("persons city:"+p1.getAddress().getStreet());
		
	}

}
