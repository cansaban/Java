
class A {

	public A() {
		System.out.println("Selam Ben A Sinifi");
	}
	
	
	
}

class B extends A{

	public B() {
		
		System.out.println("Selam Ben B Sinifi");
	}
	
}

class C extends B{

	public C() {
	
		System.out.println("Selam Ben C Sinifi");
	}

	
public static void main(String[] args) {
		
		A a1=new A();
		System.out.println("\n");
		B b1=new B();
		System.out.println("\n");
		C c1=new C();
	}
}
