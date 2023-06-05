import java.util.Scanner;

public class Test_0413_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// - 반복 :: 10950(A+B-3) / 10952(A+B-5)
		// - 배열 :: 10871(X보다 작은 수)
		
		Scanner sc = new Scanner(System.in);
//		
//		int n = sc.nextInt();
//		int arr[] = new int[6];
//		for(int i = 1; i <= n; i++) {
//			int a = sc.nextInt();
//			int b = sc.nextInt();
//			
//			arr[i-1] = a+b;
//		}
//		
//		for(int i = 0; i <n-1; i++) {
//			System.out.println(arr[i-1]);
//		}
		
//		while(true) {
//			int a = sc.nextInt();
//			int b = sc.nextInt();
//			
//			if(a == 0 && b == 0) {
//				break;
//			}
//			System.out.println(a+b);
//		}
		
		int n = sc.nextInt(); // 배열의 사이즈인 n을 받는다.
		int arr[] = new int[n]; // 
		int x = sc.nextInt();
		
		for(int i = 0; i <n; i++) {
			arr[i] = sc.nextInt();
			if(arr[i] < x) {
				System.out.println(arr[i]);
			}
		}
		
		
	}

}
