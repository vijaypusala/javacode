package p1;

public class Replace {

	public static void main(String[] args) {
		
			String str2="hello vijay123 cat344444 and dog cat  hello and dog";
			System.out.println(str2.replace("hello", "vijay"));
			System.out.println(str2.replaceAll("\\d", " "));
			System.out.println(str2.replace(" ", ""));
		}
	}

