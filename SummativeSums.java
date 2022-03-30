package advancedhw;

public class SummativeSums {
	public static void main(String[] args) {
		int[] arr1 = { 1, 90, -33, -55, 67, -16, 28, -55, 15};
		System.out.println("Sum of array 1 = " + getSum(arr1));
		int[] arr2 = { 999, -60, -77, 14, 160, 301 };
		System.out.println("Sum of array 2 = " + getSum(arr2));
		int[] arr3 = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 
				140, 150, 160, 170, 180, 190, 200, -99 };
		System.out.println("Sum of array 3 = " + getSum(arr3));
	}
	public static int getSum(int[] arr) {
		int sum = 0;
		for(int i:arr) {
			sum = sum + i;
		}
		return sum;
	}
}
