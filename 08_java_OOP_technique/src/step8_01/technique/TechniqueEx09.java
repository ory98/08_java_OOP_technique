package step8_01.technique;

/*
 *  # 추상화 (= 목차랑 비슷) > 관리적인 문법
 * 
 *  - 부모클래스를 상속받은 자식클래스에게 반드시 구현해야하는 메서드를 잊지않고 만들도록 '강제'하는 클래스
 *  - abstract 키워드를 클래스 앞에 붙여주어 추상클래스를 생성한다.
 *  - abstract 키워드를 메서드 앞에 붙여주어 추상메서드를 생성한다.
 *  - 추상메서드 뒤에 '{}' 아닌 ';'을 붙인다. 
 *  - 추상메서드는 추상클래스 안에서 선언만 하고
 *    실질적인 메소드의 추상클래스를 상속받은 일반 자녀클래스에서 진행한다.
 *  - 다중 상속이 불가능하다.
 *  - 추상 클래스는 객체를 생성 할 수 없다.
 *  
 *  - 추상 클래스 안에 추상 메서드와 일반 메서드 둘다 생성할 수 있다.  
 *    
 * */

// 일반 클래스1
class Parent1 {
	void test() {}
}

// 일반 클래스를 상속받은 일반 클래스 
class Child1 extends Parent1 {}

// 추상 클래스
abstract class Parent2 { // abstract키워드를 클래스 앞에 붙여준다. 
	
	abstract void test1(); // 목차에는 내용이 없기 때문에 {}아닌, ;를 사용하여 나타낸다.
	abstract void test2();
	abstract void test3();
	abstract void test4();
	abstract void test5();
	abstract void test6();
	
	// 추상 클래스에서는 일반 메서드도 같이 사용가능하다. 
	void test97() {}
	void test98() {}
	void test99() {}
}

// 추상 클래스를 상속받은 일반 클래스 
class Child2 extends Parent2 {

	@Override
	void test1() {
		
	}

	@Override
	void test2() {
		
	}

	@Override
	void test3() {
		
	}

	@Override
	void test4() {
		
	}

	@Override
	void test5() {
		
	}

	@Override
	void test6() {
		
	}
}
 // 추상 클래스를 상속받은 일반 클래스 
class Child3 extends Parent2 {

	@Override
	void test1() {
		
	}

	@Override
	void test2() {
		
	}

	@Override
	void test3() {
		
	}

	@Override
	void test4() {
		
	}

	@Override
	void test5() {
		
	}

	@Override
	void test6() {
		
	}
}


public class TechniqueEx09 {

	public static void main(String[] args) {
		
		new Parent1();
		new Child1();
		
		// new Parent2(); > 추상 클래스는 객체를 생성할 수 없다. 
		new Child2();
		new Child3();
		

	}

}
