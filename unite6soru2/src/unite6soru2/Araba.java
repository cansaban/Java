package unite6soru2;
// final deyimi gec baglama ile verimlilik ornegi
class Araba {
	public final void BMW() {
		System.out.println("BMW alman arabasidir");
	}
}
class AlmanAraba extends Araba{
	public static void goster(Araba a) {
		a.BMW();

}
		
	/* iptal edemez
	public void BMW(){
		System.out.println("BMW spor arabadir");
	} 
	*/

	public static void main(String[] args) {
		Araba a1=new Araba();
		AlmanAraba a2=new AlmanAraba();
		goster(a1);
		goster(a2);

	}

}
