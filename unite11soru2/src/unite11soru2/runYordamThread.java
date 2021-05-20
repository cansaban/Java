package unite11soru2;


class ornekThread extends Thread {
	
	public ornekThread(String threadIsim) {
		super(threadIsim);
	}
	
	public void run() {
		
		for (int i = 0 ; i<4 ; i ++) {
			System.out.println(this.getName()+"-->"+i);
		}
		
		
	}
}


public class runYordamThread {

	public static void main(String[] args) {
		
		ornekThread o1 = new ornekThread("OrnekThread1");
		ornekThread o2 = new ornekThread("OrnekThread2");
		ornekThread o3 = new ornekThread("OrnekThread3");
		ornekThread o4 = new ornekThread("OrnekThread4");
		
		o1.setPriority(Thread.MAX_PRIORITY);
		o2.setPriority(Thread.MAX_PRIORITY-1);
		o3.setPriority(Thread.MAX_PRIORITY-2);
		o4.setPriority(Thread.MAX_PRIORITY-3);
		
		o1.start();
		o2.start();
		o3.start();
		o4.start();
		
		/*for (int i = 1 ; i< 5 ;i++) {
			//String str = "i"+Integer.toString(i);
		
		new ornekThread("OrnekThread"+i).start();
			
		
		}*/

	}

}