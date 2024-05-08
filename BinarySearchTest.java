package divideconquer;

import java.util.Scanner;

public class BinarySearchTest {

	public static void main(String[] args) {
		int[] numArr = { 2, 3, 7, 9, 11, 14, 17, 22, 26 };

		Scanner in = new Scanner(System.in);
		System.out.println("찾을 숫자 : ");
		int num = in.nextInt();

		// System.out.println(binarySearchRec(num, numArr, 0, numArr.length - 1));
		System.out.println(binarySearch(num, numArr));
	}

	static int binarySearch(int number, int[] numArr) {
		int start = 0;
		int end = numArr.length - 1;

		while (start <= end) {
			int mid = (start + end) / 2;
			if (number == numArr[mid])
				return mid;
			else if (number < numArr[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}

		return -1;
	}

	static int binarySearchRec(int number, int[] numArr, int start, int end) {
		// base condition
		if (start > end)
			return -1;

		// divide
		int mid = (start + end) / 2;

		// conquer
		if (number == numArr[mid])
			return mid;

		// divide 해서 재귀 호출
		if (number < numArr[mid]) {
			end = mid - 1;

		} else {
			start = mid + 1;
		}
		return binarySearchRec(number, numArr, start, end);
	}

}
