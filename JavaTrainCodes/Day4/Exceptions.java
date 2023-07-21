package Ex10;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class CompilerTimeException {

	public static void main(String[] args) {
		 System.out.println("Start");
		 try {
			 FileOutputStream f=new FileOutputStream("data.txt");
			 
		 }catch(FileNotFoundException f) {
			 System.out.println("could not locate the file");
		 }
		 System.out.println("complete");
	}
	

}
///////////////////////////interface example
package Ex11;

public interface Taxable {
	double salesTax=7;
	double incomeTax=10.5;
	
	double calcTax();
	
}
class Employee implements Taxable{
	int empid;
	String name;
	double salary;
	@Override
	
	 
	public double calcTax() {
		
		double ans=salary*12;
		double final1=ans*incomeTax/100;
		return final1;
	}
	public Employee(int empid, String name, double salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}
}
class Product implements Taxable{
	int pid;
	double price;
	double qty;
	
	
	public Product(int pid, double price, double qty) {
		super();
		this.pid = pid;
		this.price = price;
		this.qty = qty;
	}


	@Override
	public double calcTax() {
		 
		return qty*price;
	}
	
}
class Main{
	public static void main(String[] args) {
		Employee e1=new Employee(10, "rajesh", 1000);
		e1.calcTax();
		System.out.println("calcvalue:"+e1.calcTax());
		}
}
 

