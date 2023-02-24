package testing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class mainClass {

	public static void main(String[] args) {
		
		
Map<Integer, String> map=new HashMap<>();
map.put(112, "aa");
map.put(20,"bahaa");
map.put(3334, "malek");
map.put(334, "ajjfj");

System.out.println("************oringinal MaP**********************");
map.forEach((k,v)->System.out.println(k+"\t"+v));




Set<Entry<Integer, String>> entry = map.entrySet();


	List<Entry<Integer, String>> list=new ArrayList<>(entry);
	


	}
	
	
	
}
