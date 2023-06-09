import java.util.Scanner;

public class double_repeat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 2중 반복문
		
		// 예제 :: 4명 학생의 국영수 점수를 입력받고 각 학생의 성적 평균을 내어라.
		// 학생을 행으로 취급, 과목을 열로 취급
		
		// 1. 각 학생의 국영수 점수 입력
		int score[][] = new int[4][3];
		for(int i = 0; i < 4; i++) {
			for(int k = 0; k < 3; k++) {
				score[i][k] = sc.nextInt();
			}
		}
		
		// 2. 각 학생의 성적 평균 연산
		for(int i = 0; i < 4; i++) { // i가 0부터 3번까지
			// (1) 합계 구하기
			int sum = 0;
			for(int k = 0; k < 3; k++) { // k가 0부터 2번까지
				sum += score[i][k];		// 특정 학생의 국영수 점수 덧셈 연산
			}
			// 여기까지 오면, i번째 학생의 국영수 합계가 sum에 저장되어있음
			
			// (2) 평균을 내어서 바로 출력
			double avg = sum/3.0; // double avg = (double)sum/3.0;
			System.out.println(i + "번째 학생의 평균은 " + avg);
		}
		
		
		
	}

}
