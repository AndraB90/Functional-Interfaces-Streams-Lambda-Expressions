import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class LaptopFactory {
    //Se poate folosi si Builder Design Pattern? Care este diferenta in comparatie cu Factory Design Pattern?

    static Random generator = new Random();

    private static ArrayList<String> brandList = new ArrayList<>(Arrays.asList( "Apple", "Asus", "HP", "Samsung", "LG", "Toshiba"));
    private static ArrayList<Integer> ramList = new ArrayList<>(Arrays.asList(2, 4, 18, 64));
    private static ArrayList<String> processorList = new ArrayList<>(Arrays.asList("Intel Core", "AMD Ryzen", "Intel Xeon", "Cinebench", "Geekbench"));
    private static ArrayList<Integer> diagonalList = new ArrayList<>(Arrays.asList(17, 33, 25, 15, 24, 40));
    private static ArrayList<Integer> priceList = new ArrayList<>(Arrays.asList(480, 1069, 658, 924, 878, 473));


    public static Laptop generate() {
        ArrayList<Game>games=new ArrayList<>();
        games.add(GameFactory.generateGame());
        games.add(GameFactory.generateGame());
        games.add(GameFactory.generateGame());

        return new Laptop(
                brandList.get(generator.nextInt(brandList.size())),
                ramList.get(generator.nextInt(ramList.size())),
                processorList.get(generator.nextInt(processorList.size())),
                diagonalList.get(generator.nextInt(diagonalList.size())),
                priceList.get(generator.nextInt(priceList.size())),
                games);

    }
}
