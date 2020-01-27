import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args) {
        //load the spring config file
        //retrieve bean from spring container


        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
        Coach coach= context.getBean("myCoach", Coach.class);
        Coach coach1= context.getBean("myCoach", Coach.class);


        //check if they are same beans
       boolean result= coach==coach1;
        System.out.println("pointing to the same object    "+ result);
        System.out.println( "memory location for the coach "+ coach);
        System.out.println("memory location of the coach1  "+ coach1);

        context.close();
    }
}
