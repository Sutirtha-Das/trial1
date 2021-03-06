package com.Compare;

import java.util.Comparator;
import java.util.TreeSet;

public class LearnCompare<E>  implements Comparator<E>{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("A".compareTo("Z")); //-ve
		System.out.println("A".compareTo("A")); //0
		System.out.println("Z".compareTo("A")); //+ve
		System.out.println("Z".compareTo("a")); //-ve, Capital case comes before small case
		//System.out.println("Z".compareTo(null)); throws NPE
		
		/*This adds element based on default sorting natural order which is ascending.
		 * Uses compareTo method internally
		 */
		TreeSet treeSetDefault = new TreeSet();
		treeSetDefault.add(19);
		treeSetDefault.add(11);
		treeSetDefault.add(10);
		treeSetDefault.add(15);
		treeSetDefault.add(9);
		System.out.println(treeSetDefault);
		
		TreeSet compareTreeSet = new TreeSet(new LearnCompare());
		compareTreeSet.add(19);
		compareTreeSet.add(11);
		compareTreeSet.add(10);
		compareTreeSet.add(15);
		compareTreeSet.add(9);
		System.out.println(compareTreeSet);
		
		TreeSet t = new TreeSet(new LearnCompare());
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("Z"));
		t.add(new StringBuffer("C"));
		t.add(new StringBuffer("D"));
		System.out.println(t);
		
		
		TreeSet testTree = new TreeSet(new LearnCompare());
		testTree.add("A");
		testTree.add("B");
		testTree.add(new StringBuffer("ABC"));
		testTree.add(new StringBuffer("AA"));
		testTree.add("XX");
		testTree.add("ABCD");
		System.out.println("Testtree:"+testTree);
	}

	/*@Override
	public int compare(E o1, E o2) {
		Integer i1 = (Integer) o1;
		Integer i2 = (Integer) o2;
		if(i1 < i2){
			return 1;
		}else if( i1> i2){
			return -1;
		}else{
		return 0;
		}
	}*/
	
	//To compare StringBuffer Objects
	/*@Override
	public int compare(Object obj1, Object obj2){
		String s1 = obj1.toString();
		String s2 = obj2.toString();
		return s1.compareTo(s2);
	}*/
	
	//Compare String and String Buffer and print in ascending order of
	//length of string. If length is equal, print in alphabeticalOrder
	@Override
	public int compare(Object obj1, Object obj2){
		String s1 = obj1.toString();
		String s2 = obj2.toString();
		int l1 = s1.length();
		int l2 = s2.length();
		
		if(l1<l2)
			return -1;
		else if(l1>l2)
			return 1;
		else
			return s1.compareTo(s2);
	}

}
