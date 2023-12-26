
public class ExceptionApp {

	public static void main(String[] args) {
		System.out.println(1);
		int[] scores = {10, 20, 30};
		
		try {
			System.out.println(2);
			System.out.println(scores[3]);//ArrayIndexOutOfBounds 에러 발생 -> catch 로 점프함.
			System.out.println(3); //뒤의 try 구문 모두 스킵.
			System.out.println(2/0); //Arithmetic exception 에러 예정
			System.out.println(4);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("index does not exist in the array");
		} catch(ArithmeticException e) {
			System.out.println("can't divide by 0"); //대응하는 코드 있으면 나머지 코드 계속 진행됌.
		}
		System.out.println(5);
	}
//순서: 1 -> 2 -> 에러 -> catch -> 5
}
