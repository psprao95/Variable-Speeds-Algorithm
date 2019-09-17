import java.util.Map;
import java.util.concurrent.Callable;

class Process implements Callable{
	
	private int uid;
	private int anti_clockwise_neighbor;
	 String status;
	Token token;
	private Map<Integer,Token> map;

	public Process(int uid, int anti_clockwise_neighbor , Token token, String status, Map<Integer,Token> map)
{
	this.uid=uid;
	this.anti_clockwise_neighbor=anti_clockwise_neighbor;
	this.token=token;
	this.status=status;
	this.map=map;
	

}
	public int getUniqueID()
	{
		return uid;
	}

	@Override
	public Object call() throws Exception
	{

		System.out.println("Hi I am process "+uid);
		sendMessages();
		Thread.sleep(3000);
		changeState();
		return this;
	}
	

	public void sendMessages()
	{
		
		if(this.token.getWaitingRounds()==0)
		{
			token.setWaitingRounds();
			map.put(uid, token);
		}
		else
		{
			token.decrementWaitingRounds();
			map.put(uid, null);
		}
		System.out.println("Process UID "+this.uid+" Status: "+this.status);
	}
	
	public void changeState()
	{
		if(map.get(this.anti_clockwise_neighbor)!=null)
		{
			Token t=map.get(this.anti_clockwise_neighbor);
			if(t.getOriginProcessId()==this.uid)
			{
				this.status="leader";
			}
			else
			{
				if(t.getOriginProcessId()<this.token.getOriginProcessId())
				{
					token=t;
				}
			}
			
			System.out.println("Process UID "+this.uid+" Status: "+this.status);
		}
	}
}

