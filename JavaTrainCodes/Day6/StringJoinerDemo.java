package CorreJava;

import java.util.StringJoiner;

public class StringJoinerDemo {

	public static void main(String[] args) {
		 StringJoiner joiner=new StringJoiner(",","{","}");
		 joiner.add("Mysore");
		 joiner.add("Banglore");
		 joiner.add("Bellary");
		 joiner.add("sirigeri");
		 joiner.add("Mandya");
		 joiner.add("Maddur");
		 System.out.println("joiner values:"+joiner);
		 String []fruits= {"apple","banana","pineappale"};
		 StringJoiner joiner1 =new StringJoiner(",","[","]");
		  for(String f:fruits) {
			  joiner1.add(f);
		  }
		  
		  
		 System.out.println(joiner1);
		 String res=joiner1.toString();
			System.out.println(res);
				 }
		 }
////////////////////////////////


