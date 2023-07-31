package NishiAssignmentQuestions;

public class Member {
	private String name;
	private int age;
	private int phoneNumber;
	private String Address;
	private double salary;
	public Member(String name, int age, int phoneNumber, String address, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
		Address = address;
		this.salary = salary;
	}
	public Member() {
		super();
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
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void printSalary() {
		System.out.println(getClass());
		System.out.println(  getAddress());
		System.out.println( getPhoneNumber());
		System.out.println( getName());
	}
	
	 

}
------------------------
  package NishiAssignmentQuestions;

public class Employee extends Member{
		private String specialization;

		public Employee(String name, int age, int phoneNumber, String address, double salary, String specialization) {
			super(name, age, phoneNumber, address, salary);
			this.specialization = specialization;
		}

		public String getSpecialization() {
			return specialization;
		}

		public void setSpecialization(String specialization) {
			this.specialization = specialization;
		}
		
		
}
-------------------
  package NishiAssignmentQuestions;

public class Manager extends Member {
	private String department;

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Manager(String name, int age, int phoneNumber, String address, double salary, String department) {
		super(name, age, phoneNumber, address, salary);
		this.department = department;
	}

	@Override
	public String toString() {
		return "Manager [department=" + department + "]";
	}
	
}
--------------
 package NishiAssignmentQuestions;

public class Main {

	public static void main(String[] args) {
		 Member s=new Employee("Rakesh",27,99012009,"bangalore",100.0090,"Farming");
		 s.printSalary();
		 Member k=new  Manager("Rajesh", 24, 99457, "Bangalore", 10000000.909, "CS");
		 s.printSalary();
	}

}
 
