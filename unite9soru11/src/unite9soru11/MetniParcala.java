package unite9soru11;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.PushbackReader;
import java.util.Scanner;

class Parcalayici {
	private PushbackReader pr;
	
	private static final int HARF = 1;
	private static final int SAYI = 2;
	private int tip;
	
	public Parcalayici(String fn) throws IOException {
		FileReader fr = new FileReader(fn);
		BufferedReader br = new BufferedReader(fr);
		pr = new PushbackReader(br, 1);
	}
	
	public void tipBelirle(char ch) {
		
		if(Character.isLetter(ch)) {
			tip = HARF;
		}else if (Character.isDigit(ch)) {
			tip = SAYI;
		}
		
	}
	
	public String BirSonrakiParcayiBul() throws IOException {
		int c; 
		char ch;
		c = pr.read();
		
		if(c == -1 ) { // Dosya sonu mu ?
			return null;
		}
		ch = (char)c;
		tipBelirle(ch);
		
		StringBuffer sb = new StringBuffer();
		sb.append(ch);
		
		for(;;) {
			c = pr.read();
			if (c == -1) {
				break;
			}
			ch = (char) c;
			
			if ( (tip == HARF && Character.isLetter(ch)) || (tip == SAYI && Character.isDigit(ch))) {
				sb.append(ch);
			} else {
				pr.unread(c); break;
			}
		}
		return sb.toString();
	}
	
	public void close() throws IOException {
		pr.close();
	}
}

public class MetniParcala {

	public static void main(String[] args) throws IOException {
		
		File yeniDosya = new File("yeniolusturulan.txt");
		yeniDosya.createNewFile();
		System.out.println("yeni olusacak text icine neler yazmak istiyorsunuz.Yazarken harf sayi karistirin ki ayritirabileyim");
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		FileWriter fw = new FileWriter("yeniolusturulan.txt");
		PrintWriter pw = new PrintWriter(fw);
		
		pw.print(str);
		
		pw.close();
		scn.close();
		
		Parcalayici pryclc = new Parcalayici("yeniolusturulan.txt");
		String parca ;
		while ((parca = pryclc.BirSonrakiParcayiBul()) !=null ) {
			System.out.println(parca);
		}
		pryclc.close();
	}

}
