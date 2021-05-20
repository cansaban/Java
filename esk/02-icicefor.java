public class icicefor {

	public static void main(String[] args) {
		
		for(int i=0;i<1000;i++) {
			for(int j=0;j<500;j++) {
				if(j==2) {
					break;
				}
				System.out.println("j="+j);
				
			}
		}
		System.out.println("Donguden cikti");
		
	}

}
