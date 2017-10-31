package com.task;

/**
 * 第一种方式 继承QuartzJobBean
 * 第二种方式 在XML中自定义
 * @author: Administrator
 * @data:2017年10月31日
 */
public class JobTask {
	
	private int i = 0;

	public void run() {
		System.out.println("I'm run times. [" + (++i) + "]");
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
}
