/* Computer Programming 1
*Simple 2-D Array example
 */
 

import java.io.*;
import java.util.*;
public class SimpleArrayExample
{
	public static void main(String[] args) {

      //two dimensional array without knowing its elements
      int [][] array1 = new int [3][3];
      
 
      //we fill the array with a nested loop and a scanner instance
      Scanner reader = new Scanner(System.in);
      for(int i=0;i<array1.length;i++){
         for(int j=0;j<array1.length;j++){
            array1[i][j] = reader.nextInt();
         }

      } 
  // now we can print the array using another nested loop
        for(int i=0;i<array1.length;i++){
         for(int j=0;j<array1.length;j++){
            System.out.print(array1[i][j]);
         }
         //we just print a new line
         System.out.println();
      } 
  
   }  
  
 }
 
