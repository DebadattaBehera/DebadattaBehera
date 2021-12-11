package stack;

import java.util.*;

public class EvaluateExpression {
	public static int evalRPN(ArrayList<String> a) {
	    Stack<Integer> stack = new Stack<>();
	    
	    for(String opr : a) {
	        if(opr.equals("+") || opr.equals("-") || opr.equals("*") || opr.equals("/")) {
	            int num1 = stack.pop();
	            int num2 = stack.pop();
	            switch(opr) {
	                case "+" : int sum = num1 + num2;
	                           stack.push(sum);
	                           break;
	                case "-" : int diff = num2 - num1;
	                           stack.push(diff);
	                           break;
	                case "*" : int mult = num1 * num2;
	                           stack.push(mult);
	                           break;
	                case "/" : int div = num2 / num1;
	                           stack.push(div);
	                           break;
	            }
	        }
	        else {
	            stack.push(Integer.parseInt(opr));
	        }
	    }
	    
	    return stack.pop();
	}
    public static void main(String[] args) {
		String[] arr = { "3","2","2","/" };
		ArrayList<String> list=new ArrayList<>();
		for(String i:arr) {
			list.add(i);
		}
		System.out.println(evalRPN(list));
	}
}
