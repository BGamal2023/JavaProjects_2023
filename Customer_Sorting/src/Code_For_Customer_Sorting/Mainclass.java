package Code_For_Customer_Sorting;
import java.io.FileReader;
import java.sql.Struct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.lang.model.element.NestingKind;

import org.*;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
public class Mainclass {

// i have customer database :-
	// i need to access this database
	// get our customer data
	// what i will do with this data is :-
	// 1- sorting our customer by ages
	//2- sorting our customers by IQ.
	//3- sorting our customers by  their jobs
	//4- get the high smart customer
	//5- get the low smart customer
	//6-get the most used customer name
	//7- get the most used child name
	//8- get file for all previous points.
	//9- save this file in separate database(the sorted database). 
	

	public static void main(String[] args) throws JSONException  {
		
		//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		//1- how to create JSON object .....
		
		JSONObject obj1 = new JSONObject();
		obj1.put("name", "bahaa");
	
			obj1.put("age",new Integer(25)	);
		
		obj1.put("salary", new Double(6000.00));
		System.out.println(obj1);
		System.out.println("%%%%%%%%%%%%");
		//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		
		//2- how to convert java obj to JSON object....
		
		Map obj2=new HashMap();
		obj2.put("name", "Ahmed");
		obj2.put("age", new Integer(20));
		obj2.put("salary", new Double(20.0));
		System.out.println(obj2);
		String jsontext=JSONValue.toJSONString(obj2);
		System.out.println(jsontext);
		System.out.println("%%%%%%%%%%%%");
		
		
		
		List obj3= new ArrayList<>();
		obj3.add("khadiga");
		obj3.add(new Integer(3));
		obj3.add(new Double(321.1));
		System.out.println("obj3 is " + obj3);
		System.out.println("%%%%%%%%%%%%");
		
		String jsonStr = JSONValue.toJSONString(obj3);
		System.out.println("jsonstring is "+ jsonStr);
		System.out.println("%%%%%%%%%%%%");
		
		//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		
		//3- using json array...
		
		JSONArray obj4=new JSONArray();
		obj4.put("malek");
		obj4.put(new Integer(5));
		obj4.put(new Double(33.22));
		System.out.println("obj4 is " +obj4);
		System.out.println("%%%%%%%%%%%%");
		
		
	}

}
