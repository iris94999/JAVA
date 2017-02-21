package banking.domain;

public class OverdraftException extends Exception{//异常类的子类
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private double deficit;
	
	public OverdraftException(String message,double deficit)//构造函数
	{
		super(message);
		this.deficit=deficit;
	}
	
	public double getDeficit()
	{
		return this.deficit;
	}
}
