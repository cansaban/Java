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
		System.out.println("Alman Kurdu havl�yor");
	}
	
}

public class Kopek {

	public static void main(String[] args) {
		AlmanKurdu a = new AlmanKurdu();
		a.Havla();
		a.Uluma();
		
	
		
		// 2 aray�z� implement eden almankurdu ide'dede belirttigi gibi 2 aray�z�n g�vdesiz yordamlar�n� iptal etmelidir.Bu kurald�r.

	}

}
