package unite6soru7;

import java.util.Scanner;

class Tire{
	
	public void WinterTire (String s) {
		System.out.println("Ben bir "+s+" lastigiyim");
	}
	
	public void SummerTire (String s) {
		System.out.println("Ben bir "+s+" lastigiyim");
	}
	public void FourSeasonTire (String s) {
		System.out.println("Ben bir "+s+" lastigiyim");
	}
	
}


class ContinentalTires extends Tire{
	
	public void WinterTire(String s) {
		System.out.println("Ben bir Continental "+s+ " lastigiyim");
	}
	public void SummerTire(String s) {
		System.out.println("Ben bir Continental "+s+ " lastigiyim");
	}
	public void FourSeasonTire(String s) {
		System.out.println("Ben bir Continental "+s+ " lastigiyim");
	}
	public void TireBrand() {
		System.out.println("Bu lastik Continental markadir");
	}
}

class TireCompanies {

	public static void main(String[] args) {
		
		System.out.println("Olusturulacak Lastiginizin markasi Continental olsun mu ?");
		System.out.println("True veya False seklinde yaziniz");
		System.out.println("False verilirse normal lastik olusacak");
		Scanner b = new Scanner(System.in);
		Boolean b1 = b.nextBoolean();
	
		//System.out.println(b1);
		if (b1 == true) {
			ContinentalTires conti = new ContinentalTires();
			System.out.println("Olusturulmus Continental Lastiginizin tipi ne olsun?  ?");
			System.out.println("1-Yaz,2-Kis veya 3-Dort Mevsim seklinde yaziniz - - -> Rakam belirtiniz");
			Scanner s1 = new Scanner(System.in);
			Integer s2 = s1.nextInt();
			if (s2 == 1) {
				
				conti.SummerTire("Yaz");
			}
			else if (s2 == 2) {
				
				conti.SummerTire("Kis");
			}
			else if (s2 == 3) {
				
				conti.SummerTire("Dort Mevsim");
			}
			else 
				System.out.println("Yanlis deger girdiniz");
		
			
		}
		else if (b1 == false) {
			Tire tire = new Tire();
			System.out.println("Olusturulmus Lastiginizin tipi ne olsun? ");
			System.out.println("1-Yaz,2-Kis veya 3-Dort Mevsim seklinde yaziniz - - -> Rakam belirtiniz");
			Scanner s1 = new Scanner(System.in);
			Integer s2 = s1.nextInt();
			if (s2 == 1) {
				
				tire.SummerTire("Yaz");
			}
			else if (s2 == 2) {
				
				tire.SummerTire("Kis");
			}
			else if (s2 == 3) {
				
				tire.SummerTire("Dort Mevsim");
			}
			else 
				System.out.println("Yanlis deger girdiniz");
		
		}
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
		System.out.println("Asagida yer alan sonuclar yukari cevrim sonucu olusturuldu");
		Tire t1 = new ContinentalTires(); // yukari cevrim
		t1.FourSeasonTire("DortMevsim");
		t1.SummerTire("Yaz");
		t1.WinterTire("Kis");
		//t1.TireBrand(); CALISMAZ !! cunku t1 normal lastigi belirttiði icin normal lastigin referansidir.new continentalTires() ile olusturulsa bile marka alanýna girip onu yonetemez calistiramaz
		
			
		/*Scanner s = new Scanner(System.in);
		String str = s.nextLine();*/
		//System.out.println("yazilan"+str);
		

	}

}
