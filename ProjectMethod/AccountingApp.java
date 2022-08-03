
public class AccountingApp {
	// 공급가액
	public static double valueOfSupply = 10000.0;	// 클래스 변수로 선언 및 할당
	// 부가가치세율
	public static double vatRate = 0.1;	// 클래스 변수로 선언
	
	public static void main(String[] args) {
		
		System.out.println("ValueOfSupply : "  + valueOfSupply);	// valueOfSupply 변수 호출
		System.out.println("VAT : "  + getVAT());	// getVAT() 메소드 호출
		System.out.println("Total : "  + getTotal());	// getTotal() 메소드 호출
		
	}
	
	public static double getVAT() {	// 메소드 정의
		return valueOfSupply * vatRate;
	}
	
	public static double getTotal() {
		return valueOfSupply + getVAT();
	}

	// 메소드를 이용하면서 코드의 가독성을 높일 수 있고, 한 번 작성한 코드를 메소드 호출만 하면 되고, 재사용할 수 있고, 유지보수도 쉬워진다.
}
