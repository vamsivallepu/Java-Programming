package nestedClasses;
//static
//non-static---(Inner)

class Outer{
	int a=5;
	public void show() {
		
	}
	class Inner{
		void display() {
			System.out.println("In Inner class");
		}
	}
}
public class MultiClass{
	public static void main(String[] args) {
		Outer ob=new Outer();
		Outer.Inner ob1=ob.new Inner();
		ob1.display();
	}
}
