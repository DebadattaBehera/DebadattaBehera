package stack;

import java.util.*;

class Pair{
	int element;
	int index;
	public Pair(int element,int index) {
		this.element=element;
		this.index=index;
	}
}
public class StockSpanProblem {

	static void solve(int[] arr) {
		 Stack<Pair> stack = new Stack<>();
		 List<Integer> list = new ArrayList<>();
       for(int i=0;i<=arr.length-1;i++) {
      	 if(stack.size()==0) {
      		 list.add(-1);
      	 }
      	 else if(stack.size()>0 && stack.peek().element>arr[i]) {
      		 list.add(stack.peek().index);
      	 }
      	 else if(stack.size()>0 && stack.peek().element<=arr[i]) {
      		 while(stack.size()>0 && stack.peek().element<=arr[i]) {
      			 stack.pop();
      		 }
      		 if(stack.size()==0) {
      			 list.add(-1);
      		 }
      		 else {
      			 list.add(stack.peek().index);
      		 }
      	 }
      	 stack.push(new Pair(arr[i],i));
       }
       for(int i=0;i<arr.length;i++) {
      	 System.out.println(i-list.get(i));
       }
	}

	public static void main(String[] args) {
		int[] arr = { 100, 80, 60, 70, 60, 75, 85};
		solve(arr);
	}

}
