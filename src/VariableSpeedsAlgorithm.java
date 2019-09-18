
import java.io.File;

import java.util.Arrays;
import java.util.HashMap;

import java.util.Scanner;
import java.util.concurrent.*;


public class VariableSpeedsAlgorithm {
 
	public static void main(String[] args) {
		try 
		{
			Scanner scanner=new Scanner(new File("/users/psprao/downloads/input.dat"));
			
			// take as input number of processes 
			int noOfThreads=scanner.nextInt();
			int[] uids=new int[noOfThreads];
			System.out.println("Number of processes: "+noOfThreads);
			
			// take the uids of the processes
			for(Integer i=0;i<noOfThreads;i++)
			{
				uids[i]=scanner.nextInt();
				
			}
			scanner.close();
			System.out.println("Input UIDs of processes: "+Arrays.toString(uids));
			
		
		HashMap<Integer,Token> map=new HashMap<Integer,Token>();
		
		for(Integer u:uids)
		{
			map.put(u, new Token(u));
		}
		
		FutureTask<Process>[] future =new FutureTask[noOfThreads];
		
		for(Integer i=0;i<noOfThreads;i++)
		{
			Token token=new Token(uids[i]);
			Process process= new Process(uids[i], i==0?uids[noOfThreads-1]:uids[i-1], token,"unknown",map);
			future[i]=new FutureTask<Process>(process);
		}
		
		String leader_found="no";
		int leader_id=0;
		while(leader_found.equals("no"))
		{
			for(int i=0;i<noOfThreads;i++)
			{
				new Thread(future[i]).start();
			}
			
			for(int i=0;i<noOfThreads;i++)
			{
				Process process = future[i].get();
				if(process.status.equals("leader"))
				{
					leader_id=process.getUniqueID();
					leader_found="yes";
				}
				
			
			}
			
			for(int i=0;i<noOfThreads;i++)
			{
				Process process=future[i].get();
				if(leader_found.equals("yes")&& process.status.equals("unknown"))
				{
					process.status="non-leader";
				}
			future[i]=new FutureTask<Process>(process);
			}
		}
		
		for(int i=0;i<noOfThreads;i++)
		{
			new Thread(future[i]).start();
		}
		
		
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	
}
