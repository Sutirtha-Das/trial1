/**
 * 
 */
package com.List;

import java.util.Arrays;
import java.util.Collection;

/**
 * @author Sutirtha
 *
 */
public class CustomArrayList<E> {
	public static final int capacity = 10;
	private static final Object[] EMPTY_ELEMENT_DATA = {};
	public int size = 0;
	
	private  Object[] customArrayListElementData;
	
	
	public CustomArrayList(){
		this.customArrayListElementData = new Object[capacity];
		
	}
	
	public CustomArrayList(int capacity){
		if(capacity <0){
			throw new IllegalArgumentException("Ilegal value for capacity");
		}
		this.customArrayListElementData = new Object[capacity];
		this.size = capacity;
	}
	
	public CustomArrayList(Object[] c){
		this.customArrayListElementData = c;
		this.size  = c.length;
	}
	
	public void ensureCapacity(){
		int newCapacity = ((customArrayListElementData.length*3)/2) + 1;
		System.out.println("ensureCapacity :: New Capacity:"+newCapacity);
		customArrayListElementData = Arrays.copyOf(customArrayListElementData, newCapacity);
	}
	
	public void add(E e){
		if(size == customArrayListElementData.length){
			ensureCapacity();
		}
		customArrayListElementData[size++] = e;
	}
	
	public E get(int index){
		if(index < 0 || index >=size){
			throw new IndexOutOfBoundsException("Out of bound index in the array:"+index);
		}
		return (E) customArrayListElementData[index];
	}
	
	public Object remove(int index){
		if(index < 0 || index >=size){
			throw new IndexOutOfBoundsException("Out of bound index in the array:"+index);
		}
		
		Object removedElement =  customArrayListElementData[index];
		for(int i=index;i<size;i++){
			customArrayListElementData[i] = customArrayListElementData[i+1];
		}
		size--;
		
		return removedElement;
	}
}	
