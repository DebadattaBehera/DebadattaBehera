package slidingwindow;

public class MaxSumOfSubarray {
	static int sum(int[] arr,int k) {
		int sum =0;
		int max=0;
		int i=0;
		int j=0;
		while(j<arr.length) {
			sum=sum+arr[j];
			if(j-i+1<k) {
				j++;
			}
			else if(j-i+1==k) {
				max=Math.max(max,sum);
				sum=sum-arr[i];
				i++;
				j++;
			}
		}
		return max;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int[] arr= {10,30,20,50,60,40,40};
        int k=3;
        System.out.print(sum(arr,k));
	}

}
