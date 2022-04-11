package com.wb.spring.event;

import org.springframework.context.ApplicationEvent;

import java.io.Serializable;

/**
 * Description:
 *
 * @author wangbin33
 * @date 2020/5/5 20:56
 */
public class TestEvent extends ApplicationEvent implements Serializable {
	private static final long serialVersionUID = 7582196682485937896L;
	private String text;
	public TestEvent(Object source, String text) {
		super(source);
		this.text = text;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "TestEvent{" +
				"text='" + text + '\'' +
				'}';
	}
}
