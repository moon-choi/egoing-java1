import java.io.FileWriter;
import java.io.IOException;

public class TryWithResource {
										
	public static void main(String[] args) {
		// try with resource statement
		try( FileWriter f = new FileWriter("data.txt") ){
			f.write("hello"); 
			// 자바는 f.close 를 내부적으로 자동 수행하므로 필요없음.
		} catch(IOException e) {
			e.printStackTrace();
		}

	}

}
