import java.util.Scanner;
public class LoopExample
{
	public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        int grade =0;
       
       //for loop  
       for(int i =1; i <= 10 ; i++){
       /////////////////////////////////
          grade = input.nextInt(); 
          if(grade > 60){
            System.out.println("pass");
          }else{
            System.out.println("Fail"); 
          }
        //////////////////////////////
          
       }

       

  }
}