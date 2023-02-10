import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AddTwoIntegers {

	public static void main(String[] args) 
		  throws IOException
		    {
		        BufferedReader reader = new BufferedReader(
		            new InputStreamReader(System.in));
		        String one = reader.readLine();
		        BufferedReader readerT = new BufferedReader(
		            new InputStreamReader(System.in));
		        String two = readerT.readLine();
		        int o=Integer.parseInt(one);  
		        int t=Integer.parseInt(two);
		        System.out.println(o+t);
		    }

	}


