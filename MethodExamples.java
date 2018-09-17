/* Computer Programming 1

method example
 */
 

import java.io.*;
import java.util.*;
public class MethodExamples
{
	public static void main(String[] args) {

      Scanner reader = new Scanner(System.in);
      
      System.out.println("Please enter lenght");
      int length = reader.nextInt();
      System.out.println("Please enter width");
      int width = reader.nextInt();
      
      findAreaRect(length,width);
      
      System.out.println("Please enter circle radius");
      int r = reader.nextInt();
      findCircleArea(r);
      
      
  }
  
  
  public static void findAreaRect(int x, int y){
         System.out.println("Rect Area = "+ (x*y));
  }
  
  public static void findCircleArea(int r){
  
         System.out.println("circle Area = "+ (r*r)*3.14);
  }
  
 }
 
