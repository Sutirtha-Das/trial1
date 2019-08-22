package cognizant_fullStack_Challenge.com.hackerearth.util;

import org.springframework.stereotype.Component;

@Component
public class CommonUtil {
	
	public boolean isStringEmptyOrNull(String value){
		if(value != null && value.length()>0 && value != ""){
			return false;
		}
		else{
			return true;
		}
	}
}
