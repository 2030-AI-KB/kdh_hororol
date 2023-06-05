import java.util.Scanner;

public class Test_0411_3 {
	public static void main(String[] args) {
		/*
		 * *사칙연산 문제
		 * 정수를 2개 입력받고
		 * +, -, *, /, % 연산의 결과를 출력하세요
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a? ");
		int a = sc.nextInt();	// 첫번째 정수 입력받기
		
		System.out.print("b? ");
		int b = sc.nextInt();	// 두번째 정수 입력받기
		
		// => +, -, *, /, % 연산의 결과를 출력하세요
		// + :: 출력값을 이어주는 역할
		// % :: 두 정수를 나눈 후 나머지를 구해주는 연산자
		System.out.println("a + b = " + (a + b));
		System.out.println("a - b = " + (a - b));
		System.out.println("a x b = " + (a * b));
		System.out.println("a / b = " + (a / b));
		System.out.println("a % b = " + (a % b));
		
	}
}