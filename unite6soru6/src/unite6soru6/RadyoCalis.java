package unite6soru6;

class Radyo{
	
	void sesAc() {
		System.out.println("Radyo ses acildi");
	}
	
	void sesKapat() {
		System.out.println("Radyo ses kapatildi");
	}
	
	void frekansAra() {
		System.out.println("Radyo frekans arama");
	}
	
	
}

class GelismisRadyo extends Radyo{
	
	void sesAc() {
		System.out.println("GelismisRadyo ses acildi");
	}
	void sesKapat() {
		System.out.println("GelismisRadyo ses kapatildi");
	}
	void frekansAra() {
		System.out.println("GelismisRadyo frekans arama");
	}
}

public class RadyoCalis {
/*
	static void calis(Object o[]) {
		for(int i = 0 ; i<o.length ; i++) {
			o[i].
		}
	}
*/	
	public static void main(String[] args) {
	
		Object o [] = new Object [2];
		o[0] = new Radyo();	//Yukari cevrim
		o[1] = new GelismisRadyo(); //Yukari cevrim

		//GelismisRadyo g1 = o[0]; // hatali asagi cevrim ! ! !
		//GelismisRadyo g2 = o[1]; // hatali asagi cevrim ! ! !
		
		/* Asagiya cevrim (downcasting),yukari cevrim (upcasting) isleminin tam tersidir.Asagiya cevrim,daha genel bir tipten daha ozellikli bir tipe
		 * dogru gecis demektir ve tehlikelidir.Cunku cevrilmeye calisilan daha ozellikli tipe cevrim esnasinda sorun cikma riski yuksektir.Java dilinde
		 * asagiya cevrim yapilirken hangi tipe dogru cevrim yapilacagi acik oalrak belirtilmelidir.Fakat yukari cevrim icin boyle zorunluluk yoktur.
		 * Java calisma aninda nesnelerin tiplerini denetler.Eger bu islemlerde bir uyumsuzluk varsa,bunu hemen kullaniciya ClassException istisnasi gondererek bildirir.
		 * Nesne tiplerinin calisma aninda tanimlanmasi (RTTI:Run Time Type Identification),programi yazan icin yarar icerir.
		 */
		
		//GelismisRadyo g1 =  (GelismisRadyo) o[0]; // Hatali tipe cevrim
		Radyo g1 = (Radyo) o[0]; 
		GelismisRadyo g2 = (GelismisRadyo) o[1];
		
		g1.sesAc();
		g1.sesKapat();
		g1.frekansAra();
		g2.sesAc();
		g2.sesKapat();
		g2.frekansAra();
	}

}
