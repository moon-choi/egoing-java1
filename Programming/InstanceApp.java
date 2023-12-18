
import java.io.IOException;
import java.io.PrintWriter; //PrintWriter 클래스는 java io 패키지에 소속
public class InstanceApp {

	public static void main(String[] args) throws IOException {
		PrintWriter p1 = new PrintWriter("result1.txt"); //p1 은 인스턴스
		p1.write("Hello 1"); //p은 PrintWriter 클래스를 복제한 인스턴스 
		// 여러번 반복돼는 작업할 때. 
		p1.close();
		
		PrintWriter p2 = new PrintWriter("result2.txt"); //p1 은 인스턴스
		p2.write("Hello 2a");
//		p2.close();
		System.out.println(p2.toString());
		p2.write("Hello 2b");
		p2.close();
	}

}
