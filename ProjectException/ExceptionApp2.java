
public class ExceptionApp2 {

	public static void main(String[] args) {
		System.out.println(1);
		int[] scores = {10, 20, 30};
		
		try {
			System.out.println(2);
//			System.out.println(scores[3]);//ArrayIndexOutOfBounds 에러 발생 -> catch 로 점프함.
			System.out.println(3); //뒤의 try 구문 모두 스킵.
			System.out.println(2/0); //Arithmetic exception 에러 예정
			System.out.println(4);
			
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("error - array out of bounds");
			
		} catch(ArithmeticException e) { //우선순위 Exception
			System.out.println("error - arithmetic exception" + e.getMessage());
			e.printStackTrace();
			
		} catch(Exception e) { //Arithmetic 이든 ArrayOutOfBounds 이든 부모 에러가 다 잡음.
			System.out.println("error - exception");
			
		}
		System.out.println(5);
	}
//서열: Exception > RuntimeException > ArithmeticException
}
