package Exo0.coll.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		 
		ArrayList<String>fruits=new ArrayList<String>();
		 fruits.add("apples");
		 fruits.add("Banana");
		 fruits.add("Orange");
		 fruits.add("pomegranate");
		 System.out.println(fruits);
		 fruits.add(2,"chikoooo");
		 System.out.println(fruits);
		 //replace an elements with another
		 fruits.set(3, "blueberry");
		 System.out.println(fruits);
		 var fastfood=new ArrayList<String>();
		 fastfood.add("pizza");
		 fastfood.add("burger");
		 fastfood.add("onion");
		 fastfood.add("curlz");
		 fastfood.add("mosaru");
		 System.out.println(fastfood);
		 List<String>vegetables=List.of("tomato","curry");
		 System.out.println(vegetables);
	}

}
