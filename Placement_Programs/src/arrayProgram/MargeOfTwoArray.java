package arrayProgram;

import java.util.Arrays;

public class MargeOfTwoArray {
	public static void main(String[] args) {
		int arrayA[] = { -7, 12, 17, 29, 41, 56, 79, 45 };
		int arrayB[] = { -9, -3, 0, 5, 19, 20 };
		int index = 0;
		int newArray[] = new int[arrayA.length + arrayB.length];
		for (int i = 0; i < arrayA.length + arrayB.length; i++) {
			if (i < arrayA.length) {
				newArray[i]=arrayA[i];
			} else {
				newArray[i]=arrayB[index];
				index++;
			}
		}
		System.out.println(Arrays.toString(newArray));
	}
}
