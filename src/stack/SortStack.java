package stack;

import java.util.Stack;

public class SortStack {
	Stack<Integer> s1 = new Stack<>();
	
	public static void sort(Stack<Integer> s) {
		if(s.size()==1) {
			return;
		}
		Integer i=s.peek();
		s.pop();
		sort(s);
		insert(s,i);
		return;
	}
	public static void insert(Stack<Integer> s,Integer val) {
		if( s.size()==0 || s.peek()<=val) {
			s.push(val);
			return;
			
		}
		Integer temp=s.peek();
		s.pop();
		insert(s,val);
		s.push(temp);
		return;
		
	}
	
	public Stack<Integer> reverse(Stack<Integer> s) {
		if(s.size()==0) {
			return s;
		}
		
		s1.push(s.pop());
		reverse(s);
		//s.push(t);
		return s1;
		
	}
	
	
  public static void main(String [] args) {
	  SortStack obj = new SortStack();
	  Integer arr[]= {5,1,4,2,3};
	  Stack<Integer> s= new Stack<>();
	  for(Integer i:arr) {
		  s.push(i);
	  }
	  //sort(s);
	  Stack<Integer> s1 = obj.reverse(s);
	  for(Integer i:s1) {
		  System.out.println(i);
	  }
	
  } 

}
