package com.config;

import org.quartz.Trigger;
import org.quartz.impl.triggers.CronTriggerImpl;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

/**
 * 通过编码来设置调度工厂
 * @author: Administrator
 * @data:2017年10月31日
 */
@Configuration
public class SchedulerFactoryConfig implements ApplicationContextAware {
	
	private ApplicationContext applicationContext;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		// TODO Auto-generated method stub
		this.applicationContext = applicationContext;
	}
	
	@Bean(name = {"sheduler"})
	public SchedulerFactoryBean schedulerFactoryBean() {
		// 生命周期自行处理
		SchedulerFactoryBean schedulerFactoryBean = new SchedulerFactoryBean();
		CronTriggerImpl trigger = applicationContext.getBean("trigger", CronTriggerImpl.class);
		schedulerFactoryBean.setTriggers(new Trigger[]{trigger});
		return schedulerFactoryBean;
	}
}
