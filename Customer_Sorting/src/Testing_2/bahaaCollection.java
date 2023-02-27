package Testing_2;

public class bahaaCollection {

private	Object []obj;
 int elementcount=0;

public bahaaCollection() {
	obj=new Object[3];
}


public void add (Object object) {
	if(elementcount==obj.length) {
		increase_capacity();
	}
	obj[elementcount]=object;
	elementcount++;
}


private void increase_capacity() {
	
	Object[] newarray=new Object[elementcount*2];
	for(int i=0 ;i<obj.length;i++) {
		newarray[i]=obj[i];
	}
	obj=newarray;
	
	
}


	
	
}
