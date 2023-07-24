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
