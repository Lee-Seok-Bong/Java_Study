package stream.inputstream;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = new int [3];
		int index = 0;
		try {
		for (index = 0; index < 5; ) {
			System.out.println("이전값 :"+index);
			
			int j = arr[index++] = 99;
			
			System.out.println("이후값 : "+index);
			System.out.println("-------------");
			
		}
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Exception : "+index);
		}
	}

}
