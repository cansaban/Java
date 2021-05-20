public class AdasYordam {

	public int sur(int vites,int motorhacmi) {
		
		int sonuc=vites+motorhacmi;
		System.out.println("sonuc - 1 = "+sonuc);
		return sonuc;
	}
	public void sur(int vites,double motorhacmi) {
		
		double sonuc=vites+motorhacmi;
		System.out.println("sonuc - 2 ="+sonuc);
		
	}
	
	public double sur(double vites,int motorhacmi) {
		double sonuc=vites+motorhacmi;
		System.out.println("sonuc - 3 ="+sonuc);
		return sonuc;
	}
	
	
	
	public static void main(String[] args) {
		
		AdasYordam a1=new AdasYordam();
		a1.sur(3,4);
		a1.sur(3,4.5);
		a1.sur(2.0, 1);

	}

}
