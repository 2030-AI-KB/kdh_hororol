import java.util.Scanner;

public class Test_0417_1 {
	
	static void clock(int h, int m, int s) {
		System.out.println("현재 시각은 " + h + "시 " + m + "분 " + s + "초입니다.");
	}
	
	static void ap(int h) {
		if(h<12) {
			System.out.println("현재는 오전입니다.");
		}else {
			System.out.println("현재는 오후입니다.");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// * 현재 시각을 입력받고 아래의 함수를 실행하게끔 하여라(현재 시각 입력은 main 함수에서 받도록한다.)
		// - clock(int, int, int) :: 현재 시각(시, 분, 초) 입력받아 양식대로 출력하는 함수
		// "현재 시각은 h시 m분 s초입니다."
		// - ap(int) :: 현재가 낮인지 밤인지 출력하는 함수
		// "현재는 낮입니다." or "현재는 밤입니다."
		int h = sc.nextInt();
		int m = sc.nextInt();
		int s = sc.nextInt();
		
		clock(h, m, s);
		ap(h);
		
	}

}
