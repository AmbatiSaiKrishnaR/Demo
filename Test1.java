import java.util.Arrays;
public class SecondLargestNumber
{
	public static void main (String [] args )
{
		int[]arr ={4,2,1,5,3};
		int secondLargest=findSecondLargest(arr);
		System.out.println("The Second Largest number in the arrayis:"+secondLargest);
}
	public static int findSecondLargest(int [] arr) {

		Arrays.sort(arr);
		return arr[arr.length-2];
}
}