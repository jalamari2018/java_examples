/* Computer Programming 1
 */
 
//Matrix Multiplication Example
import java.io.*;
import java.util.*;
public class MatrixMultiplication
{
	public static void main(String[] args) {
       Scanner reader = new Scanner(System.in);
       System.out.println("Please Enter array size");
       int size = reader.nextInt();
       int [][] arr1 = new int [size][size];
       int [][] arr2 = new int [size][size];
       int [][] arr3 = new int [size][size];
       
       int cellValue=0,j,i,k;
       //Creates Random instance to generate random values
       Random rand = new Random();
       //filling the arrays with some values
       for(i =0; i<size; i++){
         for(j = 0; j<size;j++){
            // Generates random values between 1 and 9
            arr1 [i][j] = 1+rand.nextInt(9);
            arr2 [i][j] = 1+rand.nextInt(9);  
         }
       }

 
     //Doing the multiplication
     for(i = 0; i<size; i++){//loop1
      for(j =0;j<size;j++){//loop2
         for(k=0;k<size;k++){//loop3
          cellValue += arr1[i][k] * arr2[k][j];
         }//end loop1
         arr3[i][j] =  cellValue;
         cellValue =0;
         }//end loop2
     }//end loop3

     //printing arr1
     System.out.print("\n array1\n");
       for(i =0; i<size; i++){
         for(j = 0; j<size;j++){
            System.out.print(arr1 [i][j]+"\t");
         }
         System.out.println();
       }
    //printing arr2
    System.out.print("\n array2\n");
       for(i =0; i<size; i++){
         for(j = 0; j<size;j++){
            System.out.print(arr2 [i][j]+"\t");
         }
         System.out.println();
       }
       
       //printing arr3
       System.out.print("\n array3\n");
       for(i =0; i<size; i++){
         for(j = 0; j<size;j++){
            System.out.print(arr3 [i][j]+"\t");
         }
         System.out.println();
       }

   }

}

