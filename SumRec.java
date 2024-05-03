package recursive; //재귀 함수 연습 (1부터 N 까지의 합 구하기)

public class SumRec {

	public static void main(String[] args) {
		int N = 5;
		
		System.out.println(sumRec(N));

	}

	static int sumRec(int number) {
		// 1. base condition
		if (number == 1) return 1;
		
		// 2. recursive decomposition & 조합
		return number + sumRec(number - 1);
		
	}
	
}
