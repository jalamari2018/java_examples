import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class CalculateRectPerimeter {
 
        public static void main(String[] args) {
                
                int width = 3;
                int length = 4;
       
                
                /*
                 * Perimeter of a rectangle is
                 * 2 * (length + width)
                */
                
                int perimeter = 2 * (length + width);
                
                System.out.println("Perimeter of a rectangle is " + perimeter);
        }
                
}