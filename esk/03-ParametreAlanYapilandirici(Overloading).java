class Bilgisayar{
	int ram;
	int islemcinesli;

	public Bilgisayar(int ramboyut) {
		ram=ramboyut;
		System.out.println("ram:"+ramboyut);
	}
	public Bilgisayar(int ramboyut,int islemcinesliyeni) {
		ram=ramboyut;
		islemcinesli=islemcinesliyeni;
		System.out.println("ram:"+ramboyut+"\nislemcinesli:"+islemcinesliyeni);
	}
}



public class ParametreAlanYapilandirici {
	public static void main(String[] args) {
		Bilgisayar b1=new Bilgisayar(12);
		Bilgisayar b2=new Bilgisayar(8,7);
		
	}

}
