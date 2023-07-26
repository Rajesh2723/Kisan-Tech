package ex07.thread_unsafety;

public class MyThread extends Thread {
	private Table table;
	private int number;
	
	public MyThread(Table table, int number) {
		super();
		this.table = table;
		this.number = number;
	}
	
	@Override
	public void run() {
		table.printTable(number);
	}
	
}
