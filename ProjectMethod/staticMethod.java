class Print{
//	public static String delimiter; //Print.delimiter 로 쓰고 싶으면 static 키워드 놔두기. 
	public String delimiter; //Instance.delimiter 로 쓰고 싶으면 static 키워드 지우기.
	
	public static void a(String delimiter) { //class의 메소드면 static 키워드가 있음. 
		System.out.println("a");
		System.out.println("a");
		System.out.println(delimiter);
	}
	
	public void b() {  //instance의 메소드면 static 키워드가 없음.
		System.out.println("b");
		System.out.println("b");
		System.out.println(this.delimiter);
	}
}


public class staticMethod {

	public static void main(String[] args) {
	
		Print.a("-");

		//instance
		Print p2 = new Print();
		p2.delimiter = "*";
		p2.b();
	}

}
