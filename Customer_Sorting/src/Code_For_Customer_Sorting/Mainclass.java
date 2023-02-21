package Code_For_Customer_Sorting;

import java.lang.reflect.Type;
import java.io.BufferedWriter;
import java.io.Console;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.lang.annotation.ElementType;
import java.sql.Struct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.jar.Attributes.Name;

import javax.lang.model.element.NestingKind;
import javax.management.openmbean.InvalidOpenTypeException;
import javax.print.attribute.standard.OutputDeviceAssigned;
import javax.swing.plaf.metal.MetalIconFactory.FolderIcon16;
import javax.xml.transform.Templates;

import org.*;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.w3c.dom.Text;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class Mainclass {

	// i have customer database :-
	// i need to access this database
	// get our customer data
	// what i will do with this data is :-
	// 1- sorting our customer by ages
	// 2- sorting our customers by IQ.
	// 3- sorting our customers by their jobs
	// 4- get the high smart customer
	// 5- get the low smart customer
	// 6-get the most used customer name
	// 7- get the most used child name
	// 8- get file for all previous points.
	// 9- save this file in separate database(the sorted database).

	static File file = new File(".\\the_database");
	static File[] listoffilenames = file.listFiles();
	static ArrayList<String> paths = new ArrayList<>();
	static File[] listOfPathsFiles;

	static ArrayList<String> Json_arrayList_from_data_base = new ArrayList<>();
	static Gson myGson = new Gson();
	static Map<String, Object> mapOfOurCustomerDetailes = new HashMap<>();
	static Map<Integer, Object> temporary_Map = new HashMap<>();
	static cusomersDataLists thecuCusomersDataLists = new cusomersDataLists();
	static ArrayList<Map<String, Object>> array_of_every_customer_details=new ArrayList<>();
	static ArrayList<Map<String, Object>> array_of_electrical_engineers=new ArrayList<>();
	static ArrayList<Object> array_of_Jobs=new ArrayList<>();
	static Set<Object>job_set=new HashSet<>();

	// ---------------------------main method-------------------------------

	public static void main(String[] args) throws JSONException {
		Map<String, Object> localMap=new HashMap<>();
		f0_get_file_names_of_json_files_from_database();
		f1_creat_path_for_every_json_file();
		f2_read_JSON_objects_from_the_data_base();
		f3_Convert_the_JSON_Object_to_Map();
		
		for(int i =0 ; i<array_of_every_customer_details.size();i++) {
			job_set.add(array_of_every_customer_details.get(i).get("job"));	
		}
		
		array_of_Jobs.addAll(job_set);
		
		for(int i =0 ; i<array_of_every_customer_details.size();i++) {
			
		if(	array_of_every_customer_details.get(i).get("job")==array_of_Jobs.get(2)) {
			System.out.println("i am in if ");
			array_of_electrical_engineers.add(array_of_every_customer_details.get(i));
		};	
	
		}
		for(int i =0 ; i<array_of_every_customer_details.size();i++) {
			System.out.println(array_of_every_customer_details.get(i).get("job"));
			
			}
		
		
	}

	// ------------------------------F0--------------------------------
	public static File[] f0_get_file_names_of_json_files_from_database() {
		File file = new File(".\\the_database");
		File[] listoffilenames = file.listFiles();

		return listoffilenames;
	}

	// -----------------------------T0_F0----------------------------------
	public static void t0_f0() {
		for (int i = 0; i < listoffilenames.length; i++) {
			System.out.println(listoffilenames[i].getName());
		}
		System.out.println(listoffilenames.length);
		System.out.println(file.getPath());
	}
	// -------------------------------F1------------------------------------

	public static ArrayList<String> f1_creat_path_for_every_json_file() {

		for (int i = 0; i < listoffilenames.length; i++) {
			paths.add(".\\the_database" + "\\" + listoffilenames[i].getName().toString());
		}

		return paths;

	}

	// -------------------------------T1_F1--------------------------------
	public static void t1_f1() {

		for (int i = 0; i < paths.size(); i++) {
			System.out.println(paths.get(i));
		}
		System.out.println(paths.size());
	}

	// --------------------------------F2--------------------------------------
	public static ArrayList<String> f2_read_JSON_objects_from_the_data_base() {

		for (int i = 0; i < paths.size(); i++) {
			String emptyString = "";
			try {
				File scannerFile = new File(paths.get(i));
				Scanner JSONScanner = new Scanner(scannerFile);
				while (JSONScanner.hasNext()) {
					emptyString += JSONScanner.nextLine();

				}

			} catch (Exception e) {
				e.printStackTrace();
			}

			Json_arrayList_from_data_base.add(emptyString);
		}

		return Json_arrayList_from_data_base;

	}

	// -------------------------------T2_F2--------------------------------

	public static void t2_f2() {
		for (int i = 0; i < Json_arrayList_from_data_base.size(); i++) {

			System.out.println(Json_arrayList_from_data_base.get(i));

		}
	}

	// -------------------------------F3--------------------------------
	public static ArrayList<Map<String, Object>> f3_Convert_the_JSON_Object_to_Map() {

		Type mytype = new TypeToken<Map<String, Object>>() {
		}.getType();

		for (int i = 0; i < Json_arrayList_from_data_base.size(); i++) {

			Map<String, Object> temMap = null;
			temMap = myGson.fromJson(Json_arrayList_from_data_base.get(i), mytype);
			array_of_every_customer_details.add(temMap);
		
//			f4_get_diffrent_list_for_each_customre_property(temMap);
		}
				
		return array_of_every_customer_details;

	}
	// -----------------------------------------------------------------

	public static void t3_f3() {

		Set<Entry<Integer, Object>> entry = temporary_Map.entrySet();

		Iterator<Entry<Integer, Object>> myIterator = entry.iterator();
		while (myIterator.hasNext()) {
			Entry<Integer, Object> myEntry = myIterator.next();

			System.out.println("Key = [" + myEntry.getKey() + "]" + "..." + "the Value = [" + myEntry.getValue() + "]");

		}

	}

	// ----------------------------------------------------------------------

	public static void f4_get_diffrent_list_for_each_customre_property() {
			for(int i=0 ; i<array_of_every_customer_details.size();i++) {
				if(array_of_every_customer_details.get(i).get("job")== "electrical engineer") {
					System.out.println("i am inside if");
					array_of_electrical_engineers.add(array_of_every_customer_details.get(i));
				}
			}
	}

	
	
	
	public boolean equal() {
		 
	}
	// ------------------------------General
	// Write---------------------------------------
	public static void write() {
		String mystring = "o mechanical energy. Most electric motors operate through the interaction between the motor's magnetic field and electric current in a wire winding to generate force in the form of torque applied on the motor's shaft. An electric generator is mechanically identical to an electric motor, but operates with a reversed flow of power, converting mechanical energy into electrical energy.\r\n"
				+ "\r\n"
				+ "Electric motors can be powered by direct current (DC) sources, such as from batteries, or rectifiers, or by alternating current (AC) sourc";

		try {
			FileWriter writer = new FileWriter("bahaa.txt");
			writer.write(mystring);
			writer.close();
			System.out.println();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// -------------------------------General
	// Read-------------------------------------
	public static String read_from_database() {
		String retunString = "";
		File myFile = new File(".\\the_database\\adel_ahmed.json");
		try (Scanner readscanner = new Scanner(myFile)) {
			while (readscanner.hasNext()) {
				retunString += readscanner.nextLine();

			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return retunString;
	}

}
