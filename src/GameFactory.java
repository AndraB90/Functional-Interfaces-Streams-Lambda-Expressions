import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class GameFactory {
    static Random generator=new Random();

    static ArrayList<String>gameName=new ArrayList<>(Arrays.asList("Sims", "Tetris", "Chess", "Tomb Raider"));

    public static Game generateGame(){
        return new Game(gameName.get(generator.nextInt(gameName.size())));

    }
}
