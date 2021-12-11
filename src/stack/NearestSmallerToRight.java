package stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class NearestSmallerToRight {
	static void solve(int[] arr) {
		 Stack<Integer> stack = new Stack<>();
		 List<Integer> list = new ArrayList<>();
        for(int i=arr.length-1;i>=0;i--) {
       	 if(stack.size()==0) {
       		 list.add(-1);
       	 }
       	 else if(stack.size()>0 && stack.peek()<arr[i]) {
       		 list.add(stack.peek());
       	 }
       	 else if(stack.size()>0 && stack.peek()>=arr[i]) {
       		 while(stack.size()>0 && stack.peek()>=arr[i]) {
       			 stack.pop();
       		 }
       		 if(stack.size()==0) {
       			 list.add(-1);
       		 }
       		 else {
       			 list.add(stack.peek());
       		 }
       	 }
       	 stack.push(arr[i]);
        }
        Collections.reverse(list);
        for(Integer i:list) {
       	 System.out.println(i);
        }
	}
	public static void main(String[] args) {
		int[] arr = { 4, 5, 2, 10, 8 };
		solve(arr);
	}

}
