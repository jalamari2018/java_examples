
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DataTypes{
        public static void main(String[] args) {
        
        
        int grade = 77;
        
        
        if(grade > 100){
          System.out.println("Invalid entry, grade cannot be larger than 100");
        }else if(grade < 0){
         System.out.println("Invalid entry, grade cannot be less than zero");
        }else{
           if(grade >= 90){
             if(grade >= 95){
              System.out.println("A+ ");
             }else{
               System.out.println("A ");
             }
            }else if(grade >=80){
              if(grade >= 85){
               System.out.println("B+ ");
               }else{
               System.out.println("B ");
             }
        
            }else if(grade >= 70){
              if(grade >= 75){
                System.out.println("C+ ");
             }else{
               System.out.println("C ");
             }
            }else if(grade >= 60){
             if(grade >= 65){
              System.out.println("D+ ");
             }else{
               System.out.println("D ");
             }
           }else{
             System.out.println("F ");
           }
        }
        
        
        
        
        
        
        
                        
//               int a = 10;
//               int c = 6;
              
//               single if
//               
//               if ----- else
//               if ---- else if --- else
//               nested if ===> if (if -- else ) else 
              
//               if(a>c){
//                System.out.println("a is larger than  c "+ a);
//               }else if(c>a){
//                 System.out.println("c is larger than  a "+ c);
//               }else{
//                    System.out.println("a is equal to c ");
//               }
              
              
              
              
              
              
              
              
              
//               if(c>a){
//                 System.out.println("c is larger than  a "+ c);
//               }
//               
//               if(a==c){
//                  System.out.println("a is equal to c ");
//               }
              
              
              
              
              
              
              

               
        }
}