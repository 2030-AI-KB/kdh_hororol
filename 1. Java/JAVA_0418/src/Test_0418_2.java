abstract class Shape{
	abstract public double getSize();
	abstract public void Print();
}

class Circle extends Shape{
	int radius;
	
	public Circle(int r){
		this.radius = r;
	}
	
	public double getSize() {
		return this.radius * this.radius * 3.14;
	}
	
	public void Print() {
		System.out.println("원에 대한 객체입니다.");
		System.out.println("반지름: " + this.radius);
		System.out.println("이 원의 넓이는 " + getSize() + "입니다.");
	}
}

class Triangle extends Shape{
	int w;
	int h;
	boolean tf;
	
	public Triangle(int w, int h, boolean tf){
		this.w = w;
		this.h = h;
		this.tf = tf;
	}
	
	public double getSize() {
		return this.w * this.h * 0.5;
	}
	
	public void Print() {
		if(this.tf == true) {
			System.out.println("직각삼각형에 대한 객체입니다.");
			System.out.println("밑변: " + this.w);
			System.out.println("높이: " + this.h);
			System.out.println("이 직각삼각형의 넓이는 " + getSize() + "입니다.");
		}
		else {
			System.out.println("삼각형에 대한 객체입니다.");
			System.out.println("밑변: " + this.w);
			System.out.println("높이: " + this.h);
			System.out.println("이 삼각형의 넓이는 " + getSize() + "입니다.");
		}
	}
}

class Rectangle extends Shape{
	int w;
	int h;
	
	public Rectangle(int w, int h){
		this.w = w;
		this.h = h;
	}
	
	public double getSize() {
		return w * h;
	}
	
	public void Print() {
		System.out.println("사각형에 대한 객체입니다.");
		System.out.println("밑변: " + this.w);
		System.out.println("높이: " + this.h);
		System.out.println("이 사각형의 넓이는 " + getSize() + "입니다.");
	}
}

public class Test_0418_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// * shape 클래스 생성 (추상 클래스로 생성하기)
		// - getSize() :: 추상 메소드, 넓이 반환하는 함수
		// - Print() :: 각 멤버 변수에 대한 값을 출력하는 함수
		//
		// * Circle 클래스 생성
		// - 멤버 변수 :: radius(반지름)
		// - shape 상속받아 getSize() 구성하기
		//
		// * Triangle 클래스 생성
		// - 멤버 변수 :: w(밑변), h(높이), boolean tf(직각삼각형인지 아닌지)
		// - shape 상속받아 getSize() 구성하기
		// - right() :: 직각삼각형인지 아닌지 출력해주는 함수
		// 
		// * Rectangle 클래스 생성
		// - 멤버 변수 :: w(밑변), h(높이)
		// - shape 상속받아 getSize() 구성하기
		//
		// * main에서 수행할 명령문
		// - Circle에 대한 객체 생성
		// - Triangle에 대한 객체 생성
		// - Rectangle에 대한 객체 생성
		//(객체 생성 시, 각 멤버 변수 초기화하기)
		// - 각 객체에 대하여 Print, getSize 함수 실행
		// (ex) "원 객체입니다.
		// 		 반지금: 5"
		//		"이 원의 넓이는 78.5입니다."
		
		Circle c = new Circle(5);
		Triangle t = new Triangle(10, 5, true);
		Rectangle r = new Rectangle(11,3);

		c.Print();
		System.out.println();
		t.Print();
		System.out.println();
		r.Print();
	}

}
