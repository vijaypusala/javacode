package p1;

import java.util.Arrays;

public class Insertion {
	public static void main (String[] args) {
	    insertion();
		deletion();
		
}
	static void insertion() {
	int []orginalArray= {1,2,4,5};
	int insertingElement=3;
	int indexvalue=2;
	int[] newArray=new int [orginalArray.length+1];
	for(int i=0;i<indexvalue;i++) {
		newArray[i]=orginalArray[i];
	}
	newArray[indexvalue]=insertingElement;
	for(int i=indexvalue;i<orginalArray.length;i++) {
		newArray[i+1]=orginalArray[i];
	}
	System.out.println(Arrays.toString(newArray));
	}
	static void deletion() {
		int []orginalArray= {1,2,3,4,5};
		int deletingElement=5;
		int indexvalue=4;
		int[] newArray=new int [orginalArray.length-1];
		for(int i=0;i<indexvalue;i++) {
			newArray[i]=orginalArray[i];
		}
		newArray[indexvalue]=deletingElement;
		for(int i=indexvalue;i<orginalArray.length;i++) {
			newArray[i]=orginalArray[i+1];
		}
		System.out.println(Arrays.toString(newArray));
	}

	}
