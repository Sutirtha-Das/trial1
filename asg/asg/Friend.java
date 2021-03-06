package asg;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Friend {
    private Collection<Friend> friends;
    private String email;

    public Friend(String email) {
        this.email = email;
        this.friends = new ArrayList<Friend>();
    }

    public String getEmail() {
        return email;
    }

    public Collection<Friend> getFriends() {
        return friends;
    }

    public void addFriendship(Friend friend) {
        friends.add(friend);
        friend.getFriends().add(this);
    }

    public boolean canBeConnected(Friend friend) {
    	for(Friend fr:friend.getFriends()){
    		if(this.getFriends().contains(fr)){
    			return true;
    		}
    		else{
    			if(this.canBeConnected(fr))
    				return true;
    		}
    	}
    	
    	return false;
       // throw new UnsupportedOperationException("Waiting to be implemented.");
    
    	/*boolean visited = false;
    	  
        // Create a queue for BFS 
        LinkedList<Friend> queue = new LinkedList<Friend>(); 
  
        // Mark the current node as visited and enqueue it 
        
        queue.add(friend); 
  
        while (queue.size() != 0) 
        { 
            // Dequeue a vertex from queue and print it 
            Friend fr = queue.poll(); 
             
  
            // Get all adjacent vertices of the dequeued vertex s 
            // If a adjacent has not been visited, then mark it 
            // visited and enqueue it 
            Iterator<Friend> i = this.getFriends().iterator(); 
            while (i.hasNext()) 
            { 
                Friend n = i.next(); 
                queue.add(n); 
            } 
            } 
        
        
    
*/    }

    public static void main(String[] args) {
        Friend a = new Friend("A");
        Friend b = new Friend("B");
        Friend c = new Friend("C");
        Friend d = new Friend("D");

        a.addFriendship(b);
        b.addFriendship(c);
        c.addFriendship(d);
        System.out.println(a.canBeConnected(d));
    }
}