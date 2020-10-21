class X {
	public X(int p) {
		
		System.out.println("X1 Yapilandricisi Selam Ben X sinifi\t"+p);
	}
	
	

}

class Y extends X{
	
	public Y(int p) {
		super(p+1);
		System.out.println("Y1 Yapilandricisi Selam Ben Y sinifi\t"+p);
	}
}
class Z extends Y{
	
	public Z(int p) {
		super(p+1);
		System.out.println("Z1 Yapilandricisi Selam Ben Z sinifi\t"+p);
	
	}
	public static void main(String[] args) {
		Z z2=new Z(1);
		System.out.println("- - - - - - - - - -- - -");
		Y y2=new Y(1);
		System.out.println("- - - - - - - - - -- - -");
		X x2=new X(1);

	}
}

	
