import java.util.Comparator;
import java.util.function.Predicate;

public class Main3 {
    public static void main(String[] args) {

        Comparator<Student> dupaVarsta=new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Integer.compare(o1.varsta,o2.varsta);
            }
        };

        Predicate<Integer> myPredicate= new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return false;
            }
        };

        myMethod(2, n->n>7);

        myMethod(8,myPredicate);

    }

    //(o1, o2) -> Integer.compare(o1.varsta, o2.varsta);

    public static void myMethod(int number,Predicate<Integer> predicate){
        if(predicate.test(number)){
            System.out.println("Numarul este mai mare ca 7");
        }
    }
}
