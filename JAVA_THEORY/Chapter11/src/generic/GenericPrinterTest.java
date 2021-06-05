package generic;

import java.util.ArrayList;
import java.util.HashSet;

public class GenericPrinterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		
		Powder powder = new Powder(  );
		powderPrinter.setMeterial(powder);
		
		System.out.println(powderPrinter);
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		Plastic plastic = new Plastic(  );
		plasticPrinter.setMeterial(plastic);
		
		System.out.println(plasticPrinter);
		
		powderPrinter.doPrint();
		plasticPrinter.doPrint();
		
		ArrayList a = new ArrayList();
		HashSet b = new HashSet<Meterial>();
		
	}

}
