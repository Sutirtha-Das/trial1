package springapp01.springapp02.scope;

import java.util.HashMap;

public class CustomThreadLocal extends ThreadLocal<Object>{
	
	@Override
	protected Object initialValue(){
		return new HashMap<String, Object>();
	}
}
