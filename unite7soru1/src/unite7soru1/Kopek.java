package unite7soru1;



interface KopekGiller {
	public void Havla();
}


interface KurtGiller {
	public void Uluma();
}

class AlmanKurdu implements KopekGiller,KurtGiller {
	
	public AlmanKurdu() {
		System.out.println("Alman Kurdumuz var! ");
	}
	
	public void Havla() {
		System.out.println("Alman Kurdu uluyor");
	}
	
	public void Uluma() {
		System.out.println("Alman Kurdu havlýyor");
	}
	
}

public class Kopek {

	public static void main(String[] args) {
		AlmanKurdu a = new AlmanKurdu();
		a.Havla();
		a.Uluma();
		
	
		
		// 2 arayüzü implement eden almankurdu ide'dede belirttigi gibi 2 arayüzün gövdesiz yordamlarýný iptal etmelidir.Bu kuraldýr.

	}

}
