import java.util.ArrayList;

public class Laptop {

    private int id;
    private String brand;
    private int ram;
    private String processor;
    private int diagonal;
    private int price;

    private ArrayList<Game>games;

    private static int counter=0;


    public Laptop( String brand, int ram, String processor, int diagonal, int price, ArrayList<Game> games) {
        this.id = counter++;
        this.brand = brand;
        this.ram = ram;
        this.processor = processor;
        this.diagonal = diagonal;
        this.price = price;
        this.games = games;
    }

    public String getBrand() {
        return brand;
    }

    public int getRam() {
        return ram;
    }

    public String getProcessor() {
        return processor;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public int getPrice() {
        return price;
    }

    public static int getCounter() {
        return counter;
    }

    public ArrayList<Game> getGames() {
        return games;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", ram=" + ram +
                ", processor='" + processor + '\'' +
                ", diagonal=" + diagonal +
                ", price=" + price +
                ", games=" + games +
                '}';
    }
}
