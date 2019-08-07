package springapp01.springapp02.scope;

import java.util.Map;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;
/*
 * Custom Scope class called ThreadScope
 * Creates a new Bean object for each method which 
 * accesses the bean
 */
public class ThreadScope implements Scope{
	Map<String, Object> scope = null;
	CustomThreadLocal threadLocal = new CustomThreadLocal();
	
	/*
	 * (non-Javadoc)
	 * @see org.springframework.beans.factory.config.Scope#get(java.lang.String, org.springframework.beans.factory.ObjectFactory)
	 * If Bean Object is not available in Application Context or Bean Factory
	 * Get the Object which is available in ObjectFactory and put in Scope
	 * Here is scope is represented by Map
	 * 
	 */
	@Override
	public Object get(String name, ObjectFactory<?> objectFactory) {
		scope = (Map)threadLocal.get();
		Object obj = scope.get(name);
		if(obj == null){
			obj = objectFactory.getObject();
			scope.put(name, obj);
		}
		return obj;
	}

	@Override
	public Object remove(String name) {
		Object obj = scope.remove(name);
		return obj;
	}

	@Override
	public void registerDestructionCallback(String name, Runnable callback) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object resolveContextualObject(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getConversationId() {
		// TODO Auto-generated method stub
		return null;
	}

}
