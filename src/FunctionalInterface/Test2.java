package FunctionalInterface;
//Anonymous class
public class Test2 {

	public static void main(String[] args) {
		
//		Oppo o1 = new Oppo();
//		o1.copy();
//		
		
		
		//Anonymous class
		Phone p1 = new Phone() {

			@Override
			public void copy() {
				System.out.println("Vivo copy code");
				
			}
			
		};
		p1.copy();
		
		
		
		
		//Lambda expressions
		
		Phone p2 = ()->System.out.println("Iphone copy code");
		
	
		
		
		p2.copy();
		
		
		//Lambda Expressions
		
		Phone p3 = ()-> {
				System.out.println("1+ copy code");
				
			};
		p3.copy();
		
		
		
	
		

	}

}

//class Oppo implements Phone{
//
//	@Override
//	public void copy() {
//		System.out.println("Oppo copy code");
//		
//	}
//	
//}




@FunctionalInterface
interface Phone{
	
	void copy();
}
