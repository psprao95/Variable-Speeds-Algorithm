import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.stream.*;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;


public class VariableSpeedsAlgorithm {
 
	public static void main(String[] args) {
		try 
		{
			Scanner scanner=new Scanner(new File("/users/psprao/downloads/input.dat"));
			
			// number of processes (n)
			int noOfThreads=scanner.nextInt();
			int[] uids=new int[noOfThreads];
			System.out.println("Number of processes: "+noOfThreads);
			
			// take the uids of the processes i.e. uids[]
			for(Integer i=0;i<noOfThreads;i++)
			{
				uids[i]=scanner.nextInt();
				
			}
			System.out.println("Input UIDs of processes: "+Arrays.toString(uids));
			
		String leader="unknown";
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	
}
