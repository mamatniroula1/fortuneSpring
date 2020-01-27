import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
    public static void main(String[] args) {
        //load the spring configuration file
        //retrieve bean from spring container
        //call methods on the bean


        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("fortune.xml");
        SoccerCoach coach= context.getBean("myCoach", SoccerCoach.class);

        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());
        System.out.println(coach.getEmail());
        System.out.println(coach.getTeam());

        context.close();
    }
}
