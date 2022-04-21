package step8_01.technique;

/*
 * # 싱글턴 패턴 
 * 
 *  - 객체를 1번만 생성하고 싶을 때 사용하는 기법
 *  
 *  - 싱글턴 패턴을 만드는 방법
 *  
 *    1) private 기본 생성자를 만든다.
 *    2) 내부에서 static으로 자기자신의 인스턴스를 생성한다. (핵심)
 *	  3) instance를 반환할 getter를 만들어준다.	  
 *  
 * */

class SingleTonTest {
	
	// 1) private 기본 생성자를 만든다.
	private SingleTonTest() {}
	
	// 2) 내부에서 static으로 자기자신의 새로운 인스턴스(객체)를 생성한다. (핵심) ********
	private static SingleTonTest instance = new SingleTonTest();
	
	// 3) instance를 반환할 getter를 만들어준다.
	public static SingleTonTest getInstance() {
		return instance;
	}
	
	// 테스트 변수
	String testVar1 = "테스트변수1";
	String testVar2 = "테스트변수2";
	String testVar3 = "테스트변수3";
	
	//테스트 메서드
	void testMethod1() {
		System.out.println("테스트메서드1");
	}
	
	void testMethod2() {
		System.out.println("테스트메서드2");
	}
	
	void testMethod3() {
		System.out.println("테스트메서드3");
	}
	
}

class ClassTest {
	
}
public class TechniqueEx05 {

	public static void main(String[] args) {
		
		System.out.println(new ClassTest());
		System.out.println(new ClassTest());
		System.out.println(new ClassTest());
		System.out.println();
		
		// private 생성자로 인해여 new를 사용할 수 없다. 
		// System.out.println(new SingleTonTest());
		
		System.out.println(SingleTonTest.getInstance());
		System.out.println(SingleTonTest.getInstance());
		System.out.println(SingleTonTest.getInstance());
		System.out.println();
		
		// 변수 접근 : SingleTon클래스.getInstance().변수명 
		System.out.println(SingleTonTest.getInstance().testVar1);
		System.out.println(SingleTonTest.getInstance().testVar2);
		System.out.println(SingleTonTest.getInstance().testVar3);
		System.out.println();
		
		// 메서드 접근 : SingleTon클래스.getInstance().메서드명 
		SingleTonTest.getInstance().testMethod1(); // < return Instance < new SingleTonTest();
		SingleTonTest.getInstance().testMethod2(); 
		SingleTonTest.getInstance().testMethod3(); 

	}

}
