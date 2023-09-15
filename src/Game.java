public class Game {

    private int id;
    private String name;
    private static int counter=0;

    public Game(String name){
        this.id=counter++;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
