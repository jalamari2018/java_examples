import java.util.Scanner;
public class ArraysInJava
{
	public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      
     //arrays 
     
     int array_size = input.nextInt();
     
     int [] grades = new int[array_size];
     
     for(int j =0; j< grades.length; j++){
          System.out.println("Enter grade"+j+": ");
         grades[j] = input.nextInt();
     }

    
   for(int i=0; i<grades.length;i++){
       System.out.println("grade["+i+"] = "+grades[i]);
   }
     
     
  
  }
}