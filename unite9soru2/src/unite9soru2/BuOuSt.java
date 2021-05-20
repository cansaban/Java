package unite9soru2;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// close() , flush() , Verilerin toplami(adet olarak) > icsel 

/*
public class BuOuSt {

	private static byte[] veriDizisi = {
			'0','1' , '2' , '3' , '4' , '5'
	};
	
	public static void main(String[] args) {
		
		if ( args.length != 1 ) {
			System.err.println("Yazilacak dosya bulunamadi");
			System.exit(1);
		}
		
		FileOutputStream fos = null; 
		BufferedOutputStream bos = null;
		
		try {
			fos = new FileOutputStream(args[0]);
			bos = new BufferedOutputStream(fos,3); 
			bos.write(veriDizisi);
			
		} catch (IOException ex) {
			System.err.println("Hata olustu:"+ex);
		}finally {
			try {
				bos.close();
			} catch (IOException e) {
				System.err.println("Kapatma Sorunu:"+e);
			}
		}
	}

} */

public class BuOuSt {

	private static byte[] veriDizisi = {
			'A','0','1' , '2' , '3' , '4' , '6'
	};
	
	public static void main(String[] args) {
		
		if ( args.length != 1 ) {
			System.err.println("Yazilacak dosya bulunamadi");
			System.exit(1);
		}
		
		FileOutputStream fos = null; 
		BufferedOutputStream bos = null;
		
		try {
			fos = new FileOutputStream(args[0]);
			bos = new BufferedOutputStream(fos); 
			
			for(int i = 0 ; i < veriDizisi.length ; i++ ) {
				bos.write(veriDizisi[i]);
				if ( (i % 3) == 0 ) {
					bos.flush();
				}
			}
		} catch (IOException ex) {
			System.err.println("Hata olustu:"+ex);
		}finally {
			try {
				fos.close();
				bos.close();
			} catch (IOException e) {
				System.err.println("Kapatma Sorunu:"+e);
			}
		}
	}

}

