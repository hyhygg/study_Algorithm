package chap02;

public class ReverseArray {

	public static void main(String[] args) {
		int[] arr = {22, 57, 11, 32, 91, 68, 70};
		int t = 0;
		
		for(int i=0; i < arr.length / 2; i++) {
			t = arr[i];
			arr[i] = arr[arr.length-i-1];
			arr[arr.length-i-1] = t;
		}
		
		for(int j=0; j<arr.length; j++) {
			if(j == arr.length - 1) {
				System.out.print(arr[j]);
			} else {
				System.out.print(arr[j]+", ");
			}
		}
	}
}
