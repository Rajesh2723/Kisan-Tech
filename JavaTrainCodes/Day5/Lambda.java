package SimpleInterest;

interface Simple{
	double calculateSi(double p,double t,double r);
}

public class SimpleInterest {

	public static void main(String[] args) {
		 	Simple s=(p,t,r)->p*t*r/100;
		 		
		 	System.out.println("value:"+s.calculateSi(10, 10, 10));
		
	}

}
///ananomous class
class Animal {
    void makeSound() {
        System.out.println("Generic animal sound");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal() {
            @Override
            void makeSound() {
                System.out.println("Meow!");
            }
        };

        animal.makeSound(); // Output: Meow!
    }
}
