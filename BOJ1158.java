package lec0503;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ1158 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int K = in.nextInt();

		// System.out.println(N + " " + K);

		StringBuilder sb = new StringBuilder();
		sb.append("<");

		// 큐의 역할은 카운팅 당할 참석자를 넣어 놓는데 사용
		Queue<Integer> que = new LinkedList<>();

		// 1. 참석자를 모두 큐에 집어 넣는다.
		for (int i = 1; i <= N; i++) {
			que.offer(i);
		}
		// 4. 큐가 빌 때까지 계속 반복한다.
		while (que.size() > 1) {
			// 2. 큐에서 1부터 k-1번째를 poll 을 하고 offer 한다.
			for (int i = 1; i < K && !que.isEmpty(); i++) {
				que.offer(que.poll());
			}
			// 3. k 번째 poll 하고 출력한다.
			if (!que.isEmpty()) {
				sb.append(que.poll() + ", ");
			}
		}
		sb.append(que.poll() + ">");
		System.out.println(sb);

	}

}
