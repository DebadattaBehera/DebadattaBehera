package stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NearestGreatestToLeft {

	static void solve(int[] arr) {
		 Stack<Integer> stack = new Stack<>();
		 List<Integer> list = new ArrayList<>();
        for(int i=0;i<=arr.length-1;i++) {
       	 if(stack.size()==0) {
       		 list.add(-1);
       	 }
       	 else if(stack.size()>0 && stack.peek()>arr[i]) {
       		 list.add(stack.peek());
       	 }
       	 else if(stack.size()>0 && stack.peek()<=arr[i]) {
       		 while(stack.size()>0 && stack.peek()<=arr[i]) {
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
        for(Integer i:list) {
       	 System.out.println(i);
        }
	}
	public static void main(String[] args) {
		int[] arr = {1,3,2,4};
		solve(arr);
	}

}
