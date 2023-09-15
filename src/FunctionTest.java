import java.util.function.Function;

public class FunctionTest {
    public static void main(String[] args) {
        Function<Integer,String> myFunction = new Function<Integer, String>() {
            @Override
            public String apply(Integer integer) {
                return null;
            }
        };

        System.out.println(myMethod(10,myFunction));

    }

    public static String myMethod(int numar,Function<Integer,String> function){
        return function.apply(numar);
    }
}
