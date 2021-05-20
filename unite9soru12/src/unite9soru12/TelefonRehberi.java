package unite9soru12;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class TelefonRehberi {

	public static void main(String[] args)  throws IOException{
	
		/*
		RandomAccessFile raf = new RandomAccessFile("yenirehber.txt","rw");
		for(;;) {
			System.out.println("Rehbere eklemek istediginiz Ismi yaziniz:" + "Eklemeyi bitirdiyseniz 1 yazýnýz.");
			Scanner scn = new Scanner(System.in);
			String str = scn.nextLine();
			if (str.matches("1")) {
				scn.close();
				raf.close();
				break;
			} 
				raf.writeBytes(str);
				
			
				
			System.out.println("Rehbere eklemek istediginiz soyismi yaziniz:" + "Eklemeyi bitirdiyseniz 1 yazýnýz.");
			Scanner scn1 = new Scanner(System.in);
			String str1 = scn1.nextLine();
			
			if (str1.matches("1")) {
				scn.close();
				scn1.close();
				raf.close();
				break;
			}
				raf.seek(50);
				raf.writeBytes(str1);
				
				
			
		
			
			System.out.println("Rehbere eklemek istediginiz telefon numarasini yaziniz:" + "Eklemeyi bitirdiyseniz 1 yazýnýz.");
			Scanner scn2 = new Scanner(System.in);
			long str2 = scn2.nextLong();
			if (str2 == 1) {
				scn.close();
				scn1.close();
				scn2.close();
				raf.close();
				break;
			}
			raf.seek(50);	
			raf.writeLong(str2);
			raf.seek(50);
			
					
		}
		System.out.println("eklemeyi bitirdim");
		raf.close();
		
	
	*/
		
	/*	System.out.println("Rehberde olan hangi ismi ve soyisimi ariyorsunuz:");
		Scanner s = new Scanner(System.in);
		String isim = s.next();
		Scanner s1 = new Scanner(System.in);
		String soyisim = s1.next(); */
	  RandomAccessFile raf = new RandomAccessFile("yenirehber.txt","r");
	/*	for(;;) {
			if(raf.readUTF() == isim ) {
				System.out.print(isim);
				raf.seek(10);
				if(raf.readUTF() == soyisim) {
					System.out.print(soyisim);
					raf.seek(50);
					System.out.println(raf.readInt());
					raf.close();
					break;
				}
			}
		} */ 
		System.out.println(raf.readLine());
		raf.seek(50);
		System.out.println(raf.readLine());
		raf.seek(50);
		System.out.println(raf.readInt());
		raf.close();
		
		
		

	}

}
