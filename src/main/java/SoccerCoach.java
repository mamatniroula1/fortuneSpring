public class SoccerCoach implements Coach {

    private String email;
    private String team;

    private FortuneService fortuneService;

    public SoccerCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTeam(String team) {
        this.team = team;
    }
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("inside the setter method. ");
        this.fortuneService = fortuneService;
    }

    public void init(){
        System.out.println("Soccer coach: inside method ");
    }

    public void destroy(){
        System.out.println("Soccer coach: inside method cleaning");
    }

    @Override
    public String getDailyWorkout() {
        return "run 100 kilometers";
    }

    @Override
    public String getDailyFortune() {
        return "just do it"+fortuneService.getFortune();
    }
}
