package springapp01.springapp02.factory;

import springapp01.springapp02.bean.FourthBean;
import springapp01.springapp02.bean.SecondBean;


public class BeanFactory {
	
	public FourthBean getFourthBeanInstance(){
		System.out.println("Inside BeanFactory->FourthBean");
		return new FourthBean();
	}
	
	public SecondBean getSecondBeanInstance(){
		System.out.println("Inside BeanFactory->SecondBean");
		return new SecondBean();
	}
}
