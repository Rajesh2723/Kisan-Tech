package Ex005.math_ref.instance;

 

interface Callable{
	void call();
} 
class Example{
	void greet() {
		System.out.println("Heyy there how are you");
	}
}
public class InstanceMethodRef {
		public static void main(String[] args) {
//			 Callable c=()->{
//				   System.out.println("welcome to the labda expression");
//			   };
//			   c.call();
			Example ex=new Example();
			Callable c1=ex::greet;
			c1.call();
		}
}
////static method references
package Ex005.math_ref.stat;


interface Addable{
	 int Add(int num1,int num2);
}
interface Example{
	static int addTwo(int n1,int n2) {
		return n1+n2;
	}
}
public class StaticMethodRef {

	public static void main(String[] args) {
		 Addable add1= Example::addTwo;
		 Addable add2= Integer::sum;//predefined in the JDK
		 System.out.println(add1.Add(100, 100));
		 

	}

}


