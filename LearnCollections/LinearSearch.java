
public class LinearSearch {

	/*
	 * Start from the leftmost element of arr[] and one by one compare x with each element of arr[]
	 * If x matches with an element, return the index.
	 * If x doesn’t match with any of elements, return -1.
	 */
	public int doLinearSearch(int arr[], int x){
		
		for(int i=0;i<arr.length;i++){
			if(arr[i] == x){
				System.out.println("LinearSearch: Value found");
				return arr[i];
			}
		}
		return -1;
	}
}
