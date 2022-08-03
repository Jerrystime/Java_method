
public class AccessLevelModifiersMethod {

	public static void main(String[] args) {
		Greeting.hi();
	}

}

class Greeting {
	// public, protected, default, private
	public static void hi() {
		System.out.println("Hi");
	}
}

// private 접근 제어자는 같은 클래스 안에서만 사용할 수 있다.