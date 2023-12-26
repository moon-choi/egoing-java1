
public class Equals {

	public static void main(String[] args) {
		// == 연산자는 같은 곳에 저장돼 있는 지 확인 하는 것.
		//원시 데이터 타입
		int p1 = 1;
		int p2 = 1;
		System.out.println(p1 == p2); //true

		//.equals는 값 비교하는 것.
		//참조 데이터 타입 
		String o1 = new String("java");
		String o2 = new String("java");
		System.out.println(o1 == o2); //false
		System.out.println(o1.equals(o2)); //true

		
		//String은 원시데이터 타입처럼 동작함.
		String o3 = "hi";
		String o4 = "hi";
		System.out.println(o3 == o4); //true
	}

}
