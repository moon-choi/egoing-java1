public class Print { //실행이 아니라 부품으로 사용돼므로 main 메소드 불필요.
	
	public String delimiter;
	
	public Print(String delimiter) {
		this.delimiter = delimiter;
	} //생성자: 초기에 주입할 필요가 있는 값을 전달하거나 초기 작업 수행할 때 
	
	public void A() {
	
		System.out.println("A");
		System.out.println("A");
		System.out.println(delimiter);
		
	}
	
	public void  B() {		

		System.out.println("B");
		System.out.println("B");
		System.out.println(delimiter);
	}
	
}
