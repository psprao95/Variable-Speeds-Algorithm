import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.stream.*;
import java.util.Map;
import java.util.Scanner;







public class VariableSpeedsAlgorithm {
 
	public static void main(String[] args) {
		try {
			Scanner scanner=new Scanner(new File("/users/psprao/downloads/input.dat"));
			int noOfThreads=scanner.nextInt();
			int[] uids=new int[noOfThreads];
			int i=0;
			while(scanner.hasNextInt()) {
				uids[i]=scanner.nextInt();
				System.out.println(uids[i]);
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	
}
