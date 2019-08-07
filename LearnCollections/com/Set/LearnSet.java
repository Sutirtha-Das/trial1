package com.Set;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class LearnSet {
	public static void main(String args[]){
		HashSet<String> hs = new HashSet<String>();
		hs.add("ABC");
		hs.add("B");
		hs.add("C");
		hs.add("D");
		hs.add(null);
		System.out.println(hs.add("A"));
		System.out.println(hs.add("A")); //If already added, returns false
		System.out.println(hs); //Insertion Order is not added. Cannot determine the order of display
		
		LinkedHashSet<String> lHs = new LinkedHashSet<String>();
		lHs.add("ABC");
		lHs.add("B");
		lHs.add("C");
		lHs.add("D");
		lHs.add(null);
		System.out.println(lHs.add("A"));
		System.out.println(lHs.add("A")); //If already added, returns false
		System.out.println(lHs); //Insertion Order is preserved for linkedHasSet
	
		SortedSet<Integer> sortedSet = new TreeSet<Integer>();
		sortedSet.add(100);
		sortedSet.add(95);
		sortedSet.add(105);
		sortedSet.add(106);
		System.out.println(sortedSet);
		System.out.println(sortedSet.first());
		System.out.println(sortedSet.last());
		System.out.println(sortedSet.headSet(106));
		System.out.println(sortedSet.tailSet(100));
		System.out.println(sortedSet.subSet(100, 106));
		
		
		//TreeSet
		TreeSet t = new TreeSet();
		t.add("A");
		t.add("a");
		t.add("B");
		t.add("D");
		t.add("E");
		//t.add(new Integer(1)); Adding Integer throws ClassCastException.
		//t.add(null); Throws null pointer exception as treeset compares every element.
		System.out.println("Treeset:"+t); //Prints sorted set based on the unicode
		
		TreeSet tS = new TreeSet();
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("Z"));
		t.add(new StringBuffer("B"));
		
		System.out.println("TreeSet StringBuffer:"+tS);
		/* Exception in thread "main" java.lang.ClassCastException: java.lang.StringBuffer cannot be cast to java.lang.Comparable
		 * For default constructor, the elements should be homogeneous and comparable
		 * String is comparable while StringBuffer is not comparable
		 * */
		
	}	
}
