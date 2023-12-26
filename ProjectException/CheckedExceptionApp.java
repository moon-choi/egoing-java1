import java.io.FileWriter;
import java.io.IOException;

public class CheckedExceptionApp {

												
	public static void main(String[] args) {
//		Checked exception 이므로 반드시 예외처리해야 컴파일러가 컴파일 해줌.
//		- 방법 1. throws
//		- 방법 2. try/catch (Unchecked는 try/catch 안해도 컴파일러는 돌아감) 
		
		FileWriter f = null;
		//try-catch-finally statement
		try {
		f = new FileWriter("data.txt"); //일단 파일이 써지면 무조건 null 아님 
		f.write("hello");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (f != null) //null 일 수도 있으므
				try {
					f.close(); 
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} //쓰기작업 끝내고 놓아줘야 프로그램이 다른 일을 함.	
		}
	}

}
