package unite7soru3;

import ornekarayuzpackage.Ayr�paketarayuzu; // veya import ornekarayuzpackage.*; 

interface KopekGiller {
	public void Havla();
}


interface KurtGiller {
	public void Uluma();
}

class AlmanKurdu implements KopekGiller,KurtGiller,add,Ayr�paketarayuzu {
	
	public AlmanKurdu() {
		System.out.println("Alman Kurdumuz var! ");
	}
	
	public void Havla() {
		System.out.println("Alman Kurdu uluyor");
	}
	
	public void Uluma() {
		System.out.println("Alman Kurdu havl�yor");
	}
	public void name() {
		System.out.println("add ek arayuzu");
	}
	public void ayriArayuz() {
		System.out.println("Ayr� paket arayuzu");
	}
	
}

public class Kopek {

	public static void main(String[] args) {
		AlmanKurdu a = new AlmanKurdu();
		a.Havla();
		a.Uluma();
		a.name();
		a.ayriArayuz();
		
		// 2 aray�z� implement eden almankurdu ide'dede belirttigi gibi 2 aray�z�n g�vdesiz yordamlar�n� iptal etmelidir.Bu kurald�r.

	}

}
