package unite5soru8;

class Polis {
	void sucluYakala() {
		System.out.println("Polis suclu yakala");
	}
}


public class SivilPolis extends Polis{
	public void sucluYakala() {
		System.out.println("SivilPolis.sucluYakala()");

}

public static void main(String[] args) {
	Polis p1=new Polis();
	p1.sucluYakala();
	SivilPolis s1=new SivilPolis();
	s1.sucluYakala();
}
}
