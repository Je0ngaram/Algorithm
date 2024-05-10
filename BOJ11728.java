package twopointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ11728 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// N, M
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		// 배열 A [N]
		int[] A = new int[N];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		// 배열 B [M]
		int[] B = new int[M];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++) {
		B[i] = Integer.parseInt(st.nextToken());
		}
		
		// 정렬 순서 출력
		StringBuilder sb = new StringBuilder();
		int pA = 0, pB = 0;
		while (pA < N && pB < M) {
			if (A[pA] <= B[pB]) {
				sb.append(A[pA++] + " ");
			} else {
				sb.append(B[pB++] + " ");
			}
		}
		
		// A에 남은 것 출력
		while (pA < N) {
			sb.append(A[pA++] + " ");
		}
		
		// B에 남은 것 출력
		while (pB < M) {
			sb.append(B[pB++] + " ");
		}
		System.out.println(sb);
	}

}
