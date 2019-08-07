import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import com.BinaryTrees.NonEmptyBinarySearchTree;
import com.BinaryTrees.Tree;
import com.List.CustomArrayList;

/**
 * @author Sutirtha
 *
 */
public class LearnCollection {

	public static void main(String[] args) {
		CustomArrayList<Integer> intList = new CustomArrayList<Integer>();
		System.out.println("Initial Capacity of the list:"+ intList.capacity);
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		intList.add(4);
		intList.add(5);
		intList.add(6);
		intList.add(7);
		intList.add(8);
		intList.add(9);
		intList.add(15);
		System.out.println("Current Size of list:"+intList.size);
		System.out.println("Element at 8th index:"+intList.get(8));
		System.out.println("Element removed from 8th index:"+intList.remove(8));
		System.out.println("Current size:"+intList.size);
		
		for(int i=0;i<intList.size;i++){
			System.out.println("Element at "+i+" index is:"+intList.get(i));
		}
		
		/*
		 Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
		int[][] arr2={{1, 1, 1, 0, 0, 0},
				{0, 1, 0, 0, 0, 0},
				{1, 1, 1, 0, 0, 0},
				{0, 0, 2, 4, 4, 0},
				{0, 0, 0, 2, 0, 0},
				{0, 0, 1, 2, 4, 0}};
		//valueOfMaxHourGlass(arr2);
		int[] arr = {9,514,8,74,18,7,98,54};
		//Queue
		QueueDemo queueDemo  = new QueueDemo();
		System.out.println("isEmpty:"+queueDemo.isEmpty());
		queueDemo.enqueue(5);
		queueDemo.enqueue(3);
		queueDemo.enqueue(1);
		System.out.println("Size:"+queueDemo.size());
		System.out.println("Dequeue:"+queueDemo.dequeue());
		System.out.println("Peek:"+queueDemo.peek());
		System.out.println("Size:"+queueDemo.size());

		//LinkedList--Implementation
		LinkedListNode newNode = new LinkedListNode(1);
		LinkedList linkedList = new LinkedList(newNode);
		linkedList.add(3);
		linkedList.add(5);
		linkedList.add(7);

		System.out.println("Count:"+linkedList.getCount());
		System.out.println("Head:"+linkedList.getHead().getData());
		System.out.println("ValueOfNextNode:"+linkedList.getHead().getNextNode().getData());
		linkedList.remove();
		System.out.println("Count:"+linkedList.size());

		//Stack
		Stack<String> stackDemo = new Stack<String>();
		stackDemo.push("Test");
		stackDemo.push("If");
		stackDemo.push("works");
		stackDemo.push("like");
		stackDemo.push("LIFO");
		System.out.println("Head:"+stackDemo.peek());
		System.out.println("Pop Head:"+stackDemo.pop());
		System.out.println("Head:"+stackDemo.peek());
		System.out.println("Pop Head:"+stackDemo.pop());

		//Linear Search
		LinearSearch linearSearch = new LinearSearch();
		int lsResult = linearSearch.doLinearSearch(arr, 7);
		System.out.println("Linear Search Result:"+lsResult);

		//Binary Search
		int[] bsArr = {1,2,3,4,5,6};
		BinarySearch binarySearch = new BinarySearch();
		int rightMostIndex = bsArr.length-1;
		int element = 2;
		int bsResult = binarySearch.doBinarySearch(bsArr, 0, rightMostIndex, element);
		if(bsResult < 0){
			System.out.println("Binary Search Result Not Found:"+bsResult);
		}
		else{
			System.out.println("Binary Search Result:"+bsResult);
		}


		//Binary Search Tree
		Tree tree = new NonEmptyBinarySearchTree(5);
		Tree leftTree = tree.add(3);
		Tree rightTree = tree.add(7);
		Tree leftleftSubTree = leftTree.add(2);
		Tree leftRightSubTree = leftTree.add(4);
		Tree rightLeftSubTree = rightTree.add(5);
		Tree rightRightSubTree = rightTree.add(9);
		System.out.println("Size of the Binary Search Tree is:"+tree.size());
	*/}

	public static void valueOfMaxHourGlass(int[][] arr){
		int row = arr.length;
		int coloumn = arr[0].length;
		int sum[] = new int[16];
		int h = 0;
		for (int i = 0; i < row-2; i++) {
			for (int j = 0; j < coloumn-2; j++) {
				sum[h] = arr[i][j] + arr[i][j+1] + arr[i][j+2]
						+ arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1]
								+ arr[i+2][j+2];
				h++;
			}
		}
		Arrays.sort(sum);
		System.out.println(sum[15]);



	}
}
