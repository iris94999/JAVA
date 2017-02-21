package banking.domain;

public class OverdraftException extends Exception{//�쳣�������
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private double deficit;
	
	public OverdraftException(String message,double deficit)//���캯��
	{
		super(message);
		this.deficit=deficit;
	}
	
	public double getDeficit()
	{
		return this.deficit;
	}
}
