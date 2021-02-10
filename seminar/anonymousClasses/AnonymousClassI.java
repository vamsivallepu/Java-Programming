package anonymousClasses;
interface Demo{
	public void show();
}
class Implementor implements Demo{
	@Override
	public void show() {
		System.out.println("implemented");
	}
}
public class AnonymousClassI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Implementor ob=new Implementor();
		ob.show();
	}

}
