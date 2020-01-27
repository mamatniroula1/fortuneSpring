import java.util.Random;

public class SadFortuneService implements FortuneService {

    String[] array= new String[]{"this is me", "this is you", "hey whats up"};


    @Override
    public String getFortune() {
        int rand= new Random().nextInt(array.length);
        return array[rand];
    }
}
