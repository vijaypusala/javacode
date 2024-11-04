package p1;
public class Palindrome {
public static void main(String[] args) {
Palindrome scanner = new Palindrome();
System.out.print("Enter a string: ");
String inputString = scanner.nextLine();

boolean isPalindrome = true;
int length = inputString.length();

for (int i = 0; i < length / 2; i++) {
if (inputString.charAt(i) != inputString.charAt(length - i - 1)) {
isPalindrome = false;
break;
}
}

if (isPalindrome) {
System.out.println("The string is a palindrome.");
} else {
System.out.println("The string is not a palindrome.");
}

scanner.close();
}
}

