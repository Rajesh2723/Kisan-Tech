package without_mulkti;

public class Task extends Thread{
	char ch;
	
	public Task(char ch) {
		super();
		this.ch=ch;
	}
	@Override
	public void run() {
		for(int i=0;i<3;i++) {
			System.out.println("che:"+ch);
		}
	}
}


///////main part class
package without_mulkti;

public class ThreadOne {

	public static void main(String[] args) {
		 System.out.println("");
		 Task t1=new Task('a');
		 t1.start();
		 Task t2=new Task('R');
		 t2.start();
		 System.out.println("");
	}

	 

}
