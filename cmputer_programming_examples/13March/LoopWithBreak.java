import java.util.Scanner;
public class LoopWithBreak
{
	public static void main(String[] args) {
      int sum = 0;
      for(int i=1; i<=5; i++){
         sum+=i;
         if( sum == 10){
             break;       }
      }
      
       System.out.println("Sum = " + sum);


  }
}