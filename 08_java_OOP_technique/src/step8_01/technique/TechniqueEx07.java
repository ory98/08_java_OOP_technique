package step8_01.technique;

/*

# 메서드 오버라이딩 ( Method Overriding )

- 부모클래스로부터 상속 받은 메서드를 재정의(overriding)하여 사용한다.
- 메서드 오버로딩과 혼용되기 쉽다.

*/

class Warrior2 extends Beginner {
	
	// 메서드 오버라이딩 ( 메서드 재정의 )
	// 부모클래스의 메서드와 이름이 같고 구현되는 기능이 다르다. 
	void levelUp() {
		this.level++;
		this.power += 100;
		this.dex   += 10;
		this.life  += 100;
		this.mana  += 10;
	}
	
	void dash() { // Warrior2 클래스만의 메서드 추가
		System.out.println("\n warrior2 dash! \n");
		
	}
	
}
class Wizard2 extends Beginner {
	
	// 메서드 오버라이딩 ( 메서드 재정의 )
	// 부모클래스의 메서드와 이름이 같고 구현되는 기능이 다르다. 
	void levelUp() {
		this.level++;
		this.power += 10;
		this.dex   += 100;
		this.life  += 10;
		this.mana  += 100;
	}
	
	void fireBall() { // Wizard2 클래스만의 메서드 추가 
		System.out.println("\n wizard2 firsBall! \n");
	}
	
}


public class TechniqueEx07 {

	public static void main(String[] args) {
		
		Warrior2 warrior2 = new Warrior2();
		warrior2.showStatus();
		warrior2.levelUp();
		warrior2.levelUp();
		warrior2.levelUp();
		warrior2.showStatus();
		warrior2.dash();
	
		System.out.println("\n=================\n");
		
		Wizard2 wizard2 = new Wizard2();
		wizard2.showStatus();
		wizard2.levelUp();
		wizard2.levelUp();
		wizard2.levelUp();
		wizard2.showStatus();
		wizard2.fireBall(); 
		
	}

}
