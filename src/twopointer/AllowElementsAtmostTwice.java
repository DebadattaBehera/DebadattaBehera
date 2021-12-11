package twopointer;

import java.util.ArrayList;

public class AllowElementsAtmostTwice {
	public static int removeDuplicates(ArrayList<Integer> a) {
        int n = a.size();
        if (n <=2 ) return n ;
        int len = 2 ;
        for (int i = 2; i < n; i++) {
            if (!a.get(i).equals(a.get(len - 2)) || !a.get(i).equals(a.get(len - 1))){
                a.set(len, a.get(i));
                len++;
            }
        }
        return len;
	}
	public static void main(String args[]) {
		ArrayList<Integer> list=new ArrayList<>();
		
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(removeDuplicates(list));
	 }
}
