package com.oops;

public class Child extends Parent {
	
	void assects( String car,int plot,int bankbalance) {
		System.out.println("my car is" +car+  "plot is"   +2+  "my bankbalance"  +10000);
			
	}
	public static void main(String[] args) {
		Child childobj=new Child();
		childobj.properties("shine", 8, 3);
		childobj.assects("thar", 2, 10000);
	}

}
