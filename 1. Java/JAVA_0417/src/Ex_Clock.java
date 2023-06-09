import java.util.Scanner;

public class Ex_Clock {

	// 문제. 현재 시각을 입력받고 아래의 함수를 실행하게끔하여라
	// 1) clock() :: 현재 시각(시, 분 , 초)을 전달받아 양식대로 출력하는 함수
	static void clock(int h, int m, int s) {
		// 시, 분, 초에 대한 정보 전달 -> 매개변수를 3개로 선언
		// void를 반환형으로 선언할 때에는, return문 사용X
		System.out.println("현재 시각은 " + h + "시 " + m + "분 " + s + "초입니다." );
	}
	
	// 2) ap() :: 현재가 오전인지 오후인지 출력하는 함수
	static void ap(int h) {
		if(h<12) { // "시 정보다 12보다 작다면"
			System.out.println("현재는 오전입니다.");
		}else {
			System.out.println("현재는 오후입니다.");
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		int s = sc.nextInt();
		
		// 2. 현재 시각 출력하는 함수 호출(참조)
		clock(h, m, s);
		
		// 3. 오전인지 오후인지를 출력하는 함수 호출(참조)
		ap(h);
	}

}
