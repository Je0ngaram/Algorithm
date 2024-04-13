package Queue;

import java.util.Scanner;

public class IntQueueTester {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		IntQueue s = new IntQueue(64); // �ִ� 64���� ��ť�� �� �ִ� ť

		while (true) {
			System.out.println(); // �޴� ������ ���� �� �� �߰�
			System.out.printf("���� ������ ����: %d / %d\n", s.size(), s.getCapacity());
			System.out.print("(1) ��ť (2) ��ť (3) ��ũ (4) ���� (0) ����: ");

			int menu = stdIn.nextInt();
			if (menu == 0)
				break;

			int x;
			switch (menu) {
			case 1: // ��ť
				try {
					System.out.print("������: ");
					x = stdIn.nextInt();
					s.enqueue(x);
				} catch (IntQueue.OverflowIntQueueException e) {
					System.out.println("ť�� ���� á���ϴ�.");
				}
				break;

			case 2: // ��ť
				try {
					x = s.dequeue();
					System.out.println("��ť�� �����ʹ� " + x + "�Դϴ�.");
				} catch (IntQueue.EmptyIntQueueException e) {
					System.out.println("ť�� ��� �ֽ��ϴ�.");
				}
				break;

			case 3: // ��ũ
				try {
					x = s.getFront();
					System.out.println("��ũ�� �����ʹ� " + x + "�Դϴ�.");
				} catch (IntQueue.EmptyIntQueueException e) {
					System.out.println("ť�� ��� �ֽ��ϴ�.");
				}
				break;

			case 4: // ����
				s.dump();
				break;
			}
		}
	}
}