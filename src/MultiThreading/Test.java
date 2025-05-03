package MultiThreading;

//Every java application is having one thread 
public class Test {

	public static void main(String[] args) throws InterruptedException {
	
		//Lambda expressions
		Runnable r1 = ()->{
			for(int i=0;i<10;i++)
			System.out.println("r1 run code" +"--"+Thread.currentThread().getName());
			};
		Runnable r2 =()-> {
			for(int i=0;i<10;i++)
			System.out.println("r2 run code"+"--"+Thread.currentThread().getName());
			};
		
		Thread t1 = new Thread(r1,"Thread one");
		Thread t2= new Thread(r2,"Thread two");
		
		t1.start();
		//t1.join();
		t1.sleep(10000);
		t2.start();
		

	}

}



//class Employee implements Runnable
//{
//	@Override
//	public void run()
//	{
//		System.out.println("Hello");
//	}
//	
//}
//
//
//
//class Manager implements Runnable
//{
//	@Override
//	public void run()
//	{
//		System.out.println("Hai");
//	}
//}



//Employee e1 = new Employee();
//Manager e2 = new Manager();
//
//Thread t1 = new Thread(e1);
//Thread t2 = new Thread(e2);
//
//t1.start();//Hello
//t2.start();//Hai
//
//		
//
////System.out.println(Thread.currentThread().getName()+"----"+Thread.currentThread().getId());
////System.out.println(e1.currentThread().getName()+"-------"+e1.getId());
////System.out.println(e2.currentThread().getName()+"-------"+e2.getId());
//
////	System.out.println(Thread.activeCount());
///
///
///
/////Anonymous 
//		Runnable r1 = new Runnable() {
//
//			@Override
//			public void run() {
//				System.out.println("r1 run code");
//				
//			}
//			
//		};
//		
//		
//		Runnable r2 = new Runnable() {
//
//			@Override
//			public void run() {
//				System.out.println("r2 run code");
//				
//			}
//			
//		};
//		
//		Thread t1 = new Thread(r1);
//		Thread t2= new Thread(r2);
//		
//		t1.start();
//		t2.start();
//		
