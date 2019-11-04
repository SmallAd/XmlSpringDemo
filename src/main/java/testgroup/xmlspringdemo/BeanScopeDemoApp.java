package testgroup.xmlspringdemo;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import testgroup.xmlspringdemo.model.coach.Coach;

/**
 *
 * @author smallad
 */
public class BeanScopeDemoApp {

    public static void main(String[] args) {
        Coach coach;
        Coach alphaCoach;
        
        try (ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml")) {

            coach = context.getBean("myCoach", Coach.class);
            alphaCoach = context.getBean("myCoach", Coach.class);
        } catch (BeansException e) {
            e.printStackTrace();
            return;
        }

        boolean result = (coach == alphaCoach);

        System.out.println("\nPointing to the same object: " + result);
        System.out.println("\nMemory location for coach: " + coach);
        System.out.println("\nMemory location for alphaCoach: " + alphaCoach);

    }

}
