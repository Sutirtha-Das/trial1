package runnableInterFace;

public class RunnableThreadClass implements Runnable{
	
	String primeThread = null;
	public  RunnableThreadClass(String primeThread) {
		this.primeThread = primeThread;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
			System.out.println("RunnableThreadClass -> run ->Current Thread Initialized as:"+this.primeThread);
		   System.out.println("RunnableThreadClass -> run ->The current running thread is:"+Thread.currentThread().getId()+ ","+Thread.currentThread().getName());
		   Thread.currentThread().setName(this.primeThread);
		   System.out.println("RunnableThreadClass -> run -> The name of the thread is:"+Thread.currentThread().getName());
		   System.out.println("RunnableThreadClass -> run -> The state of the current thread is:"+Thread.currentThread().getState());
		   try {
			Thread.currentThread().sleep(1000);
			System.out.println("RunnableThreadClass -> run -> The state of the current thread after sleep is:"+Thread.currentThread().getState());
			   System.out.println("RunnableThreadClass -> run ->The current running thread after sleep is:"+Thread.currentThread().getId()+ ","+Thread.currentThread().getName());
			   if(Thread.currentThread().isInterrupted()){
				   System.out.println("Interrupt flag is now set to true");
				   throw new InterruptedException("Interrupt flag is now set to true");
			   }
		   } catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Thread has been interrupted");
		}
		   
	}

}
