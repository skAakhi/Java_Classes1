package String_Practice;

//1.String---------->Literal[unique behaviour] and immutable
//2.StringBuffer--->mutable---->single thread application---->performance will be slower
//3.StringBuilder-->mutable---->Multi thred applications----->performance will be higher
public  class One {
                                      
	public static void main(String[] args) {
		
		
		StringBuffer sb1 = new StringBuffer("Hello");
		StringBuffer sb2 = new StringBuffer("Hello");
		
		StringBuilder sb3 = new StringBuilder("Hello Hai");
		StringBuilder sb4 = new StringBuilder("Hello");//16+5=21
		
		System.out.println(sb3.capacity());
		System.out.println(sb3.reverse());
		System.out.println(sb2.append("Aakjib"));
		
		
		
		
				
		

		
		
		
		
		
	
		
		
		

		
		
		
	}
	
	
}
