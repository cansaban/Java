package unite11soru3;

class YarisArabasi1 extends Thread {
	
	public void run() {
		
		for (int i = 0 ; i < 10 ; i++) {
			try {
				
				if(Thread.interrupted()) {
					System.out.println("YarisArabasiBir-Uykusu bolundu - " +Thread.interrupted());
				}
				System.out.println("YarisArabasi1 uyuyor...");
				Thread.sleep(40*1000);
				
				} catch (InterruptedException iex) {
				// TODO: handle exception
			}
		}
	}
	
}

class YarisArabasi2 extends Thread {
	
	public void run() {
		for (int i = 0 ; i < 10 ; i++) {
		
		try {
			
			if(this.isInterrupted()) {
				System.out.println("YarisArabasiIký-Uykusu bolundu - " +this.isInterrupted());
				}
			System.out.println("YarisArabasi2 uyuyor...");
			Thread.sleep(60*1000);
			
			} catch (InterruptedException iex) {
			// TODO: handle exception
			}
		}
	}	
}
 
public class UykuTest {

	public static void main(String[] args) {
		YarisArabasi1 ya1= new YarisArabasi1();
		YarisArabasi2 ya2 = new YarisArabasi2();
		
		ya1.start();
		ya2.start();
		
		ya1.interrupt();
		ya2.interrupt();

	}

}
