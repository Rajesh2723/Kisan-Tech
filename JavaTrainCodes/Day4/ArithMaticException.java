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
