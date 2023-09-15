import java.util.function.Consumer;

public class ConsumerTest {
    public static void main(String[] args) {
        Consumer<Integer> myConsumer=new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println("am consumat numarul "+integer);
            }
        };

        myMethod(10,myConsumer);
        myMethod(10,n-> System.out.println(n));

    }

    public static void myMethod(int number, Consumer<Integer> myConsumer){
        myConsumer.accept(number);
    }
}
