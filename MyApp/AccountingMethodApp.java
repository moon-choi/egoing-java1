public class AccountingMethodApp { //AccountingApp이랑 비교하면서 보기 (9줄로 줄임)
 
	//전역변수 먼저 선언만 해놓고 값은 메인 안에서 줌.
	public static double valueOfSupply;
    public static double vatRate;
	public static double expenseRate;
	public static void main(String[] args) {
        valueOfSupply = Double.parseDouble(args[0]);
        vatRate = 0.1;
        expenseRate = 0.3;
        print();
     }

    //refactor -> extract method 로 자동 생성됌.
	public static double getVAT() {
		return valueOfSupply * vatRate;
	}
 	public static double getTotal() {
		return valueOfSupply + getVAT();
	}
	public static double getExpense() {
		return valueOfSupply * expenseRate;
	}
	public static double getIncome() {
		return valueOfSupply - getExpense();
	}
	public static double getDividend1() {
		return getIncome() * 0.5;
	}
	public static double getDividend2() {
		return getIncome() * 0.3;
	}
	public static double getDividend3() {
		return getIncome() * 0.2;
	}
	public static void print() {
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