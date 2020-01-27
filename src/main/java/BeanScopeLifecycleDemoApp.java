import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeLifecycleDemoApp {
    public static void main(String[] args) {
        //load the spring config file
        //retrieve bean from spring container


        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("beanScopeLifecycle-applicationContext.xml");
        Coach coach= context.getBean("myCoach", Coach.class);



        System.out.println(coach.getDailyWorkout());

        context.close();
    }
}
