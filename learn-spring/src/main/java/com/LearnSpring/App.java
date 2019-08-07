package com.LearnSpring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

@SuppressWarnings("deprecation")
public class App {
	
	public String dummy(){
		return "This is dummy maven project";
	}
	
	public static void main(String[] args){
		//Regular way of creating an object
		/*
		 * Triangle tri = new Triangle
		 */
		
		//Using Spring Bean to initialize the object
		/*Resource resouce = new ClassPathResource("spring.xml");
		BeanFactory factory = new XmlBeanFactory(resouce);
		Triangle tri = (Triangle) factory.getBean("triangle");
		tri.shape();
		System.out.println(tri.getType());*/
		
		//Using ApplicationContext to initialize the object
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle appTri = (Triangle) context.getBean("triangle-alias");
		appTri.shape();
		appTri.printCoordinates();
		appTri.printCoordinateList();
	}
}
