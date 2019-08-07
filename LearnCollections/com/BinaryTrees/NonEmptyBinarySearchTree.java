package com.BinaryTrees;

public class NonEmptyBinarySearchTree<T extends Comparable> implements Tree<T>{
	T root;
	Tree<T> leftChild;
	Tree<T> rightChild;
	
	public  NonEmptyBinarySearchTree(T element) {
		root = element;
		leftChild = new EmptyBinarySearchTree<T>();
		rightChild = new EmptyBinarySearchTree<T>();
		
	}
	
	public  NonEmptyBinarySearchTree(T element, Tree<T> leftTree, Tree<T> rightTree ) {
		root = element;
		leftChild = leftTree;
		rightChild = rightTree;
	}
	
	@Override
	public boolean isEmpty() {
		return false;
	}

	@Override
	public int size() {
		return 1 + leftChild.size() + rightChild.size();
	}

	@Override
	public boolean member(T element) {
		if(root == element){
			return Boolean.TRUE;
		}
		else{
			if(element.compareTo(root) < 0){
				return leftChild.member(element);
			}else{
				return rightChild.member(element);
			}
		}
	}

	@Override
	public NonEmptyBinarySearchTree<T> add(T element) {
		if(root == element){
			return this;
		}
		else{
			if(element.compareTo(root)< 0){
				return new NonEmptyBinarySearchTree<T>(root, leftChild.add(element), rightChild);
			}
			else{
				return new NonEmptyBinarySearchTree<T>(root, leftChild, rightChild.add(element));
			}
		}
	}

}
