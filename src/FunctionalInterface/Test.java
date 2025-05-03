package FunctionalInterface;

public class Test {

	public static void main(String[] args) {
		
//		Test t1 = new Test();
//		t1.play();
		
		new Test().play();// Anonymous object
	}
	
	public void play()
	{
		System.out.println("Test play logic");
	}

}
