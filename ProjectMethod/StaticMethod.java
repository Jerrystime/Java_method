
public class StaticMethod {

	public static void main(String[] args) {
//		Print.a("-");
//		Print.b("-");
		
		// 인스턴스, instance = 클래스의 복제본
		Print t1 = new Print();
		t1.delimiter = "-";
		t1.a();
		t1.b();
		t1.c("!");
		Print.c("$");
		
//		Print.a("*");
//		Print.b("*");
		
		Print t2 = new Print();
		t2.delimiter = "*";
		t2.a();
		t2.b();
	}

}

class Print {
	
	public String delimiter;
	
	public void a() {
		System.out.println(this.delimiter);	// this는 해당 클래스를 뜻함.
		System.out.println("a");
		System.out.println("a");
	}
	
	public void b() {
		System.out.println(this.delimiter);
		System.out.println("b");
		System.out.println("b");
	}
	
	public static void c(String delimiter) {
		System.out.println(delimiter);
		System.out.println("c");
		System.out.println("c");
	}
}

// 클래스 메소드는 static을 넣어줘야 한다.
// 인스턴스 메소드는 static을 안 넣어야 한다.
// 인스턴스 메소드는 인스턴스에서만 호출할 수 있고, 클래스 메소드는 인스턴스, 클래스 둘 다 호출할 수 있다.
