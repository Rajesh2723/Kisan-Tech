package Func_init;


import java.util.*;

public class GenericsAndWrapperDemo {
 
    public static void main(String[] args) {


//        List students = new ArrayList(); 
//        
//        // We can store data of different types in a List
//        // i.e. Heterogeneous data
//        students.add("Vijay");
//        students.add("Ajay");
//        students.add("Megha");
//        students.add(10);
//        students.add(9.6);
//        students.add(true);
//        
//        System.out.println(students);
//        
//        Collections.sort(students);

        List<String> students = new ArrayList<String>(); 

        // We can store data of different types in a List
        // i.e. Heterogeneous data
        students.add("Vijay");
        students.add("Ajay");
        students.add("Megha");

        // Errors-can't add non-String data
//        students.add(10);
//        students.add(9.6);
//        students.add(true);

        System.out.println(students);

        Collections.sort(students);

        System.out.println(students);

        // Be cautious
        // double was bigger than int
        // Double is not bigger than Integer
        int i = 10;
        double d = i;

        // Integer and Double are sibling classes
        List<Double> temperatures = new ArrayList<Double>();
        temperatures.add(38.0);
        temperatures.add(31.7);
        temperatures.add(38.3);
        System.out.println(temperatures);



    }
 
}
