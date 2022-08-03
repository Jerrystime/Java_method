
public class WhyMethod {

	public static void main(String[] args) {
		
					// 인자, argument
		printTwoTimes("a", "-");	// 메소드를 호출할 때 메소드 옆 괄호 안에 인자를 넣어준다.
		printTwoTimes("a", "*");	// 괄호 안에 , 찍으면 여러 개의 인자를 전달할 수 있다.
		printTwoTimes("a", "&");
		printTwoTimes("b", "!");
		
	}
									// 매개변수, parameter
	public static void printTwoTimes(String text, String delimiter) {	// 메소드 옆 괄호 안에 매개변수를 넣어준다.
		// 1억줄의 코드
		System.out.println(delimiter);	// 두 번째로 전달된 인자를 출력한다.
		System.out.println(text);	// 매개 변수로 입력된 인자를 출력한다.
		System.out.println(text);	
	}

}
