package chap02;

public class Int3DArray {
	public static void main(String[] args) {
		int[][][] x = new int[2][2][3];		// 3차원 배열을 선언 (행/열/깊이)
		
		x[0][0][1] = 10;			
		x[1][1][1] = 20;
		x[1][1][2] = 30;
		
		for(int i=0; i < 2; i++) {		// 각 요소의 값을 출력
			for(int j=0; j < 2; j++) {
				for(int k=0; k < 3; k++) {
				System.out.println("x[" + i + "][" + j + "][" + k + "] = " + x[i][j][k]);
				}
			}
		}
	}
}
