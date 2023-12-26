import java.io.FileWriter;
import java.io.IOException;

public class ThrowException {

	public static void main(String[] args) {
		
		//방법 1. 직접 예외 처리 
		try {
			FileWriter f = new FileWriter("data.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
