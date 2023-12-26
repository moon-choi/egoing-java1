import java.io.FileWriter;
import java.io.IOException;

public class ThrowException2 {
	//방법 2. 예외를 위임하고 싶은 곳 (이 코드를 사용하는 쪽에서) try, catch를 해야함.
	public static void main(String[] args) throws IOException {
												//던지고 싶은 예외 이름 
												//그러면 여기서 try, catch 안해도 됌.
		FileWriter f = new FileWriter("data.txt");

	}

}
