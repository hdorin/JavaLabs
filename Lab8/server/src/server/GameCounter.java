package server;

public class GameCounter {
	private int counter;
	public GameCounter() {
		counter=0;
	
	}
	public synchronized void increment() {
		counter++;
	}
	public synchronized void decrement() {
		counter--;
	}
	public int getCounter() {
		return counter;
	}
}
