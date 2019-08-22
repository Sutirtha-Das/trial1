import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


public class Subsequence {

    
    // set to store all the subsequences 
    static HashSet<String> st = new HashSet<>(); 
  
    // It computes all the subsequence of an string 
    static void subsequence(String str) 
    { 
    	// iterate over the entire string 
    	for (int i = 0; i < str.length(); i++) { 
    		try{ 
    			// iterate from the end of the string 
    			// to generate substrings 
    			for (int j = str.length(); j > i; j--) { 
    				String sub_str = str.substring(i, j); 

    				if (!st.contains(sub_str)) 
    					st.add(sub_str); 

    				// drop kth character in the substring 
    				// and if its not in the set then recur 
    				for (int k = 1; k < sub_str.length() - 1; k++) { 
    					StringBuffer sb = new StringBuffer(sub_str); 

    					// drop character from the string 
    					sb.deleteCharAt(k); 
    					if (!st.contains(sb)) 
    						; 
    					subsequence(sb.toString()); 
    				} 
    			} 
    		}
    		catch(Exception e){
    			continue;
    		}
    	}

    } 
  
    // Driver code 
    public static void main(String[] args) throws IOException 
    { 
    	BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
    	System.out.println("Enter the string");
    	String s = br.readLine();
    	Subsequence sq = new Subsequence();
        subsequence(s); 
        List<String> strList = new ArrayList<String>();
        for(String str: st){
        	if(sq.hasOneVowel(str)){
        		strList.add(str);
        	}
        }
        System.out.println(strList.size());
    } 
    
    public boolean hasOneVowel(String str){
		int count = 0;
		for(int i = 0;i<str.length();i++){
			if(isVowel(str.charAt(i))){
				count++;
			}
			if(count > 1){
				break;
				
			}
		}
		if(count ==1){
			return Boolean.TRUE;
		}
		else{
			return Boolean.FALSE;
		}
	}
	public boolean isVowel(char c){
		
		return ( c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' 
            || c == 'A' || c == 'E' || c == 'I' || c == '0' || c == 'U');
		
	}
}
