package generic;

public class GenericPrinter<T extends Meterial> {
	
	private T material ;

	public T getMeterial() {
		return material;
	}

	public void setMeterial(T material) {
		
		
		this.material = material;
		
	}
	
	public String toString() {
		return material.toString();
	}

	public void doPrint() {
		
		material.doPrint();
	}
}
