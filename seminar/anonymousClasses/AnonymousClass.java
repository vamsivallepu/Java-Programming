package anonymousClasses;
class Abc{
	void show() {
		System.out.println("I'm the best");
	}
}
class Def extends Abc{
	@Override
	void show() {
		System.out.println("We are the best");
	}
}
public class AnonymousClass {
	public static void main(String[] args) {
//		Abc ob=new Abc();
//		ob.show();
		Def ob1=new Def();
		ob1.show();
	}
}
