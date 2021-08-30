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
		int no;
		
		do {
			System.out.print("양의 정수를 입력: ");
			no = stdIn.nextInt();
		} while (no <= 0);
		
		if(no / 10 < 1) {
			System.out.println("그 수는 1자리입니다.");
		} else if(no / 100 < 1) {
			System.out.println("그 수는 2자리입니다.");
		} else if(no / 1000 < 1) {
			System.out.println("그 수는 3자리입니다.");
		} else if(no / 10000 < 1) {
			System.out.println("그 수는 4자리입니다.");
		} else if(no / 100000 < 1) {
			System.out.println("그 수는 5자리입니다.");
		}
	}
}