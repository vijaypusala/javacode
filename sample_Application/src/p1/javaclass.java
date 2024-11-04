package p1;

public class javaclass {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		String s="hello";
//		String s3="hello";
//		s=s+"world";
//		String s1="helloworld";
//		if(s==s1) {
//			System.out.println("s");
//		}
//		if(s.equals(s1)) {
//			System.out.println("sa");
//		}
//		else {
//			System.out.println("d");
//		}
//		int a=s.length();	
//		System.out.println(a);
//		}
//	int len =String.length();
//	
StringBuilder sb=new StringBuilder("hello"+ "");
sb.append("world");
System.out.println(sb);
StringBuffer sbf=new StringBuffer("hi");
sbf.append("java");
System.out.println(sbf);
System.out.println("reverse of the given string is"  +sb.reverse());
System.out.println("inserting in the string" +sb.insert(1, "session"));
System.out.println("deletion operation:" +sb.delete(1, 5));
System.out.println("replace operation:" +sb.replace(2, 4, "okk"));


	}	}


