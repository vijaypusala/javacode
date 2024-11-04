package p1;
//import java.util.Scanner;

public class Vowels {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a string: ");
String input = scanner.nextLine();

StringBuilder vowels = new StringBuilder();
StringBuilder consonants = new StringBuilder();
//
for (int i = 0; i < input.length(); i++) {
char ch = Character.toLowerCase(input.charAt(i));
if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
vowels.append(input.charAt(i));
} else if (Character.isLetter(ch)) {
consonants.append(input.charAt(i));
}
}

String reversedVowels = vowels.reverse().toString();
String result = consonants.toString() + reversedVowels;

System.out.println("Consonants: " + consonants);
System.out.println("Reversed Vowels: " + reversedVowels);
System.out.println("Result: " + result);

scanner.close();
}
}

