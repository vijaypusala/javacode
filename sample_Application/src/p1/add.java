package p1;

public class add {

	public static void main(String[] args) {
		int a=12;
		int b=20;
		System.out.println(a+b);
		int x=8;
		int y=4;

		int temp=x;
		x=y;
		y=temp;
		System.out.println("x:"+x);
		System.out.println("y:"+y);
		
		swap();
	}
	static void swap() {
	  
	int x=84;
	int y=49;

	int temp=x;
	x=y;
	y=temp;
	System.out.println("x:"+x);
	System.out.println("y:"+y);
}

}
