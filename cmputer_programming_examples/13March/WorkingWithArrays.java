public class WorkingWithArrays
{

  public static void main(String[] args) {


   int [] a = {1,2,3,4,5,6};
   int [] b = {4,5,6,3,6,8};
   
   int [] z = new int[6];
   
   for(int i=0; i<6; i++){
      z[i] = a[i] * b[i];
   }
   
   for(int j=0; j<6; j++){
      System.out.print("  "+z[j]+"  ");
   }
   


  }

}