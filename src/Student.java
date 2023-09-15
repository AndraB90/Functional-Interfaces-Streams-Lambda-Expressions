import java.util.Objects;

public class Student extends Object {

    String nume;
    int varsta;
    int inaltime;

    public Student(String nume, int varsta, int inaltime) {
        this.nume = nume;
        this.varsta = varsta;
        this.inaltime = inaltime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return varsta == student.varsta && inaltime == student.inaltime && nume.equals(student.nume);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nume, varsta, inaltime);
    }

    @Override
    public String toString() {
        return "Student{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                ", inaltime=" + inaltime +
                '}';
    }
}
