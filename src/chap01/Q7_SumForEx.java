package chap01;
import java.util.Scanner;
//1, 2, ..., n 의 합을 구합니다

public class Q7_SumForEx {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("1부터 n까지의 합");
		System.out.print("n의 값: ");
		
		int n = stdIn.nextInt();
		
		int sum = 0;
		for(int i=1; i<=n; i++) {
			sum += i;
			if(i<n) {
			System.out.print(i + "+");
			} else { 
				System.out.print(i);
			}
		}
		System.out.print("=" + sum);
	}
}
