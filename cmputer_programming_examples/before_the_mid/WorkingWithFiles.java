import java.io.*;
import java.util.*;
public class WorkingWithFiles
{
	public static void main(String[] args) throws Exception{
   
   File fleExample = new File("Example.xpl");
   
   PrintWriter pwInput = new PrintWriter(fleExample);
   
   pwInput.println("Francine");
   
   pwInput.println("Mukoko");
	// Write a double-precision number to the file
	pwInput.println(22.85);
	// Write a Boolean value to the file
	pwInput.print(true);
   
   pwInput.close();
   
  }
}