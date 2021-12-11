package java8;

import java.util.*;

public class Test {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> map=new HashMap<>();
		map.put("hel", "a");
		map.put(new String("hel"), "b");
		for(Map.Entry<String,String> m:map.entrySet()) {
			System.out.println(m.getKey()+"=="+m.getValue());
		}

	}

}
