package slidingwindow;

import java.util.*;

public class MaxInKthSlide {
    public static ArrayList<Integer> slidingMaximum(final List<Integer> A, int B) {
        int n=A.size();
        int i=0;
        int j=0;
        List<Integer> support =new ArrayList<>();
        ArrayList<Integer> list =new ArrayList<>();
        while(j<n){
            support.add(A.get(j));
            if(j-i+1==B){
                int max=support.stream().max(Comparator.comparing(Integer::valueOf)).get();
                list.add(max);
            }
            else if(j-i+1>B){
                support.remove(0);
                i++;
            }
            j++;
        }
        return list;
    }
	public static void main(String[] args) {
		int[] arr = { 10,9,8,7,6,5,4,3,2,1 };
		ArrayList<Integer> list=new ArrayList<>();
		for(Integer i:arr) {
			list.add(i);
		}
		slidingMaximum(list,2);
	}
}
