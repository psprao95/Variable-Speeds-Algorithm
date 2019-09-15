
public class Token {
	
	private int cur_process_id;
	private int origin_process_id;
	int num_waiting_rounds;
	
	public Token(int id)
	{
		this.origin_process_id=id;
		num_waiting_rounds=(int)Math.pow(2, origin_process_id);
	}
	
	public void receiveToken(int id)
	{
		this.cur_process_id=id;
		num_waiting_rounds=(int)Math.pow(2, cur_process_id);
	}
	
	public int getCurProcessId()
	{
		return this.cur_process_id;
	}
	
	public int getOriginProcessId()
	{
		return this.origin_process_id;
	}
	
	public void decrementWaitingRounds()
	{
		this.num_waiting_rounds-=1;
	}

}
