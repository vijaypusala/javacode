package p1;

public class javatask {

	static void factorial(int a) {

		int fact = 1;
		for (int i = a; i >= 1; i--) {
			fact = fact * i;

			System.out.println(fact);

		}
	}

	static void fibonacci(int b) {
		int num;
		for (int i = 0; i <= 1; i++) {
System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		factorial(6);
		fibonacci(98);

}
}