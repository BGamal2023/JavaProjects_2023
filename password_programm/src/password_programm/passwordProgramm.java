package password_programm;

import java.lang.reflect.Array;
import java.util.Arrays;

public class passwordProgramm {
	
	/*
	   i have 3 numbers(1,2,3) and 3 digits
    i need to get all possible numbers in these 3 digits from the 3 numbers

    my story...
  1-  get array with these 3 numbers
  2-  do mathematical approach for this array to get all possibility
  3-  send the result combined numbers to file

    *** the mathematical approach:- ***

   i have 3 numbers and 3 digits so the number of possibility is 27
    my mechanism is :-
    1- fix the first digit to 1 and give all possibilities to other 2 digits .
    then give first digit 2 and give all possibilities to other 2 digits then 3.
    2- i will do this by two for loops. the first for loop will 
    change first digit 9 times 1 , 9 times 2 , 9 times 3.
    .....second for loop will give the other 2 digits all possibilities 
    numbers.
    */
	
	static int  array_of_given_numbers[]=new int[3];
	static int[] myresult_Array=new int[6];
	static int counter=0;

	public static void main(String[] args) {
		give_me_your_3_numbers(array_of_given_numbers);
		get_all_possible_combined_numbers_by_nested_for_loops_approach();
		
		
		
	}
	
	public static int[] give_me_your_3_numbers(int [] arr) {
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		
	return arr;
	}
	
	
	
	public static void get_all_possible_combined_numbers_by_nested_for_loops_approach() {
		 
		  /*
		  ** so first column value from right will change every 1 time (for loop with repeat 3 times and every time add 1 )
		for (let i=0 ; i<3; i++){ array[5]=i+1; } 

		store this for loop in a variable :-   let coloumn_6_value_in_array= for (let i=0 ; i<3; i++){ array[5]=i+1; } ;

		**second column value from right will change 1 time every 3 times from 6th column (outer for loop with 3 loops)
		for(let j=0 ; j<3;j++){
		    array[4]=j+1;
		    coloumn_6_value_in_array; 
		}                // so this for loop will give every loop 1 value for array[4] for 3 values for coloumn_6

		...........and so on every column will have for loop 3 times and it will nestles the other loop inside it .


		******the important rule for inner-for-loops**********
		for1(i<3){
		    repeat c;
		    for2(j<3){
		        repeat b;                   // so >>. a will repeated every 1 time 
		        for3(k<3){                  //        b will repeated  only 1 time every  1*3  
		            repeat a;              //         c will  repeat  only 1 time every  1*3*3 
		                                    // and so on multiply the inner repetition to calu
		        }
		    }

		}

		 */
		  
		  
		  
		  for (int a = 0; a < 3; a++) {
			  myresult_Array[0] = a + 1;
		    for (int b = 0; b < 3; b++) {
		    	myresult_Array[1] = b + 1;
		      for (int c = 0; c < 3; c++) {
		    	  myresult_Array[2] = c + 1;
		        for (int d = 0; d < 3; d++) {
		        	myresult_Array[3] = d + 1;
		          for (int e = 0; e < 3; e++) {
		        	  myresult_Array[4] = e + 1;
		            for (int f = 0; f < 3; f++) {
		            	myresult_Array[5] = f + 1;
		              System.out.println(Arrays.toString(myresult_Array));
		              counter++;
		             
		             
		            }
		          }
		        }
		      }
		    }
		  }
		  System.out.println(counter);
		}}
