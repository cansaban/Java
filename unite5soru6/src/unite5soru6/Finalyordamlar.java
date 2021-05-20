package unite5soru6;

class Finalyordamlar {
	
	public final void Bastir() {
		System.out.println("bu dick tutulmali");
	}
	
}

class Finalyordamlar1 extends Finalyordamlar{
	public void Bastir() {
		System.out.println("dick i birakicak toschack'i alacak");
	}

public static void main(String[] args) {
		Finalyordamlar f=new Finalyordamlar();
		f.Bastir();
}
}
// hata vermeli