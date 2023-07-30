package ExxCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

interface myInterface{
	void method1();
	void method2();
}
public class Ananomous {
	
	 
	public static void main(String[] args) {
		 
		  myInterface s=new myInterface() {
			
			@Override
			public void method2() {
				 System.out.println("enter the values here");
				
			}
			
			@Override
			public void method1() {
				System.out.println("enter the second value here");
				
			}
		}; 
		  s.method1();
		  s.method2();
		 

	}

}

	 
