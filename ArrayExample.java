/* Computer Programming 1
* Array example
 */
 

import java.io.*;
import java.util.*;
public class ArrayExample
{
	public static void main(String[] args) {

      int [][] z = new int [3][5];
      
      System.out.println("Before we fill the array");
      fillArray(z);
      System.out.println("After we filled the array");
      printArray(z);
  
  
 
  }
  
  
  //Fills the array from the keyboard
  public static void fillArray(int [][]z){
  
   Scanner reader = new Scanner(System.in);
  
  for(int i=0; i<3;i++){
  
      for(int j=0; j<5; j++){
         z [i][j]= reader.nextInt();
      }
  
     }
  
  }
  
  
  //prints the array
  public static void printArray(int [][]z){
  
    for(int i=0; i<3;i++){
  
      for(int j=0; j<5; j++){
         System.out.print("\t"+z[i][j]);
      }
      System.out.println();
  
  }
  
  }
  
  
 }
 
