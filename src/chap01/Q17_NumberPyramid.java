package chap01;
import java.util.Scanner;
// n단의 숫자 피라미드 출력

public class Q17_NumberPyramid {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("단 수: ");
		int n = stdIn.nextInt();
		
		npira(n);
	}
	
	static void npira(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i+1; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=(i-1)*2+1; j++) {
					System.out.print(i%10);
			}
			System.out.println();
		}
	}
}
