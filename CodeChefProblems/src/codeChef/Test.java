package src.codeChef;

import java.util.Arrays;
import java.util.List;



public class Test {

	public static void main(String[] args) {
		
		
		int arr[] = {-2,6,3,9,11};
		List arrList = Arrays.asList(arr);
		int input = 9;
		Arrays.sort(arr);
		int leftIndex = 0;
		int rightIndex = arr.length-1;
		
		
		
		for(int i=0;i<arr.length;i++){
			int diff = input - arr[i];
			
			for(int e:arr){
				if(e == diff){
					System.out.println("Pairs:{"+ arr[i] +","+diff+"}");
					break;
				}
			}
			
		}
		
		
		
		
		
		
		/*
		// TODO Auto-generated method stub
		
		
		String str1 = "abcd";
		String str2 = "adbe";
		
		
		if(str1.length() != str2.length()){
			System.out.println("String1 and String2 are not anagrams");
		}
		else{
			boolean isAnagram = false;
			char str1Arr[] = str1.toCharArray();
			char str2Arr[] = str2.toCharArray();
			Arrays.sort(str1Arr);
			Arrays.sort(str2Arr);
			for(int i =0; i<str1Arr.length;i++){
				if(str1Arr[i]!=str2Arr[i]){
					System.out.println("String1 and String2 are not anagrams");
					isAnagram = false;
					break;
				}
				else
					isAnagram = true;
			}
			if(isAnagram)
			System.out.println("Strings are anagram");
		}
	*/}

}
