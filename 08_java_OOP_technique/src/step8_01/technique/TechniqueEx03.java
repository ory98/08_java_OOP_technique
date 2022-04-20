package step8_01.technique;

/*

# static // 데이터 공유의 목적 

- 정적 필드와 정적 메소드는 객체(인스턴스)에 소속된 멤버가 아니라 클래스에 고정된 멤버이다. ******
- Static 키워드를 통해 생성된 정적멤버들은 Heap영역(new객체)이 아닌 Static영역에 할당한다.
- Static 영역에 할당된 메모리는 모든 객체가 공유하여 하나의 멤버를 어디서든지 참조할 수 있다.
- Garbage Collector(청소부)의 관리 영역 밖에 존재하기에 Static영역에 있는 멤버들은 프로그램의 종료시까지 메모리가 할당된 채로 존재한다. 
  (끄기 전까지 안 없어짐)

*/
class Character { // 객체
	
	int hp = 100;
	static int moveSpeed = 5; // 다른 영역에 만들어진다. 
	
	void showStatus() { // 메서드
		System.out.println("hp : " + hp);
		System.out.println("moveSpeed : " + moveSpeed);
		System.out.println();
	}
	
	static void speedUp() { // 메서드
		moveSpeed += 300;		
	}
	
}

public class TechniqueEx03 {

	public static void main(String[] args) {
		
		// 클래스명 변수 = 새로운 객체() 
		Character c1 = new Character(); // > 변수명으로 접근 
		c1.hp = 0;
		
		// 클래스명.static변수명 으로 static변수 접근
		Character.moveSpeed += 100; // c1.moveSpeed += 100;
		
		// 클래스명.static메서드명 으로 static메서드 접근
		Character.speedUp(); // c1.speedUp(); 
		
		c1.showStatus();
		
		
		Character c2 = new Character();
		c2.hp = 50;
		c2.showStatus();
		
		Character c3 = new Character();
		c3.showStatus();
		
		// static 예시 
		System.out.println(Math.PI); // 객체를 만들지 않아도 static에 자동 저장되어있어 사용가능 
		System.out.println(Math.abs(-7)); // static에 저장
		System.out.println();
		
		try { 
			System.out.println("시작");
			Thread.sleep(3000); // 3초 동안 재움 > static
			System.out.println("끝");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		

	}

}
