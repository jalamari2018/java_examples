public class SwapElementsExample {
 
        public static void main(String[] args) {
                
                int num1 = 10;
                int num2 = 20;
                int num3;
                

                
                System.out.println("Before Swapping");
                System.out.println("Value of num1 is :" + num1);
                System.out.println("Value of num2 is :" +num2);
                
                //swap the value
                num3 = num1;
                num1 = num2;
                num2 = num3; 
                System.out.println("After Swapping");
                System.out.println("Value of num1 is :" + num1);
                System.out.println("Value of num2 is :" +num2);
        }
 

}