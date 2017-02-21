package banking.domain;

public class OverdraftException extends Exception{//异常类的子类
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private double deficit;
	
	public OverdraftException(String message,double deficit)
	{
		super(message);//把错误信息传递给父类，在主函数中getmessage();
		this.deficit=deficit;
	}
	
	public double getDeficit()
	{
		return this.deficit;
	}
}
