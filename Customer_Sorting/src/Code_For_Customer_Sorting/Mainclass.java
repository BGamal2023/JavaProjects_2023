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
import java.util.Collections;
import java.util.Comparator;
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
	static ArrayList<Map<String, Object>> array_of_every_customer_details = new ArrayList<>();
	static ArrayList<Map<String, Object>> array_of_electrical_engineers = new ArrayList<>();
	static ArrayList<Object> array_of_Jobs = new ArrayList<>();
	static ArrayList<Object> array_of_Jobs1 = new ArrayList<>();
	static Set<Object> job_set = new HashSet<>();
	static ArrayList<Map<String, Object>> array_of_doctors_customers = new ArrayList<>();
	static ArrayList<Map<String, Object>> array_of_mechanical_engineers_customers = new ArrayList<>();
	static ArrayList<Map<String, Object>> array_of_electrical_engineer_customers = new ArrayList<>();
	static ArrayList<Map<String, Object>> array_of_civil_engineer_customers = new ArrayList<>();
	static ArrayList<Map<String, Object>> array_of_teacher_customers = new ArrayList<>();
	static ArrayList<Map<String, Object>> array_of_accountant_customers = new ArrayList<>();
	static ArrayList<Map<String, Object>> array_of_programmer_customers = new ArrayList<>();
	static ArrayList<Map<String, Object>> array_of_chemical_engineers_customers = new ArrayList<>();
	static ArrayList<Map<String, Object>> array_of_mathematician_customers = new ArrayList<>();
	static ArrayList<Map<String, Object>> array_of_lawer_customers = new ArrayList<>();
	static ArrayList<Map<String, Object>> array_of_dentist_customers = new ArrayList<>();

	// ---------------------------main method-------------------------------

	public static void main(String[] args) throws JSONException {

		f0_get_file_names_of_json_files_from_database();
		f1_creat_path_for_every_json_file();
		f2_read_JSON_objects_from_the_data_base();
		f3_Convert_the_JSON_Object_to_Map();
		f4_get_array_for_jobs_for_our_customers();
		f5_get_array_for_doctors_customers();
		f6_get_array_for_mechanical_engineer_customers();
		f7_get_array_for_electrical_engineer_customers();
		f8_get_array_for_civil_engineer_customers();
		f9_get_array_for_teachers_customers();
		f10_get_array_for_accountants_customers();
		f11_get_array_for_programmers_customers();
		f12_get_array_for_chemical_engineer_customers();
		f13_get_array_for_mathematicians_customers();
		f14_get_array_for_lawyer_customers();
		f15_get_array_for_dentist_customers();
		f17_v1_sorting_our_Doctors_according_to_thier_ages();

		// ================end of main method===============================

		// doctor
		// lawyer
		// teacher
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

		}

		return array_of_every_customer_details;

	}
	
	
	
	public static void f3_3Sorting_our_customers_according_to_thier_Ages() {
		
	}
	// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

	public static void t3_f3() {

		Set<Entry<Integer, Object>> entry = temporary_Map.entrySet();

		Iterator<Entry<Integer, Object>> myIterator = entry.iterator();
		while (myIterator.hasNext()) {
			Entry<Integer, Object> myEntry = myIterator.next();

			System.out.println("Key = [" + myEntry.getKey() + "]" + "..." + "the Value = [" + myEntry.getValue() + "]");

		}

	}

	// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

	public static void f4_get_array_for_jobs_for_our_customers() {
		for (int i = 0; i < array_of_every_customer_details.size(); i++) {
			job_set.add(array_of_every_customer_details.get(i).get("job"));
		}
		array_of_Jobs.addAll(job_set);
	}
	// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

	public static void f5_get_array_for_doctors_customers() {

		for (int i = 0; i < array_of_every_customer_details.size(); i++) {
			if (array_of_every_customer_details.get(i).get("job").equals(array_of_Jobs.get(0))) {

				array_of_doctors_customers.add(array_of_every_customer_details.get(i));
			}
		}
	}

	// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

	public static void f6_get_array_for_mechanical_engineer_customers() {

		for (int i = 0; i < array_of_every_customer_details.size(); i++) {
			if (array_of_every_customer_details.get(i).get("job").equals(array_of_Jobs.get(1))) {

				array_of_mechanical_engineers_customers.add(array_of_every_customer_details.get(i));
			}
		}
	}

	// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

	// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

	public static void f7_get_array_for_electrical_engineer_customers() {

		for (int i = 0; i < array_of_every_customer_details.size(); i++) {
			if (array_of_every_customer_details.get(i).get("job").equals(array_of_Jobs.get(2))) {

				array_of_electrical_engineers.add(array_of_every_customer_details.get(i));
			}
		}
	}

	// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

	public static void f8_get_array_for_civil_engineer_customers() {

		for (int i = 0; i < array_of_every_customer_details.size(); i++) {
			if (array_of_every_customer_details.get(i).get("job").equals(array_of_Jobs.get(3))) {

				array_of_civil_engineer_customers.add(array_of_every_customer_details.get(i));
			}
		}
	}

	// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

	public static void f9_get_array_for_teachers_customers() {

		for (int i = 0; i < array_of_every_customer_details.size(); i++) {
			if (array_of_every_customer_details.get(i).get("job").equals(array_of_Jobs.get(4))) {

				array_of_teacher_customers.add(array_of_every_customer_details.get(i));
			}
		}
	}

	// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

	public static void f10_get_array_for_accountants_customers() {

		for (int i = 0; i < array_of_every_customer_details.size(); i++) {
			if (array_of_every_customer_details.get(i).get("job").equals(array_of_Jobs.get(5))) {

				array_of_accountant_customers.add(array_of_every_customer_details.get(i));
			}
		}
	}

	// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

	public static void f11_get_array_for_programmers_customers() {

		for (int i = 0; i < array_of_every_customer_details.size(); i++) {
			if (array_of_every_customer_details.get(i).get("job").equals(array_of_Jobs.get(6))) {

				array_of_programmer_customers.add(array_of_every_customer_details.get(i));
			}
		}
	}

	// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

	public static void f12_get_array_for_chemical_engineer_customers() {

		for (int i = 0; i < array_of_every_customer_details.size(); i++) {
			if (array_of_every_customer_details.get(i).get("job").equals(array_of_Jobs.get(7))) {

				array_of_chemical_engineers_customers.add(array_of_every_customer_details.get(i));
			}
		}
	}

	// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

	public static void f13_get_array_for_mathematicians_customers() {

		for (int i = 0; i < array_of_every_customer_details.size(); i++) {
			if (array_of_every_customer_details.get(i).get("job").equals(array_of_Jobs.get(8))) {

				array_of_mathematician_customers.add(array_of_every_customer_details.get(i));
			}
		}
	}

	// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

	public static void f14_get_array_for_lawyer_customers() {

		for (int i = 0; i < array_of_every_customer_details.size(); i++) {
			if (array_of_every_customer_details.get(i).get("job").equals(array_of_Jobs.get(9))) {

				array_of_lawer_customers.add(array_of_every_customer_details.get(i));
			}
		}
	}

	// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

	// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

	public static void f15_get_array_for_dentist_customers() {

		for (int i = 0; i < array_of_every_customer_details.size(); i++) {
			if (array_of_every_customer_details.get(i).get("job").equals(array_of_Jobs.get(10))) {

				array_of_dentist_customers.add(array_of_every_customer_details.get(i));
			}
		}
	}

	// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	public static void f17_v1_sorting_our_Doctors_according_to_thier_ages() {
		
		//get list of entryset of the doctors customers
	List<Entry<String,Object>> list=new ArrayList<>();
	Map<String, Object> mymap=new HashMap<>();
		for (int i=0 ;i<array_of_doctors_customers.size();i++) {
	list.addAll(array_of_accountant_customers.get(i).entrySet())	;
		}
		
		System.out.println("%%%%%%%%%befor sorting%%%%%%");
		for(var entry:list) {
			System.out.println(entry.getKey()+"\t" + entry.getValue());
		}
		
		System.out.println("%%%%after sorting%%%%%%%%%%%");
		
		Collections.sort(list, new Comparator<Entry<String, Object>>() {

			Entry<String, Object> returnedEntry=null;
			@Override
			public int compare(Entry<String, Object> o1, Entry<String, Object> o2) {
				
				
					
					return o1.getValue().toString().compareTo(o2.getValue().toString());
				
				
			}
		});
		
		
				for(var entry:list) {
					System.out.println(entry.getKey()+ "\t" +entry.getValue());
				}
		
	}
	// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	
	public static void f17_v2_sorting_our_Doctors_according_to_thier_ages() {
		List<Entry<String, Object>> list = null;
		for (Map<String, Object> map : array_of_doctors_customers) {
			Set<Entry<String, Object>> set = map.entrySet();
			list.addAll(set);
		}
		

	}
	public static void f6_get_array_for_x0_customers() {
		for (int i = 0; i < array_of_every_customer_details.size(); i++) {

		}
	}
	// XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX

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
