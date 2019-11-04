package testgroup.xmlspringdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import testgroup.xmlspringdemo.model.coach.Coach;

/**
 *
 * @author smallad
 */
public class HelloSpringApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach coach = context.getBean("myCoach", Coach.class);
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());

        context.close();

    }
}
