public class Main2 {

    String propietate;

    public Main2(String propietate) {
        this.propietate = propietate;
    }

    public static void main(String[] args) {
        Main2 main=new Main2("Tudor");
        Main2 main2=new Main2("Andra");

        main.test();
        main2.test();

        test2();
    }

    public void test(){
        System.out.println("test"+propietate);
    }

    public static void test2(){
        System.out.println("test");
    }
}
