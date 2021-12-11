package array;

public class MissingDuplicateUsingSwapSort {
	static void solve(int[] arr) {
		int duplicate =0;
		int missing=0;
		int i=0;
		while(i<arr.length) {
		 if(arr[i]!=arr[arr[i]-1]) {
				int temp=arr[i];
				arr[i]=arr[arr[i]-1];
				arr[temp-1]=temp;
			}
		 else
			 i++;
		
		}
		
		for(int j=0;j<arr.length;j++) {
			
			if(j+1 !=arr[j]) {
				duplicate=arr[j];
				missing=j+1;
				System.out.print("dup="+duplicate+"missing="+missing);
			}
		
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {2,3,1,5,1};
		solve(arr);
	}

}
