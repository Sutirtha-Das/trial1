import java.util.LinkedList;
import java.util.Queue;


public class QueueDemo {
	
	private LinkedList<Integer> queueList = new LinkedList<Integer>();
	
	
	public int size(){
		return queueList.size();
	}
	
	public boolean isEmpty(){
		return queueList.isEmpty();
	}
	
	public void enqueue(int x){
		queueList.addLast(x);
	}
	
	public int dequeue(){
		return (int) queueList.removeFirst();
	}
	
	public int peek(){
		return (int) queueList.getFirst();
	}
}
