interface Calculable { //인터페이스는 약속. 규제하고 있는 형태 엄수해야. 
	double PI = 3.14;
	int sum(int v1, int v2); //인터페이스는 변수 가질 수 있다.	
}

/*인터페이스에는 변수와 메소드 정의 가능
 * 변수에는 실제 값이 들어오고
 * 메소드는 실제 구현이 안 들어와서 메소드를 구현하는 클래스에서 실제 구현이 이루어짐.
 */

interface Printable {
	void print();
}

//외주업체가 만든 코드 
class RealCal implements Calculable, Printable{ //하나의 클래스는 여러개의 인터페이스 구현 가능 
	public int sum(int v1, int v2) {
		return v1+v2;
	}

	@Override
	public void print() {
		System.out.println("this is real cal!");
	}
}


//외주 주기 전 샘플코드 
class DummyCal implements Calculable{
	public int sum(int v1, int v2) {
		return 3; 
	}
}

public class InterfaceApp {

	public static void main(String[] args) {
		// 외주업체야, 더하기 기능이 있는 클래스를 만들어주세요.

		RealCal c = new RealCal(); //DummyCal c = new DummyCal()을 개발이 끝나면 Real로 대
		// Printable c = new RealCal();
		// Calculable c = new RealCal();
		System.out.println(c.sum(2, 1));
		c.print();
		System.out.println(c.PI);
	}

}
