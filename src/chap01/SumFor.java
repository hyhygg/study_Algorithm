package chap01;
import java.util.Scanner;
// 1, 2, ..., n 의 합을 구합니다

public class SumFor {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다");
		System.out.print("n의 값: ");
		int n = stdIn.nextInt();
		
		int sum = 0;   // 합
		
		for (int i = 1; i <= n; i++) {
			sum += i;  // sum에 i를 더합니다
		}
		
		/*
		int i = 1;
		for (;;) {
			if (i <= n) {
				sum += i++;
			} else {
				break;
			}
		}
		*/
		
		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다");

	}
}
