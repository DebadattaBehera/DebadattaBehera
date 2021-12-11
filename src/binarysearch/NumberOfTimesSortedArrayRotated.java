package binarysearch;

public class NumberOfTimesSortedArrayRotated {
	static int solve(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		int n = arr.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			int prev = (mid + n - 1) % n;
			int next = (mid + 1) % n;
			if (arr[mid] < arr[prev] && arr[mid] < arr[next])
				return mid;
			if (arr[mid] < arr[end])
				end = mid - 1;
			else {
				start = mid + 1;
			}
		}
		return -1;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 11, 12, 15, 18, 2, 5, 6, 8 };
		System.out.println(solve(arr));
	}

}
