
public class AuthApp_Loop {

	public static void main(String[] args) {
		String[] users = {"moon", "egoing", "choi"};

		
		String inputId = args[0];
		
		boolean isLoggedIn = false;
		for(int i = 0; i < users.length; i++) {
			String currentId = users[i];
			if(currentId.equals(inputId)) {
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