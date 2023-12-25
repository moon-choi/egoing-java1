class Accounting { //클래스를 활용해서 서로 연관됀 메소드를 정리하기.
	
	public double valueOfSupply; //static이 없으면 인스턴스에 소속됀 변수 
	public static double vatRate = 0.1; //static 은 클래스에 소속됀 변수 
	
	public Accounting(double valueOfSupply) { //valueOfSupply를 생성자 레벨에서 강제하고 싶을 때 
		this.valueOfSupply = valueOfSupply;
	}
	
	public double getVAT() {
		return valueOfSupply * vatRate;
	}
	
	public double getTotal() {
		return valueOfSupply + getVAT();
	}
}

public class AccountingApp {

	public static void main(String[] args) {
		Accounting a1 = new Accounting(10000.0);		
		
		Accounting a2 = new Accounting(20000.0);		
		
		System.out.println("Value of supply: " + a1.valueOfSupply);
		System.out.println("VAT: " + a1.getVAT());
		System.out.println("Total: " + a1.getTotal());
		
		System.out.println("Value of supply: " + a2.valueOfSupply);
		System.out.println("VAT: " + a2.getVAT());
		System.out.println("Total: " + a2.getTotal());

	}

}
