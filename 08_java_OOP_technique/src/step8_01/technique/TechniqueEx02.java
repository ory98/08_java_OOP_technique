package step8_01.technique;

/*
 * 
 *  # 캡슐화 (capsulation) // 감싸는 기법 
 * 
 * - 접근제어자 : public , private  + getter/setter
 * 
 * 
 * [ 접근제어자(Modifier)의 종류 ]
 * 
 * public  : 프로젝트 전체에서 접근 가능
 * private : 클래스 내부에서만 접근 가능 > 비공개 > 필요할 경우에만 수정&저장
 * 
 * default(package) : 패키지 내에서만 접근가능 
 * protected        : 상속관계에서 접근 가능
 * 
 * 
 * */

class ModifierTest { // 접근제어자
	
	private int a;
	int b;
	
	// private  변수를 클래스 외부로 꺼내주는 메서드 getter
	int getA() { // 변수명 앞에 get를 추가하여 메서드의 이름을 짓는다. 
		return this.a;
	}
	
	// private  변수를 클래스 외부에서 수정하는 메서드 setter
	void setA(int a) { // 변수명 앞에 set를 추가하여 매서드 이름을 짓는다. 
		this.a = a;
	}
}

// VO (Value Object)          : 값을 저장하고 있는 객체 ( = 압축파일)
// DTO (Data Transfer Object) : 데이터 전송 모델 객체 
class ProductVO { 
	
	private String productCode;
	private String productName;
	private int productPrice;
	private String managerCode;
	private String managerName;
	
	
	// getter & setter 생성 단축키
	// 좌측 상단 Source > Generate Getters and Getters > selectAll > Generate
	// 필요할 경우에만 수정하여 사용 
	
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public String getManagerCode() {
		return managerCode;
	}
	public void setManagerCode(String managerCode) {
		this.managerCode = managerCode;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	
}



public class TechniqueEx02 {

	public static void main(String[] args) {
		
		ModifierTest test = new ModifierTest();
		
		// private 변수는 클래스 외부에서 접근 불가 
		//test.a = 1000;
		//System.out.println(test.a);
		
		test.setA(1000);                  // setter를 이용하여 private 변수의 값을 대입하기
		System.out.println(test.getA()); // getter를 이용하여 private 변수의 값을 꺼내오기 
		// > 방어사용 가능 
		
		test.b = 2000;
		System.out.println(test.b);
		System.out.println("\n==============\n");
		
		
		ProductVO productVO = new ProductVO();
		productVO.setProductCode("0x001");
		productVO.setProductName("기계식키보드");
		productVO.setProductPrice(37000);
		productVO.setManagerCode("mgr1");
		productVO.setManagerName("담당자1");
		
		System.out.println(productVO.getProductCode());
		System.out.println(productVO.getProductName());
		System.out.println(productVO.getProductPrice());
		System.out.println(productVO.getManagerCode());
		System.out.println(productVO.getManagerName());
		

	}

}
