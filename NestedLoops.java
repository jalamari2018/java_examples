/* Computer Programming 1
nested loops example
 */
 

import java.io.*;
import java.util.*;
public class NestedLoops
{
	public static void main(String[] args) {
   Scanner read = new Scanner(System.in);
   
   int hight,width,i,j;
   hight = read.nextInt();
   width = read.nextInt();
   for(i=0;i<hight;i++){
         for(j=0; j<width;j++){
            System.out.print("*");
         }
         System.out.println();
   }
 }


}