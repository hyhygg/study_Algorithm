package chap02;
// 배열을 복제

public class CloneArray {
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};  // 생성 + 초기화
		int[] b = a.clone();  // 깊은 복제 (별도의 메모리 공간 만듬)
		int[] c = a;  // 얉은 복제 (같은 메모리 공간을 공유)
		
		b[3] = 0;
		
		System.out.print("a = ");		
		for(int i=0; i<a.length; i++) {  
			System.out.print(" " + a[i]);
		}
		
		System.out.print("\nb = ");
		for(int i=0; i<b.length; i++) {  
			System.out.print(" " + b[i]);
		}
		
		System.out.print("\nc = ");
		for(int i=0; i<c.length; i++) {  
			System.out.print(" " + c[i]);
		}
	}
}
