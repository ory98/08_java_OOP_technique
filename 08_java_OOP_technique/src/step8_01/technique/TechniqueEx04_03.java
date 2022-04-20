package step8_01.technique;

/*
 * 
 * # 생성자 오버로딩(중복정의) > 매개변수의 개수나 타입이 다를 때 사용 
 * 
 *  - 생성자도 메서드이기 때문에 메서드 오버로딩 기법이 적용 가능하다.
 *  - 생성자 오버로딩을 구현하기 위해서는 메서드와 마찬가지로
 *    파라메타의 개수나 타입을 다르게 정의 하면 된다.
 * 
 * */

class GoodsVo {
	
	String goodsCode;
	String goodsName;
	int goodsPrice;
	
	// 생성자 오버로딩
	GoodsVo() {
		this.goodsCode = "없음";
		this.goodsName = "없음";
		this.goodsPrice = -1;
	}
	
	// 생성자 오버로딩
	GoodsVo(String goodsCode) {
		this.goodsCode = goodsCode;
		this.goodsName = "없음";
		this.goodsPrice = -1;
	}
	
	// 생성자 오버로딩
	GoodsVo(String goodsCode, String goodsName) {
		this.goodsCode = goodsCode;
		this.goodsName = goodsName;
		this.goodsPrice = -1;
	}
	
	// 생성자 오버로딩
	GoodsVo(String goodsCode, String goodsName, int goodsPrice) {
		this.goodsCode = goodsCode;
		this.goodsName = goodsName;
		this.goodsPrice = goodsPrice;		
	}
	
	
	void printData() {
		System.out.println(this.goodsCode + " / " + this.goodsName + " / " + this.goodsPrice);
	}
	
}
public class TechniqueEx04_03 {

	public static void main(String[] args) {
		
		new GoodsVo().printData();
		new GoodsVo("0x001").printData();
		new GoodsVo("0x002", "기계식 키보드").printData();
		new GoodsVo("0x003", "무소음마우스", 27000).printData();
		
		
		
		
		

	}

}
