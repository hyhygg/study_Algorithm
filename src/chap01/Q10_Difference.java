package chap01;

import java.util.Scanner;

/* 
 * a,b 정수 입력 b-a 출력
 * a의 값: 6
 * b의 값: 6
 * a보다 큰 값을 입력하세요!
 * b의 값: 8
 * b-a는 2입니다
*/
public class Q10_Difference {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("a의 값: ");
		int a = stdIn.nextInt();
		System.out.print("b의 값: ");
		int b = stdIn.nextInt();
		if(b<=a) {
			System.out.println("a보다 큰 값을 입력하세요!");
			System.out.print("b의 값: ");
			b = stdIn.nextInt();
		} else {
			int min = b - a;
			System.out.println("b-a는 " + min + " 입니다.");
		}
	}
	
	
	
}
