package testing;

public class mainClass {

	public static void main(String[] args) {
		
		
		Factory factory=new Factory();
		factory.orderBike(5, "small", "black", "high");
		
		
		for(int i=0;i<factory.bikelist.size();i++) {
			System.out.println(factory.bikelist.get(i).Quality);
		}
		
		
		
		
		
		
		
		
		
		
	}

	
	
	
	
}
