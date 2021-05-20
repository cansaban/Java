package unite7soru5;

interface A1 {
	public void hesapla (double a); 
}

interface A2 {
	public void hesapla(int d);
}

interface A3 {
	public int hesapla();
}

class S1 implements A1,A2 {
	public void hesapla(double a) {
		System.out.println("S1.hesapla " + a);
	}
	public void hesapla(int d) {
		System.out.println("S1.hesapla " + d);
	}
	
}

class S2 implements A1,A3 {
	public void hesapla(double d) {
		System.out.println("S2.hesapla " + d);
	}
	public int hesapla() {
		System.out.println("S2.hesapla ");
		return 1234;
}
}
public class Cakisma {

	public static void main(String[] args) {
	
		new S2().hesapla(12.1);
		new S2().hesapla();
			
	}

}
