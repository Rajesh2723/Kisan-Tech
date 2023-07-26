package SerialLi_deserial;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serializatipm_se_Deseri {

	public static void main(String[] args) {
		Employee emp=new Employee("rajesh", 1000, true);
		try(FileOutputStream fileOut=new FileOutputStream("emp.dat");
				ObjectOutputStream out=new ObjectOutputStream(fileOut);){
			out.writeObject(emp);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
/////////for this we have to create the empoyee class and its as follows

package SerialLi_deserial;

import java.io.Serializable;

public class Employee implements Serializable{
	 
	private static final long serialVersionUID = 1L;
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
