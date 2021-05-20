
class D {

	public void ekranaBas() {
		System.out.println("d class'ý ekranabas'ý");
	}
	public int fiyatOgren() {
		return 400;
	}
	
	}

class E extends D{
	public void ekranaBas() {
		System.out.println("e class'ý ekranaBas");
	}
	public int fiyatOgren() {
		
		return 300;
	}


public static void main(String[] args) {
	E e1=new E();
	int fiyat=e1.fiyatOgren();
	System.out.println("fiyat:"+fiyat);
	e1.ekranaBas(); //yukarda mantigi anlatildi return basma yapmaz sen basacaksin!
					//void oldugu icin ekranaBas mesela public string ekrana bas olsaydi String ekran=e1.ekranaBas()yapacaktik.Geri döüþ alan fonksiyon olduðu için bir deðiþkene atayýp sonra bastýrýlabilirdi
	
}


}