
public class WhyMethod {
	public static void printTwoTimesA() {	// 메소드 생성
		// 1억줄의 코드
		System.out.println("-");	//
		System.out.println("a");	// 동일한 코드 그룹핑
		System.out.println("a");	//
	}

	public static void main(String[] args) {
		// 메소드의 기본 형식
		// 똑같은 코드를 여러 번 사용을 할 때, 중복이 일어나게 되고, 그 코드를 수정할 시에는 모든 중복 코드를 일일이 수정을 해야한다.
		// 이러한 경우 서로 연관된 코드들을 그룹핑하여 메소드를 만들어준다.
		
		// 1억줄의 코드
		System.out.println("-");	//
		System.out.println("A");	// 동일한 코드
		System.out.println("A");	//
		// 1억줄의 코드
		System.out.println("-");	//
		System.out.println("A");	// 동일한 코드
		System.out.println("A");	//
		// 1억줄의 코드				
		System.out.println("-");	//
		System.out.println("A");	// 동일한 코드
		System.out.println("A");	//
		
		
		printTwoTimesA();	// 동일한 코드를 그룹핑한 그룹 호출
		printTwoTimesA();	// 동일한 코드를 그룹핑한 그룹 호출
		printTwoTimesA();	// 동일한 코드를 그룹핑한 그룹 호출
		
		// 위의 코드들과 아래의 코드들은 동일한 동작을 한다.
		
	}

}
