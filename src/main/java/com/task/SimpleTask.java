package com.task;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * 
 * @author: Administrator
 * @data:2017年10月31日
 */
public class SimpleTask extends QuartzJobBean {
	
	private int i = 0;

	@Override
	protected void executeInternal(JobExecutionContext arg0)
			throws JobExecutionException {
		// TODO Auto-generated method stub
		System.out.println("I'm run times. [" + (++i) + "]");
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
}
