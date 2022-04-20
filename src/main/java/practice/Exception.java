package practice;

public class Exception extends RuntimeException 
{
	public enum ExceptionType
	{
		ENTERED_NULL,ENTERED_EMPTY
	}
	
	public ExceptionType type;

	public Exception(ExceptionType type,String message) {
		super(message);
		this.type = type;
	} 

}
