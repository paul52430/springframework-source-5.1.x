package com.wb.spring.tx;

/**
 * @author wangbin33
 */
public class MyException extends Exception {
	private static final long serialVersionUID = -5822391311405573443L;

	public MyException() {
	}
	public MyException(String msg) {
		super(msg);
	}
}
