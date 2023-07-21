package Ex10;

public class Throws {
	static void withdrawel(double balance,double widthdran) throws ArithmeticException{
		if(balance>=widthdran) {
			System.out.println("fine");
		}else {
			
			ArithmeticException a=new ArithmeticException("Balance is too low");
			throw a;
		}
		
	}
	public static void main(String[] args) {
		System.out.println("start");
		double balance=10000;
		double widthdrawn=12000;
		try {
			withdrawel(balance, widthdrawn);
		} catch (ArithmeticException e) {
			System.out.println("1");
			e.printStackTrace();
		}
		System.out.println("complete");
		
	}

}
/////////////age one
package Ex10;

public class AgeThrows {
	static void validate(int age) throws ArithmeticException{
		if(age>=18) {
			System.out.println("fine");
		}else {
			
			ArithmeticException a=new ArithmeticException("age is less than 18");
			throw a;
		}
	}
	public static void main(String[] args) {
		System.out.println("start");
		 int age=10;
		try {
			validate(age);
		} catch (ArithmeticException e) {
			System.out.println("1");
			e.printStackTrace();
		}
		System.out.println("complete");

	}

}
//////////////functional interface haing exactly one abstract class havin non conreate
package Function_interface;

@FunctionalInterface
interface Callable{
	void call();
}
class Telehone implements Callable{

	@Override
	public void call() {
		 System.out.println("call someone");
		
	}
	
}
public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		 Callable v=new Telehone();
		 v.call();
	}

}
