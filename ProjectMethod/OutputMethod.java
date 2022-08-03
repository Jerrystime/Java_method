
public class OutputMethod {

	public static void main(String[] args) {	// 메소드 이름 앞에 void는 return 값이 없다는 뜻이다.
		
		System.out.println(a());	// a() 메소드를 호출하면 문자 a가 출력된다.
		System.out.println(one());
		
	}
	
	public static String a() {	// return 값이 있을 경우 메소드 이름 앞에 반환 값의 데이터 타입을 넣어줘야한다.
		//..
		return "a";	// return 뒤에 값이 메소드의 실행 값이 된다.
	}
	
	public static int one() {
		return 1;	// return은 뒤에 값을 반환하는 역할도 하지만, 해당 메소드를 종료하는 역할도 한다.
//		System.out.println(2);
	}

}
