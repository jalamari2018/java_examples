import java.io.*;
import java.util.*;
public class MoreOnArrays
{
	public static void main(String[] args) {
   
   
   int [] arr = {100,-2,3,-20,8,4,5,10};
//    
//    int min = arr[0];
//    for(int i=0; i<arr.length; i++){
//        if(min > arr[i]){
//             min = arr[i];
//         }   
//    }
 //   System.out.println("The min value is =" + min);
   int valueToFind =3;
   
   boolean x = false;
   
   for(int i=0; i<arr.length; i++){
      if(arr[i]== valueToFind){

         x= true;
         break;
      }
       else{
          x=false;
       }
   }
   
   
   if(x){
      System.out.println("Yes");
   }else{
       System.out.println("No"); 
   }
   
   
   

   
   

   
   
   
   
   }
   
}