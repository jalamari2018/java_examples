import java.util.Scanner;
public class GradeWithNestedLoop
{
	public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      int grade =0;
      for(int i = 1; i<=5;i++){
         for(int j=1; j<=3;j++){
            grade = input.nextInt();
            if(grade >= 60){
               System.out.println("you pass in course# "+j);
            }else{
               System.out.println("you failed in course#"+j);
             }
         }
         System.out.println("finished with student"+i);
      }
    


 
      
  }
}