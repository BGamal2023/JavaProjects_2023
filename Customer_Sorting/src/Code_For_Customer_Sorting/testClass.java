package Code_For_Customer_Sorting;

import java.io.Console;
import java.util.Map.Entry;
import java.net.Inet4Address;
import java.nio.file.DirectoryIteratorException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

import javax.swing.text.html.CSS;

public class testClass {

	public static void main(String[] args) {
		
		
		Map<Integer, String> map1=new HashMap<>();
		
		map1.put(1, "PLC");
		map1.put(2, "css");
		map1.put(3, "java");
		map1.put(4,"javascript");
		map1.put(5,"PLC");
		
		Map<Integer, String>map2=new HashMap<>();
		map2.put(6, "kotlen");
		map2.put(7, "php");
		
		map1.putAll(map2);
		System.out.println(map1);
		
		Set<Entry<Integer,String>> entries=map1.entrySet();
		
		for(var entry: entries) {
			if(entry.getValue()=="java") {
				System.out.println(entry.getKey());
			}
		}
	}
	


}
