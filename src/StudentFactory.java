import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class StudentFactory {
    static Random generator = new Random();

    static ArrayList<String> studentNames = new ArrayList<>(Arrays.asList("Maria", "Ioana", "Sandu", "Andrei", "Dorel", "Tudor"));
    static ArrayList<Integer> varste = new ArrayList<>(Arrays.asList(16, 17, 18, 19, 20, 21));
    static ArrayList<Integer> inaltime = new ArrayList<>(Arrays.asList(160,170,180,190,200,210));

    public static Student generateStudent() {
        return new Student(
                studentNames.get(generator.nextInt(studentNames.size())),
                varste.get(generator.nextInt(varste.size())),
                inaltime.get(generator.nextInt(inaltime.size())));

    }

}
