
public class Process {
private int uid;


public Process(int a)
{
	this.uid=a;
	Token token=new Token(uid);
}
public int getUniqueID()
{
	return uid;
}
}
