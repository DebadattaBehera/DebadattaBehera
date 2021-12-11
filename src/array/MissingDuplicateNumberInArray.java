package array;

public class MissingDuplicateNumberInArray {
	static void solve(int[] arr) {
		int duplicate =0;
		int missing=0;
		int num=0;
		for(int i=0;i<arr.length;i++) {
			num=num+1;
			if(num!=arr[i]) {
				duplicate=arr[i];
				missing=num;
				System.out.print("dup="+duplicate+"missing="+missing);
			}
		
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {4,2,3,4,5};
		solve(arr);

	}

}
