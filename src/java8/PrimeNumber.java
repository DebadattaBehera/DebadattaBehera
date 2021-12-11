package java8;

import java.util.Arrays;

public class PrimeNumber {
	static boolean isPrime(int i) {
		int count =0;
		for(int j=1;j<=i;j++) {
			if(i%j==0) {
				count++;
			}
		}
		if(count==2) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3,4,5,6,7,8,9,10};
		Arrays.stream(arr).filter(i->isPrime(i)).forEach(System.out::println);

	}

}
