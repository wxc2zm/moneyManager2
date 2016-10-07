package com.money.core.exception;

public class ActionException extends SysException {

	private static final long serialVersionUID = 1L;
 
	public ActionException() {
		super("请求发送错误!");
	}
	
	public ActionException(String message) {
		super(message);
	}
}
