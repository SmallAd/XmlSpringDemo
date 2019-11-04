package testgroup.xmlspringdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import testgroup.xmlspringdemo.model.coach.CricketCoach;

/**
 *
 * @author smallad
 */
public class SetterDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = 
                new ClassPathXmlApplicationContext("applicationContext.xml");
        
        CricketCoach cricketCoach = context.getBean("cricketCoach", CricketCoach.class);
        System.out.println(cricketCoach.getDailyWorkout());
        System.out.println(cricketCoach.getDailyFortune());
        System.out.println(cricketCoach.getEmail());
        System.out.println(cricketCoach.getTeam());
        
        context.close();
    }
}
