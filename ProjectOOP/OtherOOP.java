import java.io.FileWriter;
import java.io.IOException;

public class OtherOOP {

	public static void main(String[] args) throws IOException {
		System.out.println(Math.PI);
		
		FileWriter f1 = new FileWriter("data.txt"); //FileWriter클래스의 복제본 
		f1.write("hello");
		f1.write(" java");
		f1.close();
		
		FileWriter f2 = new FileWriter("data2.txt"); //복제본 
		f2.write("hello");
		f2.write(" java");
		f2.close();

	}

}

