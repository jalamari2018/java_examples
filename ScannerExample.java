/* Computer Programming 1
Scanner example
 */
 

import java.io.*;
import java.util.*;
public class ScannerExample
{
	public static void main(String[] args) {
   Scanner read = new Scanner(System.in);
   
   int x,y,z;
   
   x = read.nextInt();
   y = read.nextInt();
   
   z = x+y;
   
   System.out.println("x+y=" + z);
   
       }


}