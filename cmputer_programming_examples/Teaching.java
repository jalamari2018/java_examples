import java.util.Scanner;
public class Teaching {
 
  public static void main(String[] args) {
   
   
   int grade;
   
   Scanner input = new Scanner(System.in);
   
   grade = input.nextInt();
   
   
   if(grade > 60){
      System.out.println("pass");
   }else{
     System.out.println("Fail"); 
   }
   
 
  }
}