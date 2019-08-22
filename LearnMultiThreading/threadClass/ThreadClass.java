package threadClass;

public class ThreadClass extends Thread{
	String primeThread = null;
	public ThreadClass(String primeThread) {
        this.primeThread = primeThread;
    }
	@Override
    public void run() {
        // 
		System.out.println("ThreadClass ->run ->Current Thread Initialized as:"+this.primeThread);
        System.out.println("ThreadClass ->run ->The current running thread is:"+Thread.currentThread().getId()+ ","+Thread.currentThread().getName());
    }

}
