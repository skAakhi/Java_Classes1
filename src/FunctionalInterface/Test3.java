package FunctionalInterface;

public class Test3 {

	public static void main(String[] args) {
		
		
		//Anonymous class
		Car1 c1 = new Car1() {

			@Override
			public int speed(int s) {
				
				return 200+s;
			}
			
			
		};
		
		System.out.println(c1.speed(300));
		
		
		//Lambda Expressions
		
		Car1 c2 =(int s)->200+s;
		
		System.out.println(c2.speed(400));
		
		

	}

}



@FunctionalInterface
interface Car1{
	
	int speed(int s);
}
