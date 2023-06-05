import java.util.Scanner;
// "한빛미디어"에서 만드는 교재를 객체로 생성하여 정보를 출력하자

// Book 인터페이스
interface Book1{
// 필드: publish("한빛미디어")
	public static final String publish = "한빛미디어";
// 메소드: Print(), updown2000() -> 추상 메소드로 작성
	abstract void Print();
	abstract void updown2000();
}

class Java1 implements Book1{
	// 멤버: 개정년도(year), 이름(name, 상수로 선언한 뒤 "Java"로 적용)
	public int year;
	public final String name = "Java";
	
	// 생성자 구현
	public Java1(int y) {
		this.year = y;
	}
	
	// Print() -> 출판사, 개정년도, 책 이름 출력
	public void Print() {
		System.out.println("책 이름: " + this.name);
		System.out.println("출판사: " + this.publish);
		System.out.println("개정년도: " + this.year);
	}
	
	// updown2000() :: 개정년도에 따라, 개정된 버전인지 아닌지를 출력
	public void updown2000() {
		if(this.year >= 2000) {
			System.out.println("개정된 버전입니다.");
		}
		else {
			System.out.println("개정되기 이전의 버전입니다.");
		}
	}
	
}

class Python1 implements Book1{
	// 멤버: 개정년도(year), 이름(name, 상수로 선언한 뒤 "Python"로 적용)
	public int year;
	public final String name = "Python";
	
	// 생성자 구현
		public Python1(int y) {
			this.year = y;
		}
	
	// Print() -> 출판사, 개정년도, 책 이름 출력
	public void Print() {
		System.out.println("책 이름: " + this.name);
		System.out.println("출판사: " + this.publish);
		System.out.println("개정년도: " + this.year);
	}
	
	// updown2000() :: 개정년도에 따라, 개정된 버전인지 아닌지를 출력
	public void updown2000() {
		if(this.year >= 2000) {
			System.out.println("개정된 버전입니다.");
		}
		else {
			System.out.println("개정되기 이전의 버전입니다.");
		}
	}
	
}

public class Ex_Book {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Java1 j = new Java1(sc.nextInt());
		Python1 p = new Python1(sc.nextInt());
		
		j.Print();
		j.updown2000();
		System.out.println();
		p.Print();
		p.updown2000();
	}

}
