package myJava15;

class CTest1512 implements Runnable {
	private String id;

	public CTest1512(String str) {
		id = str;
	}

	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep((int) (100 * Math.random()));
			} catch (InterruptedException e) {
			}
			System.out.println(id + " " + i);
		}

	}
}

public class Class12 {

	public static void main(String[] args) {
		CTest1512 hi = new CTest1512("Hello");
		CTest1512 bye = new CTest1512("Good bye");
		CTest1512 morning = new CTest1512("Good morning");
		CTest1512 night = new CTest1512("Good night");
		Thread t1 = new Thread(hi);
		Thread t2 = new Thread(bye);
		Thread t3 = new Thread(morning);
		Thread t4 = new Thread(night);
		t1.start();
		try {
			t1.join();
			t3.start();
			t3.join();
			t4.start();
			t4.join();
			t2.start();
			t2.join();
		} catch (InterruptedException e) {
		}
		System.out.println("All Threads are finished");
	}
}