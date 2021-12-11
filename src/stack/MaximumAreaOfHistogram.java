package stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class MaximumAreaOfHistogram {

	static void solve(int[] arr) {
		List<Integer> left=nearestSmallerToLeft(arr);
		List<Integer> right=nearestSmallerToRight(arr);
		List<Integer> width=new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			width.add(right.get(i)-left.get(i)-1);
		}
		List<Integer> area=new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			area.add(width.get(i)*arr[i]);
		}
	
		int maxArea=area.stream().max(Integer::compare).get();
		System.out.print(maxArea);
		
		
	}

	static List<Integer> nearestSmallerToLeft(int[] arr) {
		Stack<Pair> stack = new Stack<>();
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i <= arr.length - 1; i++) {
			if (stack.size() == 0) {
				list.add(-1);
			} else if (stack.size() > 0 && stack.peek().element < arr[i]) {
				list.add(stack.peek().index);
			} else if (stack.size() > 0 && stack.peek().element >= arr[i]) {
				while (stack.size() > 0 && stack.peek().element >= arr[i]) {
					stack.pop();
				}
				if (stack.size() == 0) {
					list.add(-1);
				} else {
					list.add(stack.peek().index);
				}
			}
			stack.push(new Pair(arr[i],i));
		}
		return list;
	}

	static List<Integer> nearestSmallerToRight(int[] arr) {
		Stack<Pair> stack = new Stack<>();
		List<Integer> list = new ArrayList<>();
		for (int i = arr.length - 1; i >= 0; i--) {
			if (stack.size() == 0) {
				list.add(-1);
			} else if (stack.size() > 0 && stack.peek().element < arr[i]) {
				list.add(stack.peek().index);
			} else if (stack.size() > 0 && stack.peek().element >= arr[i]) {
				while (stack.size() > 0 && stack.peek().element >= arr[i]) {
					stack.pop();
				}
				if (stack.size() == 0) {
					list.add(-1);
				} else {
					list.add(stack.peek().index);}
			}
			stack.push(new Pair(arr[i],i));
		}
		Collections.reverse(list);
		return list;
	}

	public static void main(String[] args) {
		int[] arr = { 6, 2, 5, 4, 5, 1, 6 };
		solve(arr);
	}

}
