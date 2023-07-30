package Ex005.math_ref;
class Tax{
	double TaxPercentage;

	public Tax(double taxPercentage) {
		super();
		TaxPercentage = taxPercentage;
	}
	@Override
	public String toString() {
		return "Tax[TaxPercentage="+TaxPercentage+"]";
		
	}
	
}
@FunctionalInterface
interface Taxable{
	Tax getTaxDetails(double txpc);
}
public class ConstructorRefDemo {

	public static void main(String[] args) {
		 Taxable t=Tax::new;
		 System.out.println(t.getTaxDetails(20));

	}

}
/*
Using constructor references in this way can make your code more concise and expressive. It allows you to use functional interfaces effectively to represent constructors and other methods, enhancing the functional programming capabilities of Java.

Constructor references are particularly useful when working with functional interfaces like Supplier, Function, Predicate, etc., which require a method implementation with a 
	specific signature. Instead of providing a lambda expression to create an object, you can use
	constructor references, making the code more readable and reducing boilerplate code.*/
