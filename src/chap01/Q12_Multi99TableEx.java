package chap01;
// 위쪽과 왼쪽에 곱하는 수가 있는 곱셈표 출력

public class Q12_Multi99TableEx {
	public static void main(String[] args) {
		
		System.out.println();
		System.out.print("   |");
		for(int i=1; i<10; i++) {
			System.out.printf("%3d", i);
		}
		System.out.println();
		System.out.println("---+---------------------------");
		
		for(int i=1; i<10; i++) {
			System.out.print(" "+i+" "+"|");
			for(int j=1; j<10; j++) {
				System.out.printf("%3d", j*i);
			}
			System.out.println();
		}
	}
}
