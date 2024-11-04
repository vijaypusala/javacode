package p1;
public class  p1 {
 
	public static void main(String[] args) {
		String name="Abhi";
		System.out.println("main method");
		print();
		int addNumberMethodReturnedValue = addNumber();
		System.out.println(addNumberMethodReturnedValue + 10);
 
		String addStringreturnedValue = addString();
		System.out.println(addStringreturnedValue);
	}
 
	static void print() {
		System.out.println("print method");
		
	}
	static int addNumber() {
		int a = 10+20;
		System.out.println(a);
		return a;
		
	}
	static String addString() {
		String name = "Anil"+ " " + "Choppari";
		//System.out.println(name);
		return name;
	}
 
}