/* Computer Programming 1

Student Grade
 */
 

import java.io.*;
import java.util.*;
public class StudentGrade
{
	public static void main(String[] args) {
   Scanner read = new Scanner(System.in);
   
   int grade;
   
   grade = read.nextInt(); //we get the grade from the console
   //multiple conditions
   //if grade is greater or equal to 60 print "Pass" else print "Fail"  
    if(grade >= 90){
       System.out.println("A");
     }else if(grade >=80){
       System.out.println("B");
     }
     else if(grade >= 70){
       System.out.println("D");
     }  
     else if(grade >= 60){
       System.out.println("C");
     } 
     else{
       System.out.println("F");
     }  
  }
 }