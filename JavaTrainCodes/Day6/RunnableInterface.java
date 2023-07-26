package without_mulkti;

public class ThreadOne {

	public static void main(String[] args) {
		 System.out.println("");
		 Task t1=new Task('a');
		 t1.start();
		 Thread th1=new Thread(t1);
		 
		 Task t2=new Task('R');
		 Thread th2=new Thread(t2);
		 
		 t2.start();
		 System.out.println("");
	}

	 

}

package RunnableInterface;

public class Task implements Runnable{
	char ch;
	
	public Task(char ch) {
		super();
		this.ch=ch;
	}
	@Override
	public void run() {
		for(int i=0;i<3;i++) {
			System.out.println("che:"+ch);
			ch++;
		}
	}
}
