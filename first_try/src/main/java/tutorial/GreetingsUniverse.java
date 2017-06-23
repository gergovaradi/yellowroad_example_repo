package tutorial;

import tutorial.planets.Earth;
import tutorial.planets.Mars;
import tutorial.planets.Venus;

/**
 * Created by bbencze on 2017.06.19..
 */
public class GreetingsUniverse {

    public static void main(String[] args) {
        System.out.println("Greetings, Universe!");

        Earth e = new Earth();
        Mars m = new Mars();
        Venus v = new Venus();
    }
}
