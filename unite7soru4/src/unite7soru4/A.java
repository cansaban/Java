package unite7soru4;

interface B{
	public void b ();
	
}

abstract class C implements B {
	public abstract void c () ;
}

class D extends C {
	public D() {
		b();
		c();
	}
	
	public void b() {
		System.out.println("b() working");
	}
	public void c() {
		System.out.println("c() working");
	}
	
}


public class A {

	public static void main(String[] args) {
		
		new D();

	}

}
