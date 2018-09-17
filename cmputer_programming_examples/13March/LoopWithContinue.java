import java.util.Scanner;
public class LoopWithContinue
{
	public static void main(String[] args) {
      int sum = 0;
      for(int i=1; i<=5; i++){
         sum+=i;
        if((sum % 2) == 0){
            continue;
        }
         System.out.println("Sum = " + sum);
      }
      
       


  }
}