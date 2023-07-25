package Exo0.coll.list;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		 HashSet<Integer>empId=new HashSet<Integer>();
		 empId.add(101);
		 empId.add(102);
		 empId.add(103);
		 empId.add(104);
		 empId.add(101);
		 empId.add(105);
		 empId.add(106);
		 System.out.println("1."+empId);
		 empId.add(null);
		 System.out.println("2."+empId);
		 empId.add(null);
		 System.out.println("3."+empId);
	}

}
////////////////////////////Linked hashSet program//////////////////////
package Exo0.coll.list;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		 LinkedHashSet<Integer>empId=new LinkedHashSet<Integer>();
		 empId.add(101);
		 empId.add(102);
		 empId.add(103);
		 empId.add(104);
		 empId.add(101);
		 empId.add(105);
		 empId.add(106);
		 System.out.println("1."+empId);
		 empId.add(null);
		 System.out.println("2."+empId);
		 empId.add(null);
		 System.out.println("3."+empId);
	}

}
package Exo0.coll.list;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		 TreeSet<Integer>empId=new TreeSet<Integer>();
		 empId.add(101);
		 empId.add(102);
		 empId.add(103);
		 empId.add(104);
		 empId.add(101);
		 empId.add(105);
		 empId.add(106);
		 System.out.println("4."+empId);
		 empId.add(null);
		 System.out.println("5."+empId);
		 empId.add(null);
		 System.out.println("6."+empId);

	}

}

