package sort;

public class QuickSort {

	    protected static void quickSort(int start, int end, int[] arr){
	        if(start<end){
	            int index=partition(start,end,arr);
	            quickSort(start,index-1,arr);
	            quickSort(index+1,end,arr);
	        }
	        return;
	    }

	    protected static int partition(int start, int end, int[] arr){
	        int pivot = start;
	        int i = start;
	        int j= end;

	        while (i< j){
	            while(arr[i]<= arr[pivot] && i< end){
	                i++;
	            }
	            while(arr[j]> arr[pivot] && j > start){
	                j--;
	            }
	            if(i< j){
	                swap(i,j,arr);
	            }
	        }
	        swap(j,pivot,arr);
	        return j;
	    }

	    private static void swap(int p1, int p2, int[] arr){
	        int temp = arr[p1];
	        arr[p1] = arr[p2];
	        arr[p2] = temp;
	    }
	    public static void main(String[] args){
	        int[] input = {10,7,8,9,1,5};
	        quickSort(0, input.length-1, input);
	        for(int i=0; i< input.length; i++){
	            System.out.println(input[i]);
	        }
	    }
}
