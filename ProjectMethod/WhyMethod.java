import java.io.FileWriter;
import java.io.IOException;

public class WhyMethod {
	
	public static void main(String[] args) throws IOException { //main은 메소드.		
		FileWriter fw = new FileWriter("out.txt");
		fw.write(twice("#", "c"));
		fw.close();
	}
								//매개변수(parameter)
	public static String twice(String delimiter, String letter) {
		String out = "";
		out = out + delimiter + "\n";
		out = out + letter + "\n";
		out = out + letter + "\n";
		return out;
	}
	
}
