package inheritance;

public class C {
	int x=5;
}
class D extends C
{
	
	int y=10;
	void display()
	{
		int z=15;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
	

	public static void main(String[] args) {
		C ob=new C();
		D ob1=new D();
		ob1.display();
		
		

	}

}
