
public class Casting {

	public static void main(String[] args) {
		double a = 1.1;
		double b = 1; //정수지만 실수 타입의 변수에 담길 때 소수로 변환됌. (convert)
//		System.out.println(b); //1.0
		double b2 = (double) 1; //위와 같음.
		
//		int c = 1.1;//불
		double d = 1.1;
		int e = (int) 1.1; //강제로 int. 손실 일어남.
		System.out.println(e);
		
		String f = Integer.toString(4);
		System.out.println(f.getClass()); //데이터 타입 확인하면 class java.lang.String 으로 나옴. 
	}

}
