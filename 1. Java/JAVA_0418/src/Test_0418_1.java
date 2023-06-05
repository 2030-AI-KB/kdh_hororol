class Clock{
	public int hour;
	public int min;
	public int sec;
	
	Clock(int hour, int min, int sec){
		System.out.println("새로운 시각에 대한 객체 생성합니다.");
		this.hour = hour;
		this.min = min;
		this.sec = sec;
	}
	
	public void Print() {
		System.out.println(this.hour + "시 " + this.min + "분 " + this.sec + "초입니다." );
	}
	public void Print2() {
		if(this.hour > 12) {
			System.out.println("현재는 오후입니다. PM " + (this.hour-12) + ":" + this.min + ":" + this.sec );
		}
		else {
			System.out.println("현재는 오전입니다. AM " + this.hour + ":" + this.min + ":" + this.sec );
		}
	}
}
public class Test_0418_1 {

	public static void main(String[] args) { 
		// * 시계 클래스 만들기
		// - 멤버 변수 :: 시(hour), 분(min), 초(sec)
		// - 멤버 함수 ::
		//	- 현재 시각 양식대로 출력하는 메소드
		//	- 오전인지 오후인지를 출력해주고 표준 시각대로 출력해주는 메소드
		//		(ex) 23:59:59	-> "현재는 오후입니다. PM 11:59:59"
		// - 생성자 :: "새로운 시각에 대한 객체 생성합니다." 출력한 뒤, 각 변수 초기화
		//
		// * 객체 생성
		// - 9:10:00의 정보를 갖는 객체 생성
		// - 4:70:00의 정보를 갖는 객체 생성
		//
		// * 각 객체에 대하여 2개의 메소드 실행하기
		Clock c = new Clock(9,10,30);
		Clock c1 = new Clock(16,40,00);
		
		c.Print();
		c.Print2();
		System.out.println();
		c1.Print();
		c1.Print2();
		
	}

}
