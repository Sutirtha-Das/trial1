package com.BinaryTrees;

public interface Tree<T extends Comparable> {
	public boolean isEmpty();
	public int size();
	public boolean member(T element);
	public NonEmptyBinarySearchTree<T> add(T element);
}
