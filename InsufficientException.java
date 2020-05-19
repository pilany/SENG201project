package project1;
/** create a InsufficientException class extends the class  of IllegalStateException*/
public class InsufficientException extends IllegalStateException{
	public InsufficientException(){}
	public InsufficientException(String message) {
		super(message);
	}
}
