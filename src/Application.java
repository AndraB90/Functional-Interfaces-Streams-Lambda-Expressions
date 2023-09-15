import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            students.add(StudentFactory.generateStudent());
        }

        /*for (Student s : students) {
            System.out.println(s);
        }

         */

        /*Consumer<Student> print = new Consumer<Student>() {
            @Override
            public void accept(Student student) {
                System.out.println(student);
            }
        };

        Predicate<Student> major = new Predicate<Student>() {
            @Override
            public boolean test(Student student) {
                return student.varsta >= 18;
            }
        };

        students.stream()
                .filter(major)
                .forEach(print);

         */

        /*Function<Student,String> transformInName = new Function<Student, String>() {
            @Override
            public String apply(Student student) {
                return student.nume;
            }
        };

         */

        ArrayList<Student> majori = new ArrayList<>();
        ArrayList<String> toateNumeleDinListaMeaDeStudenti = new ArrayList<>();

        /*students.stream()//A16 B22 C14 A19 A22
                .filter(s->s.varsta>=18)
                .peek(student -> majori.add(student))
                .sorted((s1, s2) -> Integer.compare(s1.varsta,s2.varsta))
                .map(s->s.nume)//A B C A A
                .peek(s->toateNumeleDinListaMeaDeStudenti.add(s))
                .distinct()
                .forEach(s-> System.out.println(s));

         */

        long numarStudentiACarorNumeIncepeCuA = students.stream()
                .filter(student -> student.nume.startsWith("A"))
                .count();

        System.out.println("Avem "+numarStudentiACarorNumeIncepeCuA+" studenti a caror numar incepe cu A");

        //un VECTOR/ARRAY cu toti studentii mei peste 1.70 inaltime

        Object[] studentiInalti = students.stream()
                .filter(s -> s.inaltime > 170)
                .toArray();

        for(Object s:studentiInalti){
            System.out.println(s);
        }

        //o lista cu toti studentii mei peste 1.70 inaltime

        students.stream()
                .filter(s -> s.inaltime > 170)
                .collect(Collectors.toList());

        Student s1 = new Student("Andrei", 22,123);
        Student s2 = new Student("Andrei", 22,123);

        System.out.println(s1.equals(s2));

        boolean totiSuntMajori = students.stream()
                .allMatch(s -> s.varsta >= 18);

        System.out.println("Sunt toti majori? "+totiSuntMajori);


    }
}
