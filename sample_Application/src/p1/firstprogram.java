package p1;

public class firstprogram {

	public static void main(String[] args) {
		add(9, 7);
		name("vijay","pusala");
		print();
	}

	static int add(int a, int b) {
		int c = a + b;
		System.out.println(c);
		return 0;
		
		}
	
	static String name(String a, String b) {
		String c= a+  b;
		System.out.println(c);
		return c;
		
	}
	static void  print() {
		System.out.println("vijay");  
	}

static {
//	int sub(int a, int b) {
//	int c=a-b;
	System.out.println("this is static block");
}
}
