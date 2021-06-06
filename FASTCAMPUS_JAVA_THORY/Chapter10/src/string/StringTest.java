package string;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2);
		
		String str3 = "abc";
		String str4 = "abc";
		
		System.out.println(str3 == str4);

		String java = new String("java");
		String android = new String("android");
		
		java = java.concat(android);
		System.out.println(java);
		
		
	}

}
