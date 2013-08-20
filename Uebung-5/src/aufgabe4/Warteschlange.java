package aufgabe4;

public class Warteschlange {
	
	private int size;
	
	private int maxSize;
	
	private int[] queue;
	
	private int insertPos, getPos;
	
	public Warteschlange(int maxSize) {
		this.size = 0;
		this.maxSize = maxSize;
		this.queue = new int[maxSize];
		this.insertPos = 0;
		this.getPos = 0;
	}
	
	public int size() {
		return this.size;
	}
	
	public void enqueue(int i) {
		queue[insertPos] = i;
		if (size == maxSize) {
			getPos = (insertPos + 1) % maxSize;
		}
		insertPos = (++insertPos) % maxSize;
		size++;
	}
	
	public int dequeue() /*throws Exception*/ {
		if (size != 0) {
			int element = queue[getPos];
			queue[getPos] = 0;
			getPos = (++getPos) % maxSize;
			size--;
			return element;
		} else {
			/*throw new Exception("Queue is empty!", null);*/
			return 0;
		}
	}
	
	public String toString() {
		String s = "";
		for (int i:queue)
			s += i + " ";
		return s;
	}
	
	public static void main(String[] args) {
		Warteschlange w = new Warteschlange(5);
		w.enqueue(1);
		w.enqueue(2);
		w.enqueue(3);
		w.enqueue(4);
		w.enqueue(5);
		w.enqueue(6);
		System.out.println(w.toString());
		System.out.println(w.dequeue());
		System.out.println(w.dequeue());
		w.enqueue(111);
		System.out.println(w.toString());
		System.out.println(w.dequeue());
		System.out.println(w.dequeue());
		System.out.println(w.dequeue());
		System.out.println(w.dequeue());
	}

}
