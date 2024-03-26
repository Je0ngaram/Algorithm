package Chap02;

public class ReversArray {

	public static void main(String[] args) {
		int[] numArr = {0, 1, 2, 3, 4};
		
		//배열 역순 정렬
		reversArray(numArr);
		
		//배열 출력
		displayArray(numArr);

	}

	static void reversArray(int[] numArr) {
		for(int i = 0; i < numArr.length/2; i++) {
			swapArr(numArr, i, numArr.length - 1 - i);
		}
	}
	
	static void swapArr(int[] numArr, int source, int target) {
		int temp = numArr[source];
		numArr[source] = numArr[target];
		numArr[target] = temp;
	}
	
	static void displayArray(int[] numArr) {
		for (int i = 0; i < numArr.length; i++)
			System.out.print(numArr[i] + " ");
		System.out.println();
	}
}
