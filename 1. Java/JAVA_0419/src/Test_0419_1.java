interface Book{
	public static final String publish = "한빛미디어";
	
	abstract void Print();
	abstract void updown2000();
}

class Java implements Book{
	int year;
	final String name = "Java";
	
	public Java(int year) {
		this.year = year;
	}
	
	public void Print() {
		System.out.println("출판사: " + this.publish);
		System.out.println("개정년도: " + this.year);
		System.out.println("책 이름: " + this.name);
	}
	
	public void updown2000() {
		if(this.year >= 2000) {
			System.out.println("개정된 버전입니다.");
		}
		else {
			System.out.println("개정되기 이전의 버전입니다.");
		}
	}
}

class Python implements Book{
	int year;
	final String name = "Python";
	
	public Python(int year) {
			this.year = year;
	}
	
	public void Print() {
		System.out.println("출판사: " + this.publish);
		System.out.println("개정년도: " + this.year);
		System.out.println("책 이름: " + this.name);
	}
	
	public void updown2000() {
		if(this.year >= 2000) {
			System.out.println("개정된 버전입니다.");
		}
		else {
			System.out.println("개정되기 이전의 버전입니다.");
		}
	}
}

public class Test_0419_1 {
	public static void main(String[] args) {
		// * "한빛미디어"에서 만드는 교재를 객체로 생성하여 정보를 출력하자
		// 
		// - Book 인터페이스
		//	- 필드: publish("한빛미디어")
		//	- 메소드: Print(), updown2000()
		
		// - Print() -> 출판사, 개정년도, 책 이름 출력
		// - updown2000() -> 2000년도 이후에 만들어졌다면 "개정된 버전입니다."
		// 				     2000년도 이전에 만들어졌다면 "개정되기 이전의 버전입니다."
		
		// - Java 클래스 생성
		// 	- 멤버: 개정년도(year), 이름(name, 상수로 선언한 뒤 "Java"로 적용)
		
		// - Python 클래스 생성
		// 	- 멤버: 개정년도(year), 이름(name, 상수로 선언한 뒤 "Python"로 적용)
		Java j = new Java(2001);
		Python p = new Python(1998);
		
		j.Print();
		j.updown2000();
		System.out.println();
		p.Print();
		p.updown2000();
	}
}
