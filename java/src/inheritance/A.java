package inheritance;

public class A {
	int x=5;
	void show() {
		System.out.println("A class");
	}
	class B extends A
	{
		int y=10;
		void display()
		{
			
			System.out.println("B class");
		}
	}

	public static void main(String[] args) {
		A ob1=new A();
		B ob=ob1.new B();
		ob.display();
		ob.show();
		System.out.println(ob.x);
		System.out.println(ob.y);
		
		
		
		
		
		
		
		

	}

}
