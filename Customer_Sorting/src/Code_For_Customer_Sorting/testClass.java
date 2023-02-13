package Code_For_Customer_Sorting;

import java.io.Console;
import java.util.Map.Entry;
import java.net.Inet4Address;
import java.nio.file.DirectoryIteratorException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class testClass {

	public static void main(String[] args) {
		Map<Integer, String> myMap=new HashMap<>();
		myMap.put(1,"{plc=electrical , age =20}");
		myMap.put(2,"Java");
		myMap.put(3,"C++");
		myMap.put(4,"HTML");
		myMap.put(5,"PYTHON");
		myMap.put(6,"C#");
		myMap.put(7,"REgex");
		Iterator<Integer> myIterator=myMap.keySet().iterator();
		while(myIterator.hasNext()) {
			System.out.println(myIterator.next());
		}
		
		
		//-------return values ------------------------
	Iterator<String> myIterator2	=myMap.values().iterator();
		
		while (myIterator2.hasNext()) {
			System.out.println(myIterator2.next());
			
		}
		
		
		//--------------return entry--------------

		Set<Entry<Integer, String>> mySet=	myMap.entrySet();
		
		
		Iterator<Entry<Integer, String>> myIterator3=mySet.iterator();
		
		while(myIterator3.hasNext()) {
			Entry<Integer, String> entry=myIterator3.next();
			System.out.println("key is ["+entry.getKey()+"] " +  " value is [" +entry.getValue()+ "]");
		}
	}

}
