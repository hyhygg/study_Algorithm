package chap02;
import java.util.Scanner;
// 배열 b의 모든 요소를 배열 a에 역순으로 복사

public class Q5_Rcopy {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("배열 b의 요솟수 : ");
		int nb = stdIn.nextInt();
		
		int[] b = new int[nb];
		
		for (int i=0; i<nb; i++) {
			System.out.print("b[" + i + "] : ");
			b[i] = stdIn.nextInt();
		}
		
		int[] a = new int[nb];
		
		rcopy(a, b);
		
		System.out.println("배열 b의 요소를 배열 a에 역순으로 복사합니다." );
		for (int i=0; i<nb; i++) {
			System.out.println("a[" + i + "] : " + a[i]);
		}
	}
	
	static void rcopy(int[] a, int[] b) {
//		for(int i=0; i<b.length; i++) {
//			for (int j=b.length-1; j>=0; j--) {
//			a[i] = b[j];
//			}
//		}
		for(int i=0; i<b.length; i++) {
			a[i] = b[b.length - i - 1];
		}
	}
}
