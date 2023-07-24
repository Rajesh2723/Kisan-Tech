package Exo0.coll.list;

public class Employee {
	private String name;
	private double sal;
	private Boolean isPresent;
	public Employee(String name, double sal, Boolean isPresent) {
		super();
		this.name = name;
		this.sal = sal;
		this.isPresent = isPresent;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public Boolean getIsPresent() {
		return isPresent;
	}
	public void setIsPresent(Boolean isPresent) {
		this.isPresent = isPresent;
	}
	@Override
	public String toString() {
		return "\n Employee [name=" + name + ", sal=" + sal + ", isPresent=" + isPresent + "]";
	}
	
}
///here the main method related to the above class
package Exo0.coll.list;

import java.util.ArrayList;

public class EmployeeListDemo {

	public static void main(String[] args) {
		 ArrayList<Employee>empList=new ArrayList<Employee>();
		 empList.add(new Employee("Rajesh",10000,true));
		 System.out.println(empList);
		 empList.add(new Employee("Rakesh",10000,true));
		 empList.add(new Employee("Ramesh",10000,false));
		 empList.add(new Employee("Rabesh",10000,true));
		 empList.add(new Employee("Rasesh",10000,false));
		 empList.add(new Employee("Raiesh",10000,true));
		 System.out.println(empList);
		 Employee e=empList.get(2);
		 empList.get(2).setSal(600000);
		 System.out.println(empList);
//		 for(Employee emp:empList) {
//			 double CurrentSal=emp.getSal();
//			 double newSal=CurrentSal*1.3;
//			 emp.setSal(newSal);
//		 }
		 empList.forEach(employee->{
			 double CurrentSal=employee.getSal();
			 double newSal=CurrentSal*1.1;
			 employee.setSal(newSal);
		 });
	}

}
