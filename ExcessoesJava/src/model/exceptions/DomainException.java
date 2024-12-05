package model.exceptions;

public class DomainException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;  // devemos colocar isso por ser uma classe Serializable;
	
	public DomainException(String mensagemDaException) {
		super(mensagemDaException);
	}

}
