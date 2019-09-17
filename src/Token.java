
public class Token {
	
	private int origin_process_id;
	private int num_waiting_rounds;
	
	public Token(int id)
	{
		this.origin_process_id=id;
		this.setWaitingRounds();
	}

	
	
	
	public int getOriginProcessId()
	{
		return this.origin_process_id;
	}
	
	public void setWaitingRounds()
	
	{
		this.num_waiting_rounds=(int)Math.pow(2, this.origin_process_id);
	}
	
public int getWaitingRounds()
	
	{
		return this.num_waiting_rounds;
	}
	
	
	public void decrementWaitingRounds()
	{
		this.num_waiting_rounds-=1;
	}

}
