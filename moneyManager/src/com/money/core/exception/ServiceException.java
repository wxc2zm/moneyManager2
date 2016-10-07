package com.money.core.exception;

public class ServiceException extends SysException {

	private static final long serialVersionUID = 1L;
	
	public ServiceException() {
		super("业务操作错误！");
	}
	
	public ServiceException(String message) {
		super(message);
	}
}
