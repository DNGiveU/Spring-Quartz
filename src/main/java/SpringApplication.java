import org.quartz.SchedulerException;
import org.quartz.impl.StdScheduler;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * 
 * @author: Administrator
 * @data:2017年10月31日
 */
public class SpringApplication {
	public static void main(String[] args) throws InterruptedException, SchedulerException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		// org.springframework.scheduling.quartz.SchedulerFactoryBean
		StdScheduler sheduler = context.getBean("sheduler", StdScheduler.class);
		// System.out.println(sheduler);	// org.quartz.impl.StdScheduler
		// System.out.println(sheduler.getTriggerGroupNames());	// [work_default]
	}
}
