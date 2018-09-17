import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculateCirclePerimeterExample{
	public static void main(String[] args) {     
         
         /*hello there */
         int radius=0;
         System.out.println("Please enter radius of a circle");   
         try{

         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             radius = Integer.parseInt(br.readLine());
             
         }catch(NumberFormatException ne){
            System.out.println("Sorry, invalid number"+ne);
            System.exit(0);
         }catch(IOException ioe){
            System.out.println("IO Error"+ioe);
            System.exit(0);
         
         }
         
         // we use Math.PI to get the value of 3.14
         //circle area = PI*radius*radius
                double perimeter = 2 * Math.PI * radius;
                
                System.out.println("Perimeter of a circle is " + perimeter);
      }

  }
