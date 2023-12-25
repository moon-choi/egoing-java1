class Foo {
	public static String classVar = "I class var"; //static이 붙으면 클래스 소속! static 변수 값 바꾸면 모든 인스턴스 값 바뀜.
	public String instanceVar = "I instance var"; //없으 인스턴스 소속! 인스턴스별로 다른 값 가질 수 있음. 
	public static void classMethod() {
		System.out.println(classVar); //OK
//		System.out.println(instanceVar); //error
	}
	public void instanceMethod() {
		System.out.println(classVar); //OK
		System.out.println(instanceVar); //OK. 인스턴스 메소드안에서는 인스턴스 변수 접근 가능.
	}
}


public class StaticApp {

	public static void main(String[] args) {
		System.out.println(Foo.classVar); //OK. 클래스 통해 클래스변수 접근 가능. 
//		System.out.println(Foo.instanceVar); //error. 인스턴스 변수는 인스턴스를 통해서 접근해야.
	
		Foo.classMethod(); //OK.
//		Foo.instanceMethod(); //error	
		
		Foo f1 = new Foo();
		Foo f2 = new Foo();
		
		
	}

}
