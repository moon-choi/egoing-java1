
public class AuthApp_Loop2 {

	public static void main(String[] args) {

		String[][] users = {
				{"moon", "1111"},
				{"egoing", "2222"},
				{"choi", "3333"}
		};
		
		String inputId = args[0];
		String inputPw = args[1];
		
		boolean isLoggedIn = false;

		for(int i = 0; i < users.length; i++) {
			String[] current = users[i];
			
			if( 
					current[0].equals(inputId) && 
					current[1].equals(inputPw) 
			) {
				isLoggedIn = true;	
				break;
			}
		}
		System.out.println("Hello, ");
		if(isLoggedIn) {
			System.out.println(inputId + " is logged in");
		} else {
			System.out.println("Who are you?");
		}
	}

}
