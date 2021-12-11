package twopointer;

import java.util.ArrayList;

public class SortByColor {
	public static void sortColors(ArrayList<Integer> a) {
        int red=0;
        int white=0;
        int blue=0;
        for(Integer i:a){
           if(i==0){
               red++;
           }
           if(i==1){
               white++;
           }
           if(i==2){
               blue++;
           }
        }
        for(int i=0;i<red;i++){
            a.set(i,0);
        }
        int j=red+white;
        for(int i=red;i<j;i++){
            a.set(i,1);
        }
        int k=red+white+blue;
        for(int i=j;i<k;i++){
            a.set(i,2);
        }
        for(Integer i:a){
            System.out.print(i+" ");
        }

	}
	public static void main(String args[]) {
		ArrayList<Integer> list=new ArrayList<>();
		
		
		list.add(0);
		
	    sortColors(list);}
}
