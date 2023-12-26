import java.util.Arrays;

public class ArrayApp {

	public static void main(String[] args) {
		//A1. 생성하기 
		String[] users = new String[3];
		
		//A2. 값담기
		users[0] = "moon";
		users[1] = "egoing";
		users[2] = "choi";
		
		System.out.println(Arrays.toString(users));
		
		//B. 생성과 동시에 값 담기 
		String[] people = {"moon", "egoing", "choi"};

		System.out.println(Arrays.toString(people));
	}

}
