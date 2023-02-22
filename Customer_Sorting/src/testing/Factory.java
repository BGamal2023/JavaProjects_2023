package testing;

import java.util.ArrayList;

public class Factory {
	
	
	ArrayList<Bike> bikelist=new ArrayList<>();
	
	
	public ArrayList<Bike> orderBike(int no_of_items,String size , String color,String Quality ){
		for(int i=0 ; i<no_of_items;i++) {
			Bike bike=new Bike(size	, color	, Quality);
			bikelist.add(bike);
		}
		
		
		
		return  bikelist;
		
	}

}
