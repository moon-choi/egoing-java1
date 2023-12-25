
public class StringApp {

	public static void main(String[] args) {
		System.out.println("Hello World"); //""는 String
		System.out.println('h'); //''는 Character. 문자 한 글자만. 
		System.out.println("H"); //이건 한 글자지만 문자열로 인식됌.
		System.out.println("Hello " //엔터치면 줄바꾸고 + 삽입해줌. 하지만 줄바꿈은 아님. 
				+ "World"); 
		System.out.println("Hello \nWorld"); //줄바꿈은 \n (new line)
		System.out.println("Hello \"World\""); //Hello "World"
	}

}
