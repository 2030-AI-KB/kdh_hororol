// 상속 :: 부모가 자식에게 "물려준다"
// => extends 키워드를 사용해, 부모 클래스의 멤버들을 자식 클래스에게 물려주는 문법
// => 부모 클래스의 멤버들을 복사하여 자기 자신의 
// 자식 클래스의 멤버 = 부모 클래스 멤버 + 자신만의 멤버

// 예제 :: Phone, SmartPhone 클래스 구현
class Phone{		// 2G폰 클래스, 부모 클래스
	public String tel; // 전화번호
	public boolean touch; // 탭이 되는지 안되는지
	
	public void Print() {
		System.out.println("전화번호: " + this.tel);
		System.out.println("탭 가능 여부: " + this.touch);
	}
}

class SmartPhone extends Phone{	// 스마트폰 클래스, 자식 클래스
	// 부모 클래스로부터 물려받은 멤버 변수
	//	public String tel; // 전화번호
	//	public boolean touch; // 탭이 되는지 안되는지
	
	public String os; // 운영체제 버전
	
	public void Print() {
		System.out.println("전화번호: " + this.tel);
		System.out.println("탭 가능 여부: " + this.touch);
		System.out.println("운영체제 버전: " + this.os);
	}
}

// 오버라이팅 :: 부모 클래스의 메소드를 자식 클래스에서 "재정의"하는 문법
//		=> 함수의 내용을 "덮어쓰기" 한다.
// 함수 이름과 매개변수 구성 모두 똑같이 해서 "덮어쓰기" 수행
// 오버라이딩은 다른 클래스끼리 일어난다.

public class Extends {
	public static void main(String[] args) {
		// Phone 클래스에 대한 객체 생성
		Phone p = new Phone();
		p.tel = "010-1234-5678";
		p.touch = false;
		
		// SmartPhone 클래스에 대한 객체 생성
		SmartPhone sp = new SmartPhone();
		sp.tel = "010-2272-6311";
		sp.touch = true;
		sp.os = "Icecream_sandwich";
		
		p.Print();
		System.out.println();
		sp.Print();
	}
}
