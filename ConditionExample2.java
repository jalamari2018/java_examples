/* Computer Programming 1
condition example 2
 */
 

import java.io.*;
import java.util.*;
public class ConditionExample2
{
	public static void main(String[] args) {
   Scanner read = new Scanner(System.in);
   
   int x,y,z;
   
   x = read.nextInt();
   y = read.nextInt();
   
   //two-way condidtion statement
   //when deviding two numbers, we check whether or not the divisor != 0
   
    if(y != 0){
       z = x/y;
       System.out.println("x/y=" + z);
     }else{
       System.out.println("Not Possible to divide by zero");
     }  
  }
 }