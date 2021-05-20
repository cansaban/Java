package unite2soru7;
import java.util.Scanner;
public class ifornek {

	public static void main(String[] args) {
		int a;
		String sonuc;
		System.out.println("Sayi giriniz sifir haric");
		Scanner sayi=new Scanner(System.in);
		a=sayi.nextInt();
		sonuc=(a>0) ? "sayi pozitif":"sayi negatif";
		System.out.println("sonuc="+sonuc);
	}

}
