package Code_For_Customer_Sorting;

public class dogClass {

	String name ;
	int age;
	String color;
	String sex;
	public dogClass(String name, int age ,String color , String sex) {
		this.name=name;
		this.age=age;
		this.color=color;
		this.sex=sex;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getColor() {
		return color;
	}

	public String getSex() {
		return sex;
	}
@Override
public String toString() {
	return ("Hi , i am a good dog my name is "+getName()+
			".\nMy age is "+getAge()+
			".\n my color is "+getColor()+
			".\n and my sex is "+getSex());
	
}


}