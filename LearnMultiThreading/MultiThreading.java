import runnableInterFace.RunnableThreadClass;
import threadClass.ThreadClass;


public class MultiThreading {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*for(int i=0;i<5;i++){
			ThreadClass threadClass = new ThreadClass("Thread"+i);
			threadClass.start();
		}*/
		int x =10;
		for(int i=0;i<2;i++){
			Thread object =  new Thread(new RunnableThreadClass("Thread"+i));
			System.out.println("MultiThreading->main->Thread state of "+ object.getName()+" is:"+object.getState());
			object.start();
			object.interrupt();
			System.out.println("MultiThreading->main->Thread state of after run "+ object.getName()+" is:"+object.getState());
		}
		
		Runnable r = () ->{
			System.out.println("Execute r");
		};
		Thread t = new Thread(r);
		t.start();
	}
	
	
	//t.start();
}
