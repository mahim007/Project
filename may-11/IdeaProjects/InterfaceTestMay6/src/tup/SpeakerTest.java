package tup;

/**
 * Created by ICT LAB PC on 5/6/17.
 */
public class SpeakerTest {

    public static void main(String[] args)
    {
        Speaker speaker;
        speaker =  new Politician();
        speaker.speak();

        speaker = new Priest();
        speaker.speak();

        speaker = new Lecturer();
        speaker.speak();
    }
}
