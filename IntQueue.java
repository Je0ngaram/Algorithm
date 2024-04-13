package Queue;

public class IntQueue {
	private int[] queue;
	private int front;
	private int rear;
	private int size;
	private int capacity;

	public IntQueue(int capacity) {
		queue = new int[capacity];
		front = rear = size = 0;
		this.capacity = capacity;
	}

	public boolean enqueue(int data) {
		if (isFull())
			// return false;
			throw new OverflowIntQueueException(); // 큐가 가득 차면 예외 발생

		queue[rear++] = data;
		if (rear == capacity)
			rear = 0;
		size++;
		return true;
	}

	public int dequeue() {
		if (size == 0)
			// return -1;
			throw new EmptyIntQueueException(); // 큐가 비어 있으면 예외 발생
		int result = queue[front++];
		if (front == capacity)
			front = 0;
		size--;
		return result;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean isFull() {
		return size == capacity;
	}

	public int getFront() {
		if (isEmpty())
			// return -1;
			throw new EmptyIntQueueException(); // 큐가 비어 있으면 예외 발생
		return queue[front];
	}
	
	public int size() {
		return size;
	}
	
	public int getCapacity() {
		return capacity;
	}

	public void clear() {
		size = front = rear = 0;
	}

	public void dump() {
		// empty
		if (isEmpty()) {
			System.out.println("Queue가 비어 있습니다.");
		}
		// front < rear
		else if (front < rear) {
			for (int i = front; i < rear; i++) {
				System.out.print(queue[i] + " ");
			}
			System.out.println();
		}
		// front >= rear
		else {
			// front -> capacity - 1
			for (int i = front; i < capacity; i++) {
				System.out.print(queue[i] + " ");
			}
			// 0 -> rear - 1
			for (int i = 0; i < rear; i++) {
				System.out.print(queue[i] + " ");
			}
			System.out.println();
		}
	}
	
	// 내부 클래스로 EmptyIntQueueException 정의
	public static class EmptyIntQueueException extends RuntimeException {
		public EmptyIntQueueException() {
			super("Queue is empty");
		}
	}
	
	// 내부 클래스로 OverflowIntQueueException 정의
	public static class OverflowIntQueueException extends RuntimeException {
		public OverflowIntQueueException() {
			super("Queue is full");
		}
	}
}