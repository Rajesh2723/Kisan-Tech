package Ex13LambdaExpression;

 

@FunctionalInterface
interface Callable{
	void call();
}
//class Telehone implements Callable{
//
//	@Override
//	public void call() {
//		 System.out.println("call someone");
//		
//	}
//	
//}
@FunctionalInterface
interface Addable{
	int add(int num1,int num2);
}
public class LambdaExpressionDemo {

	public static void main(String[] args) {
		   Callable c=()->{
			   System.out.println("welcome to the labda expression");
		   };
		   c.call();
//        Addable addbale = (int num1,int num2)->{
//        	return num1+num2;
//        };
//        Addable addbale = ( num1, num2)->{
//        	return num1+num2;
//        };
		   //syntax 3
		   Addable addbale = ( num1, num2)->num1+num2;
        
        System.out.println("answer:"+addbale.add(100,200));
	}
}

