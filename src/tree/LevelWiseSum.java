package tree;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class LevelWiseSum {
	public void levelWiseSum(Node node,int level) {
		Map<Integer,Integer> map = new TreeMap<>();
		leftView(map,node,level);
		for(Map.Entry<Integer, Integer> value : map.entrySet()) {
			System.out.println(value.getKey()+"=="+value.getValue());
		}
		
	}
	public void leftView(Map<Integer,Integer> map,Node node,int level) {
		if(node== null) {
			return;
		}
	    if(map.containsKey(level)) {
	    	Integer value = map.get(level)+node.data;
	    	map.put(level,value);
	    }
	    else {
	    	map.put(level, node.data);
	    }
		leftView(map,node.left,level+1);
		leftView(map,node.right,level+1);
		
	
		
	}
}
