/**
 * 
 */
package asg;

/**
 * @author Sutirtha
 *
 */
public class Solution {
	
	static int capacityOfLargePackage = 5;
	static int capacityOfSmallPackage = 1;
	public static int minimalNumberOfPackages(int items, int availableLargePackages, int availableSmallPackages) {
		if(items<=0){
			return -1;
			
	}
		
	int count1 = 0;	
	int count2 = 0;
	while (availableLargePackages>0){
		items = items - capacityOfLargePackage;
		count1 = count1 +1;
		availableLargePackages = availableLargePackages-1;
	}
	while (availableSmallPackages>0){
		items = items - capacityOfSmallPackage;
		count2 = count2 +1;
		availableSmallPackages = availableSmallPackages-1;
	}
	return count1 + count2;
	
}
	
static int numberOfLargePackages(int items, int availableLargePackages)	{
	int count = 0;
	while (availableLargePackages>0){
		items = items - capacityOfLargePackage;
		count = count +1;
		availableLargePackages = availableLargePackages-1;
	}
	return count;
}

static int numberOfSmallPackages(int items, int availableSmallPackages)	{
	int count = 0;
	while (availableSmallPackages>0){
		items = items - capacityOfSmallPackage;
		count = count +1;
		availableSmallPackages = availableSmallPackages-1;
	}
	return count;
}
public static void main(String[] args) {
	System.out.println(minimalNumberOfPackages(16, 2, 10));
}
}
