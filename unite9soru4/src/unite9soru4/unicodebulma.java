package unite9soru4;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

class UnicodeBulucu {
	public static StringBuffer unicodeBul (String kelime) {
		char[] ac = kelime.toCharArray();
		int iDeger;
		String s = null;
		StringBuffer sb = new StringBuffer();
		
		for (int ndx = 0 ; ndx < ac.length ; ndx++) {
			iDeger = ac[ndx];
			if (iDeger < 0x10) {
				s = "\\u000";
			}else if (iDeger < 0x100) {
				s = "\\u00";
			}else if (iDeger < 0x1000) {
				s = "\\u0";
			}
			sb.append(s + Integer.toHexString( iDeger ) );
		}
		return sb;
	}
	
	public static StringBuffer unicodeBul (char[] kelime) {
		char[] ac = kelime;
		int iDeger;
		String s = null;
		StringBuffer sb = new StringBuffer();
		
		for (int ndx = 0 ; ndx < ac.length ; ndx++) {
			iDeger = ac[ndx];
			if (iDeger < 0x10) {
				s = "\\u000";
			}else if (iDeger < 0x100) {
				s = "\\u00";
			}else if (iDeger < 0x1000) {
				s = "\\u0";
			}
			sb.append(s + Integer.toHexString( iDeger ) );
		}
		return sb;
	}
	
}

public class unicodebulma {

	public static void main(String[] args) {
		
			  
			String karakterler = "ÝÖÜÇÐÞ"; 
			System.out.println(UnicodeBulucu.unicodeBul(karakterler) + "- - - - -> ISO8859-9 kod kumesi");
			try {
				karakterler = new String(karakterler.getBytes("ISO8859-9"),"ISO8859-5");
				System.out.println(UnicodeBulucu.unicodeBul(karakterler) + "- - - - -> ISO8859-5 kod kumesi");
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

	}

}
