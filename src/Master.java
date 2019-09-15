
public class Master implements Runnable{
	int num_of_processes;
	int[] uids;
	
	public Master(int n, int[] uids)
	{
		this.num_of_processes=n;
		this.uids=uids;
		Thread t=new Thread(this);
		t.start();
	}
	
	
	public void run()
	{
		try
		{
			System.out.println("Master process has been created");
		}
		
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
