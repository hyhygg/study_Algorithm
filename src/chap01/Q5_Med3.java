package chap01;

public class Q5_Med3 {
	static int med3 (int a, int b, int c) {
			// b > a > c			// c > a > b
		if ((b >= a && c <= a) || (b <= a && c >= a)) {
			return a;
					// a > b > c		// c > b > a
		} else if ((a > b && c < b) || (a < b && c > b)) {
			return b;
		}
		return c;
	}
}
