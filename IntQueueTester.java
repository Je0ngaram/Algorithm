package Queue;

import java.util.Scanner;

public class IntQueueTester {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		IntQueue s = new IntQueue(64); // 최대 64개를 인큐할 수 있는 큐

		while (true) {
			System.out.println(); // 메뉴 구분을 위한 빈 행 추가
			System.out.printf("현재 데이터 개수: %d / %d\n", s.size(), s.getCapacity());
			System.out.print("(1) 인큐 (2) 디큐 (3) 피크 (4) 덤프 (0) 종료: ");

			int menu = stdIn.nextInt();
			if (menu == 0)
				break;

			int x;
			switch (menu) {
			case 1: // 인큐
				try {
					System.out.print("데이터: ");
					x = stdIn.nextInt();
					s.enqueue(x);
				} catch (IntQueue.OverflowIntQueueException e) {
					System.out.println("큐가 가득 찼습니다.");
				}
				break;

			case 2: // 디큐
				try {
					x = s.dequeue();
					System.out.println("디큐한 데이터는 " + x + "입니다.");
				} catch (IntQueue.EmptyIntQueueException e) {
					System.out.println("큐가 비어 있습니다.");
				}
				break;

			case 3: // 피크
				try {
					x = s.getFront();
					System.out.println("피크한 데이터는 " + x + "입니다.");
				} catch (IntQueue.EmptyIntQueueException e) {
					System.out.println("큐가 비어 있습니다.");
				}
				break;

			case 4: // 덤프
				s.dump();
				break;
			}
		}
	}
}