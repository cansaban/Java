public class Kupa {

	int adet;
	String desen;
	
	public Kupa(int adet) {
		this(5,"Grafiti");
		this.adet=adet;
		System.out.println("Kupa(int sayi=)"+adet);
		
	}
	public Kupa(int adet,String desen) {
		this.adet=adet;
		this.desen=desen;
		System.out.println("Kupa(int sayi="+adet+ "String Desen=)"+desen);
	}
	
	public static void main(String[] args) {
		Kupa k=new Kupa(2);
		

	}

}
