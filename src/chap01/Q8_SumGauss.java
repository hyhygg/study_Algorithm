package chap01;
// 가우스의 덧셈으로 1부터 n까지의 정수 합 구하기

import java.util.Scanner;

public class Q8_SumGauss {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println();
		System.out.println("1부터 n까지의 정수 합");
		System.out.print("n의 값: ");
		int n = stdIn.nextInt();

		for(int i=1; i<=n; i++) {
			if(i==n) {
				System.out.println("(1+"+n+")*"+i/2);
				int sum = (1 + n) * i / 2;
				System.out.println("1부터 n까지의 정수 합: " + sum);
				
				// 1  2  3  4  5  6 = 1+6, 2+5, 3+4
			} else {
				System.out.print("");
			}
		}	
	}
}
