import java.io.FileWriter;
import java.io.IOException;

public class WhyMethod {

	public static void main(String[] args) throws IOException {
		
					// 인자, argument
		printTwoTimes("a", "-");	// 메소드를 호출할 때 메소드 옆 괄호 안에 인자를 넣어준다.
		System.out.println(twoTimes("a", "-"));	// 위의 코드와 동일하게 동작한다.
		printTwoTimes("a", "*");	// 괄호 안에 , 찍으면 여러 개의 인자를 전달할 수 있다.
		writeFileTwoTimes("a", "&");
		FileWriter fw = new FileWriter("out.txt");
		fw.write(twoTimes("a", "&"));
		fw.close();
		printTwoTimes("b", "!");
//		Email.send("egoing@a.com", "two times", twoTimes("b", "!"));
		
		// twoTimes()에는 System.out.println() 메소드가 들어가 있지 않고 반환 값만 출력하기 때문에 여러가지 방법의 출력에 사용할 수 있다. 
		
	}
	
	public static String twoTimes(String text, String delimiter) {
		 String out = "";
		 out = out + delimiter + "\n";
		 out = out + text + "\n";
		 out = out + text + "\n";
		 return out;
	}
	
									// 매개변수, parameter
	public static void printTwoTimes(String text, String delimiter) {	// 메소드 옆 괄호 안에 매개변수를 넣어준다.
		// 1억줄의 코드
		System.out.println(delimiter);	// 두 번째로 전달된 인자를 출력한다.
		System.out.println(text);	// 매개 변수로 입력된 인자를 출력한다.
		System.out.println(text);	
	}
	

	public static void writeFileTwoTimes(String text, String delimiter) throws IOException {
		FileWriter fw = new FileWriter("output.txt");
		fw.write(delimiter + "\n");
		fw.write(text + "\n");
		fw.write(text + "\n");
		fw.close();
	}

}
