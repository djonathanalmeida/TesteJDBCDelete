package db;

public class DBintegrityException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	
	public DBintegrityException(String msg) {
		super(msg);
	}

}
