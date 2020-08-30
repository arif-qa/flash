package inheritance;

public class Super {
	int x=5;
}
class Super1 extends Super
{
	int x=10;
	void display() {
		int x=15;
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);
	}

	public static void main(String[] args) {
		Super1 s1=new Super1();
		s1.display();
		

	}

}
