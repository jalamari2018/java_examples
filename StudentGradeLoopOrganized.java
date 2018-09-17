/* Computer Programming 1

Student grade with loop
 */
 

import java.io.*;
import java.util.*;
public class StudentGradeLoopOrganized //Array example
{
	public static void main(String[] args) {
   Scanner read = new Scanner(System.in);
   
   int grade;
   
   String [] students = {"Ali","Ahmed","Saleh","Salim","Ibrahim"};
  
   //multiple conditions with for loop
   for(int i=0;i< 5;i++){
         System.out.print("Enter "+students[i]+"\'s grade ==>\t");
        grade = read.nextInt(); //we get the grade from the console
       if(grade >= 90){
         System.out.print(" \t== > A \n");
       }else if(grade >=80){
        System.out.print(" \t== > B \n");
       }
       else if(grade >= 70){
        System.out.print(" \t== > C \n");
       }  
       else if(grade >= 60){
         System.out.print(" \t== > D \n");
       } 
       else{
         System.out.print(" \t== > F \n");
       } 
       
     } 
  }
 }