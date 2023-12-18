// AccountingMethodApp과 비교해서 보기.

class Accounting { //Java의 class는 객체지향의 object 와 같다.
	public double vatRate;
    public double valueOfSupply;
	public double expenseRate;
	
	public double getVAT() {
		return valueOfSupply * vatRate;
	}
 	public double getTotal() {
		return valueOfSupply + getVAT();
	}
	public double getExpense() {
		return valueOfSupply * expenseRate;
	}
	public double getIncome() {
		return valueOfSupply - getExpense();
	}
	public double getDividend1() {
		return getIncome() * 0.5;
	}
	public double getDividend2() {
		return getIncome() * 0.3;
	}
	public double getDividend3() {
		return getIncome() * 0.2;
	}
	public void print() {
		System.out.println("Value of supply : " + valueOfSupply);
        System.out.println("VAT : " + getVAT());
        System.out.println("Total : " + getTotal());
        System.out.println("Expense : " + getExpense());
        System.out.println("Income : " + getIncome());
        System.out.println("Dividend 1 : " + getDividend1());
        System.out.println("Dividend 2 : " + getDividend2());
        System.out.println("Dividend 3 : " + getDividend3());
	}
}

public class AccountingClassApp { //AccountingApp이랑 비교하면서 보기 (9줄로 줄임)
 
	public static void main(String[] args) {
		//instance 생성. 위의 class에 있는 static은 모두 지워야함. 
		Accounting a1 = new Accounting();
		
        a1.valueOfSupply = Double.parseDouble(args[0]);
        a1.vatRate = 0.1;
        a1.expenseRate = 0.3;
        a1.print();
        
        Accounting a2 = new Accounting();
        a2.valueOfSupply = Double.parseDouble(args[0]);
        a2.vatRate = 0.05;
        a2.expenseRate = 0.2;
        a2.print();
     }
}