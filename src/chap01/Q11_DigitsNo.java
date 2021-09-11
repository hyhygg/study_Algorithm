package chap01;
import java.util.Scanner;
/* 
 * 양의 정수를 입력하고 자릿수를 출력
 * ex. 135 입력 - '그 수는 3자리입니다' 출력
 * 	   1314 입력 - '그 수는 4자리입니다' 출력
 */

public class Q11_DigitsNo {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int num;
		
		do {
			System.out.print("양의 정수값：");
			num = stdIn.nextInt();
		} while (num <= 0);
		
		int cnt = 0;
		
		while(num / 10 != 0) {
			cnt++;
			num /= 10;
		}
		
		System.out.println("그 수는 " + (cnt + 1) + "자리입니다.");
	}
}