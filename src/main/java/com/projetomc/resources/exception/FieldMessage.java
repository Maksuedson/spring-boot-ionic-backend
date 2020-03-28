package com.projetomc.resources.exception;

import java.io.Serializable;

public class FieldMessage implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String fieldNome;
	private String message;
	
	public FieldMessage() {		
	}	

	public FieldMessage(String fieldNome, String message) {
		super();
		this.fieldNome = fieldNome;
		this.message = message;
	}

	public String getFieldNome() {
		return fieldNome;
	}

	public void setFieldNome(String fieldNome) {
		this.fieldNome = fieldNome;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
