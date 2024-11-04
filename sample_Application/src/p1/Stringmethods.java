package p1;

public class Stringmethods {

	public static void main(String[] args) {
		Split();
		Stringlength();
		Stringreplace();
		Stringconcat();
		tolowercase();
		startswith();
		endswith();
		equals();

		}
	static void Split() {
		String text ="hello this is vijay pusala";
		 String []result =text.split(" ");
		for (String s : result) {
			System.out.print(s + ",");
		}
		System.out.println();
		
		System.out.println("--------------");
		for(int i=0; i<result.length-1; i++) {
			System.out.print(result[i] + ",");
		}
		System.out.print(result[result.length-1]);

	}
	static void Stringlength() {
		String str1="hello this is vijay ";
		 int length=str1.length();
		 System.out.println(str1.length());
	}
	static void Stringreplace() {
		String str2="hello vijay123 cat344444 and dog cat  hello and dog";
		System.out.println(str2.replace("hello", "vijay"));
		System.out.println(str2.replaceAll("\\d", ""));
	}
	static void Stringconcat() {
		String str5="hello";
		String str6="vijay";
		System.out.println(str5.concat (str6));
	}
	static void tolowercase() {
		String str7="HELLO VIJAY";
		System.out.println(str7.toLowerCase());
	}
	static void startswith() {
		String str8="hello vijay pusala";
		System.out.println(str8.startsWith("hello"));
	}
	static void endswith() {
		String str8="hello vijay pusala";
		System.out.println(str8.endsWith("a"));
	}
	static void equals() {
		String str9="hello vijay";
		 String str10="hello vijay";
		boolean result =str9.equals(str10);
		System.out.println(result);
	}
			
	}
