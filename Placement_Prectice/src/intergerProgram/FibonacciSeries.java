package intergerProgram;

public class FibonacciSeries {
	public static void main(String[] args) {
		int f1 = -1;
		int f2 = 1;
		int f3 = 0;
		int num = 8;
		for (int i = 0; i <=num; i++) {
			boolean flage = false;
			f3 = f2 + f1;
			if (f3 >num) {
				flage = true;
				break;
			}
			if (!flage) {
				System.out.println(f3);
			}
			f1 = f2;
			f2 = f3;
		}
	}
}
