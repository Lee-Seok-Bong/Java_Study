package string;

public class StringBuilderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String java = new String("java");
		String android = new String("android");
		
		StringBuilder buffer = new StringBuilder(java);
		System.out.println(System.identityHashCode(buffer));
		buffer.append("android");
		buffer.append(" android 2");
		System.out.println(System.identityHashCode(buffer));
		
		java = buffer.toString();
		//System.out.println(buffer);
		
	}

}
