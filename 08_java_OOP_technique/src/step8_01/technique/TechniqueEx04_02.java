package step8_01.technique;

// 생성자를 이용한 멤버변수 초기화

class GoodsDto {
	
	String goodsCode;
	String goodsName;
	int goodsPrice;
	
	// 생성자 단축키 > 좌측 상단 Source > Generate Constructor Using Fields..
	
	GoodsDto(String goodsCode, String goodsName, int goodsPrice) { 
		this.goodsCode = goodsCode;
		this.goodsName = goodsName;
		this.goodsPrice = goodsPrice;
	}
	
	void printData() {
		System.out.println(this.goodsCode + " / " + this.goodsName + " / " + this.goodsPrice);
	}
}

public class TechniqueEx04_02 {

	public static void main(String[] args) {
		
		// 생성자를 이용한 멤버변수 초기화
		GoodsDto g1 = new GoodsDto("0x001", "맨투맨", 40000);
		g1.printData();
		GoodsDto g2 = new GoodsDto("0x002", "팬츠", 20000);
		g2.printData();
		GoodsDto g3 = new GoodsDto("0x003", "바람막이", 70000);
		g3.printData();
		
		new GoodsDto("0x001", "맨투맨", 40000);
		new GoodsDto("0x002", "팬츠", 20000);
		new GoodsDto("0x003", "바람막이", 70000);
		
		new GoodsDto("0x001", "맨투맨", 40000).printData(); 
	}

}
