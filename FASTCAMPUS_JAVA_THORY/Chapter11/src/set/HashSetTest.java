package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> set = new HashSet<String>();
		
		set.add("이순신");
		set.add("김유신");
		set.add("강감찬");
		set.add("이순신");
		
		for (String string : set) {
			System.out.println(string);
		}
		System.out.println("===");
		Iterator<String> ir = set.iterator();
		
		while(ir.hasNext()) {
			String str = ir.next();
			System.out.println(str);
		}
		System.out.println("===");
		

		ArrayList<String> set_a = new ArrayList<String>();
		
		set_a.add("이순신");
		set_a.add("김유신");
		set_a.add("강감찬");
		set_a.add("이순신");
		
		for (String string : set_a) {
			System.out.println("ArrayList"+string);
		}
		
		//System.out.println(set_a);
	}

}
