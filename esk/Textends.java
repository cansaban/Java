class T {

	public int tekerleksayisi=4;
	public void ArabaOzellik() {
		System.out.println("arabalar 4 tekerleklidir");
		
	}
	public void ArabaOzellik1() {
		System.out.println("Arabalar ya mazotlu ya da benzinlidir");
	}
	public void ArabaOzellik2() { 
		System.out.println("arabalar hb veya sedandır");
	}
	
	
	
	
}
class Z extends T{
	
	
	public static void main(String[] args) {
		Z z1=new Z();
		z1.ArabaOzellik();
		z1.ArabaOzellik1();
		z1.ArabaOzellik2();
	}
		
}

