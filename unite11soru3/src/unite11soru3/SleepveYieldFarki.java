package unite11soru3;

public class SleepveYieldFarki {

	class SleepOrnek extends Thread {
		
		public SleepOrnek(String sleepIsim) {
			super(sleepIsim);
		}
		
		public void run() {
			
			try {
				String isim = this.getName();
				
				for(int i = 0 ; i < 5 ; i++) {
					if ((isim.equals("Sleep1") && (i==3) ) ) {
						System.out.println(isim+"-> uyutuluyor");
						Thread.sleep(100);
					}else if ((isim.equals("Sleep2") && (i==2) )) {
						System.out.println(isim+"-> uyutuluyor");
						Thread.sleep(150);
					}else if ((isim.equals("Sleep3") && (i==4) )) {
						System.out.println(isim+"--> uyutuluyor");
						Thread.sleep(250);
					}
					System.out.println(isim+"-->"+i);
					
				}
				
			} catch (InterruptedException e) {
				System.out.println("Hata olustu -->"+e);
			}
			
		}
		

	}
	
	class YieldOrnek extends Thread {

		public YieldOrnek(String yieldIsim) {
			super(yieldIsim);
		}
		
		public void run() {
			
			for(int i = 0 ; i < 5; i++) {
			System.out.println(this.getName()+"<->" +i);
			Thread.yield(); // veya this.yield()
			}
		}
		
		
	}
	
	
	public static void main(String[] args) throws Exception {
		
		 //Sleep ornek
		// - - - - - - - - - - - -- - - - - - -
		
	/*	SleepOrnek s1 = new SleepveYieldFarki().new SleepOrnek("Sleep1");
		SleepOrnek s2 = new SleepveYieldFarki().new SleepOrnek("Sleep2");
		SleepOrnek s3 = new SleepveYieldFarki().new SleepOrnek("Sleep3");
		s1.start();
		s2.start();
		s3.start();
		*/ 
		// - - - - - - - - - - - -- - - - - - -
		
		//Yield ornek
		// - - - - - - - - - - - -- - - - - - -
		
		YieldOrnek yo1 = new SleepveYieldFarki().new YieldOrnek("Yield1");
		YieldOrnek yo2 = new SleepveYieldFarki().new YieldOrnek("Yield2");
		YieldOrnek yo3 = new SleepveYieldFarki().new YieldOrnek("Yield3");
		
		
		yo1.setPriority(Thread.MAX_PRIORITY); // 10
		yo2.setPriority(Thread.MAX_PRIORITY-2); // 8
		yo3.setPriority(Thread.MAX_PRIORITY-4); // 6 
		
		yo1.start();  
		yo2.start();  
		yo3.start(); 
		
		 
	}

}
