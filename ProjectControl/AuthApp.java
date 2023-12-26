
public class AuthApp {

	public static void main(String[] args) {
		String id = "egoing";
		String inputId = args[0];
		String pw = "1234";
		String inputPw = args[1];
		
		System.out.println("hi");
		
		/* if(inputId == id) 안됌. 
		내부적으로 입력값이 다른 곳에 저장돼었다는 뜻임. 
		== 는 저장소를 비교하는 연산자임.)
		*/
		
//		if(inputId.equals(id)) {
//			if(inputPw.equals(pw)) {
//				System.out.println("Master!");
//			} else {
//				System.out.println("Wrong password!");
//			}
//
//		} else {
//			System.out.println("Who are you?");
//		}
		
		
		if(inputId.equals(id) && inputPw.equals(pw)) {
			System.out.println("Master!");
		} else {
			System.out.println("Who are you?");
		}

	}

}
