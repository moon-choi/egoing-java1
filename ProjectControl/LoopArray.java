import java.util.Arrays;

public class LoopArray {

	public static void main(String[] args) {
		//A1. 생성하기 
		String[] users = new String[3];
		
		//A2. 값담기
		users[0] = "moon";
		users[1] = "egoing";
		users[2] = "choi";
		
		for(int i = 0; i < users.length; i++) {
			System.out.println("<li>" + users[i] + "</li>");
		}
	}

}
