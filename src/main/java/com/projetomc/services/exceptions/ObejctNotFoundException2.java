package com.projetomc.services.exceptions;

public class ObejctNotFoundException2 extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public ObejctNotFoundException2(String msg) {
		super(msg);
	}

	public ObejctNotFoundException2(String msg, Throwable cause) {
		super(msg, cause);
	}
}
