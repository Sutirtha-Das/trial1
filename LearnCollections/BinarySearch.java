
public class BinarySearch {
	
	
	/*
	 * Compare x with the middle element.
     * If x matches with middle element, we return the mid index.
     * Else If x is greater than the mid element, then x can only lie in right half subarray after the mid element. So we recur for right half.
     * Else (x is smaller) recur for the left half.
     * Time Complexity is O(n)=O(n/2)+C
     * Run on a sorted array
	 */
	public int doBinarySearch(int arr[], int leftMostIndex, int rightMostIndex, int element){
		
		if(rightMostIndex >= leftMostIndex){
			int mid = leftMostIndex + (rightMostIndex -1)/2;
			if(arr[mid] == element){
				return arr[mid];
			}
			if(arr[mid] > element){
				return doBinarySearch(arr, 	leftMostIndex, mid-1, element);
			}
			if(arr[mid] < element){
				return doBinarySearch(arr, mid+1, rightMostIndex, element);
			}
		}
		
		return -1;
	}

}
