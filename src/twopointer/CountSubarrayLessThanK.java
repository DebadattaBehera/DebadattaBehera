package twopointer;

import java.util.ArrayList;

public class CountSubarrayLessThanK {
    public static int solve(ArrayList<Integer> A, int B) {
        int i=0;
        int j=0;
        int sum=0;
        int count=0;
        while(j<A.size()){
            sum=sum+A.get(j);
            if(sum<=B){
                j++;
                continue;
            }
            if(sum>B){
                while(sum>B){
                    sum=sum-A.get(i);
                    i++;
                }
                count++;
                j++;
            }
            
            
        }
        return count;
    }
    public static void main(String args[]) {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(11);
		list.add(2);
		list.add(3);
		list.add(15);
		System.out.println(solve(list,10));
	 }

}
