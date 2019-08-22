
public class LinkedListNode {

	LinkedListNode nextNode;
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public LinkedListNode getNextNode() {
		return nextNode;
	}
	public void setNextNode(LinkedListNode nextNode) {
		this.nextNode = nextNode;
	}
	int data;
	
	LinkedListNode(int newData){
		data = newData;
		nextNode = null;
	}
	LinkedListNode(int newData, LinkedListNode newNode){
		data = newData;
		nextNode=newNode;
	}
	
	
}
