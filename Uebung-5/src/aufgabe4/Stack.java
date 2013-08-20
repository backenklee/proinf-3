package aufgabe4;

public class Stack {
	
	private int maxSize;
	
	private int size;
	
	private int[] stacky;
	
	public Stack(int maxSize) {
		this.maxSize = maxSize;
		this.size = 0;
		this.stacky = new int[maxSize];
	}
	
	public int size() {
		return size;
	}
	
	public void push(int i) {
		if (size < maxSize) {
			stacky[size] = i;
			size++;
		}
	}
	
	public int pop() {
		if (size > 0) {
			int element = stacky[size-1];
			stacky[size-1] = 0;
			size--;
			return element;
		} else {
			return 0;
		}
	}
	
	public String toString() {
		String s = "";
		for (int i:stacky)
			s += i + " ";
		return s;
	}
	
	public static void main(String[] args) {
		Stack s = new Stack(5);
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		s.push(6);
		System.out.println(s.toString());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.toString());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.toString());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.toString());
	}

}
