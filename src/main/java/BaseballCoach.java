public class BaseballCoach implements Coach {

    private FortuneService fortuneService;

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "spend 30 minutes in the gym";
    }

    @Override
    public String getDailyFortune() {

        //use my fortuneservice to get my fortune
        return fortuneService.getFortune();
    }
}
