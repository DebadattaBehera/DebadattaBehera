package dynamic;

public class StairCase {
    public static int climbStairs(int n) {
        return climb_Stairs(0, n);
    }
    public static int climb_Stairs(int i, int n) {
    	System.out.println(i+"=="+n);
        if (i > n) {
            return 0;
        }
        if (i == n) {
            return 1;
        }
         int a =climb_Stairs(i + 1, n);
         int b = climb_Stairs(i + 2, n);
        
         return a+b;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = climbStairs(5);
		System.out.println(result);
		

	}

}
