package CorreJava;

import java.util.Optional;

public class OptionalClassDemo {

	public static void main(String[] args) {
		 String str1="Rajesh";
		 System.out.println("str1 value of the length=:"+str1.length());
		 String str2="This is Optional Class";
		 Optional<String> container2 = Optional.ofNullable(str2);
		 if(container2.isPresent()) {
			 System.out.println("2."+container2.get());
		 }else {
			 System.out.println("no data is found");
		 }
		 System.out.println("3."+container2.orElse("AlternateText").toUpperCase()); /////////this is for the if the str2 is null then it takes the alternate string and keeps that value
	}

}
