package lambda;
//Normal Interface

//Single Abstract method Interface -- Functional Interface -- scala 
//marker interface -- 0 method

interface implementor {
	void display();
}
class Demo implements implementor{
	public void display() {
		System.out.println("inside Demo");
	}
}

public class LambdaExpressions {
	public static void main(String[] args) {
		implementor ob = new Demo();
		ob.display();
	}
}
