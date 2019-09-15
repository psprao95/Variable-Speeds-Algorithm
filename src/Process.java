import java.util.HashMap;
import java.util.concurrent.Callable;

class Process implements Callable{
	
	private int uid;
	private int anti_clockwise_neighbor;
	private int num_wait_rounds;
	 String status;
	int token;
	private HashMap<Integer,Integer> map;

public Process(int uid, int anti_clockwise_neighbor, int token, int num_wait_rounds , String status, HashMap<Integer,Integer> map)
{
	this.uid=uid;
	this.anti_clockwise_neighbor=anti_clockwise_neighbor;
	this.token=token;
	this.status=status;
	this.num_wait_rounds=num_wait_rounds;
	this.map=map;
	

}
public int getUniqueID()
{
	return uid;
}

@Override
public String call()
{
	try
	{
		System.out.println("Hi I am process "+uid);
	}
	catch(Exception ex)
	{
		System.out.println(ex);
	}
}
public 
}
