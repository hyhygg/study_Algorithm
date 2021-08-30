package chap01;
// 입력한 수를 한 변으로 하는 정사각형을 * 기호로 출력

import java.util.Scanner;

public class Q14_Square {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("사각형을 출력합니다.");
		System.out.print("단 수: ");
		int n = stdIn.nextInt();

		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
