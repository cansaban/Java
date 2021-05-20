package unite8soru2;

public class RuntimeExceptions {

	public void ArithmeticExceptions() throws RuntimeException {
		int i = 11 / 0;
		System.out.println("i = " +i);
	}
	
	public void NullPointerException() throws RuntimeException {
	
		String str == 2;
		System.out.println("str = " +str);
	}
	
	public void NegativeArraySizeException () throws RuntimeException {
		
		int dizi [] = new dizi[-10];
		System.out.println("Dizi " + dizi [1]);
	}
	
	public void ArrayIndexOutOfBoundsException () throws RuntimeException {
		int sayilar [] = {1,2,3,4,5};
		for (int i = 0 ; i < 6 ; i++) {
			System.out.println("- - - > " + sayilar[i]);
		}
	}
	
	public static void main(String[] args) {
		try {
			
			RuntimeExceptions re = new RuntimeExceptions();
			//re.ArithmeticExceptions();
			//re.ArrayIndexOutOfBoundsException();
			//re.NegativeArraySizeException();
			//re.NullPointerException();;
		} catch (RuntimeException ex) {
			System.out.println("Hata mesajý - main() - - -> " +ex );
		}

	}

}
