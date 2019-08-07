package com.BinaryTrees;

public class EmptyBinarySearchTree<T extends Comparable> implements Tree<T> {

	public  EmptyBinarySearchTree() {
	}
	@Override
	public boolean isEmpty() {
		return true;
	}

	@Override
	public int size() {
		return 0;
	}

	@Override
	public boolean member(T element) {
		return false;
	}

	@Override
	public NonEmptyBinarySearchTree<T> add(T element) {
		// TODO Auto-generated method stub
		return new NonEmptyBinarySearchTree(element);
	}
	

}
