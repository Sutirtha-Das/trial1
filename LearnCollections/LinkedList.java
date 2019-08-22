
public class LinkedList {
		//Head is the first element in a list
		LinkedListNode head;
		public LinkedListNode getHead() {
			return head;
		}
		public void setHead(LinkedListNode head) {
			this.head = head;
		}

		int count;
		
		public int getCount() {
			return count;
		}
		public void setCount(int count) {
			this.count = count;
		}
		//Constructors
		/*public LinkedList(){
			head = null;
			count =0;
		}*/
		public LinkedList(LinkedListNode newNode){
			head = newNode;
			count = 1;
		}
		
		//Methods
		//Adding elements to List
		public void add(int data){
			LinkedListNode newNode =new LinkedListNode(data);
			LinkedListNode current =head;
			while(current.getNextNode() != null){
				current = current.getNextNode();
			}
			current.setNextNode(newNode);
			count ++;
		}
		
		//get value from index
		public int get(int index){
			if(index <=0){
				return -1;
			}
			LinkedListNode current = head;
			for(int i=1;i<index;i++){
				current = current.getNextNode();
			}
			return current.getData();
		}
		
		public int size(){
			LinkedListNode current = head;
			int size = 0;
			while(current.getNextNode() != null){
				current = current.getNextNode();
				size += 1;
			}
			
			return size;
		}
		
		public boolean isEmpty(){
			return head == null;
		}
		
		public void remove(){
			if(head != null){
				LinkedListNode current = head;
				if(size() > 1){
					while(current.getNextNode().getNextNode() != null){
						current = current.getNextNode();
					}
					current.setNextNode(null);
				}
			}
			
		}
		
		
}