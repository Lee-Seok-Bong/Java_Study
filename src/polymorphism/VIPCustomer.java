package polymorphism;

public class VIPCustomer extends Customer{
	
	double salesRatio;
	private int agentID;
	
	/*public VIPCustomer() {
		
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
		System.out.println("VIPCustomer() »ý¼ºÀÚ È£Ãâ");
	}*/
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		this.agentID = agentID;
		
	//	System.out.println("VIPCustomer(int, String) »ý¼ºÀÚ È£Ãâ");
	}

	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * salesRatio);
	}
	
	
	
	@Override
	public String showCustomerInfo() {
		// TODO Auto-generated method stub
		return super.showCustomerInfo() + " 담당 상담원 번호는 " + agentID + "입니다.";
	}

//	public int getAgentID() {
//		return agentID;
//	}
	
}