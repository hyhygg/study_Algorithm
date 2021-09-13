package chap02;
import java.util.Random;
// 키와 사람 수도 난수로 생성하도록 작성

class Q1_MaxOfArrayRand2 {
	// 배열 a의 최댓값을 구하여 반환
		static int maxOf(int[] a) {
			int max = a[0];
			for(int i = 1; i < a.length; i++) {
				if(a[i] > max) {
					max = a[i];
				}
			}
			return max;
		}
		
		public static void main(String[] args) {
			Random rand = new Random();
			
			System.out.println("키의 최댓값을 구합니다");
			int num = rand.nextInt(10) + 1;
			int[] height = new int[num];
			
			System.out.println("키 값은 아래와 같습니다");
			for(int i=0; i < num; i++) {
				height[i] = 100 + rand.nextInt(90);	// 요소의 값을 난수로 결정 (90: 0~89 정수 값 반환)
				System.out.println("height[" + i + "] : " + height[i]);
			}
			System.out.println("최대값은 " + maxOf(height) + "입니다");
		}
	}
