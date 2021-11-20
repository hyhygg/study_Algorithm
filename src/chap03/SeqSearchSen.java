package chap03;
import java.util.Scanner;
// 선형 검색 (보초법)

public class SeqSearchSen {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("요솟수: ");
		int num = stdIn.nextInt();
		int[] x = new int[num + 1];	// 요솟수 num + 1
		
		for(int i=0; i < num; i++) {
			System.out.println("x[" + i + "] : ");
			x[i] = stdIn.nextInt();
		}
		
		System.out.print("검색할 값 : ");	// 키 값을 입력
		int ky = stdIn.nextInt();
		
		int idx = seqSearch(x, num, ky);	// 배열 x애서 키 값이 ky인 요소를 검색
		
		if(idx == -1) {
			System.out.println("그 값의 요소가 없습니다.");
		} else {
			System.out.println(ky+"은(는) x[" + idx + "]에 있습니다.");
		}
	}
	
	// 요솟수가 n인 배열 a애서 key와 같은 요소를 보초법으로 선형 검색
	static int seqSearch(int[] a, int n, int key) {
		int i = 0;
		
		a[n] = key;		// 보초를 추가
		
		while(true) {
			if(a[i] == key) {	// 검색 성공
				break;
			}
			i++;
		}
		return i == n ? -1 : i;
	}
}
