package chap01;

import java.util.Scanner;

public class Q9_SumOf {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("a값 입력: ");
		int a = stdIn.nextInt();
		System.out.print("b값 입력: ");
		int b = stdIn.nextInt();
		
		System.out.println("두 정수의 합은: " + sumof(a,b));
		
	}
	
	static int sumof(int a, int b) {
		
		int sum= 1;
		
		if(a<b) {
			for(int i=a+1; i<=b; i++) {
				sum += i;
			}
		} else {
			for(int i=b+1; i<=a; i++) {
				sum += i;
			}
		}
		return sum;
	}
}
