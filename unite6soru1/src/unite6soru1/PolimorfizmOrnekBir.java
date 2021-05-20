package unite6soru1;
class Asker{
	public void selamVer() {
		System.out.println("Asker selam verdi");
		
	}
}
class Er extends Asker{
	public void selamVer() {
		System.out.println("Er selam verdi");
	}
}
class Yuzbasi extends Asker{
	public void selamVer() {
		System.out.println("Yuzbasi selam verdi");
	}
}
class Albay extends Asker{
	public void selamVer() {
		System.out.println("Albay selam verdi");
	}
}
class Yarbay extends Asker{
	public void selamVer() {
		System.out.println("Yarbay selam verdi");
	}
}



public class PolimorfizmOrnekBir {

	public static void hazirOl(Asker a) {// parametre aldigi icin static yordam veya nesnenin durumuna iliskin islem yapmiyor statik olmayan yordamlar nesnenin durumuna gore islem yaparlar.
		a.selamVer();
	}
	
	public static void main(String[] args) {
		Asker a=new Asker();
		Er e=new Er();
		Yuzbasi y=new Yuzbasi();
		Albay al=new Albay();
		Yarbay ya=new Yarbay();
		hazirOl(a);
		hazirOl(e);
		hazirOl(y);
		hazirOl(al);
		hazirOl(ya);
		
		

	}

}
