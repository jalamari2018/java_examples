public class ReverseNumber {
 
        public static void main(String[] args) {
                
                //original number
                int number = 1234;
                
                int reversedNumber = 0; 
                int temp = 0;
                
                while(number > 0){
                        
                        //use modulus operator to get the last digit
                        temp = number%10;
                        //devide by 10 to remove the last digit from number
                        number = number/10;
                        //create the reversed number
                        reversedNumber = reversedNumber * 10 + temp;            
                }
                
                //output the reversed number
                System.out.println("Reversed Number is: " + reversedNumber);
        }
}