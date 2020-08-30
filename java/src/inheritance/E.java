package inheritance;

public class E {
	void show() {
		System.out.println("E class");
	}
	class F extends E
	{
		void show() {
			System.out.println("F class");
		}
		void display() {
			show();
			this.show();
		super.show();
		}
	}
	

	public static void main(String[] args) {
		E e=new E();
		F f=e.new F();
		f.display();
		

	}

}
