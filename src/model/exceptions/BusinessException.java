package model.exceptions;

public class BusinessException extends Exception{ 
	static final long serialVersionUID = 1L;
	
	public BusinessException(String msg) {
		super(msg);
	}

}
