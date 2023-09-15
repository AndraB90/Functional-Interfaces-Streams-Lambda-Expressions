import java.util.function.Supplier;

public class SupplierTest {
    public static void main(String[] args) {

        Supplier<String> passwordSupplier=new Supplier<String>() {
            @Override
            public String get() {
                return "parolaCorecta";
            }
        };

        Supplier<String> passwordSupplier2= new Supplier<String>() {
            @Override
            public String get() {
                return "parolaCorecta2";
            }
        };

        connectToDatabase("parolaCorecta", passwordSupplier);
        connectToDatabase("parolaCorecta2", passwordSupplier2);
        connectToDatabase("test123", passwordSupplier);

    }

    public static void connectToDatabase(String passwordInput, Supplier<String> passwordSupplier){
        if(passwordSupplier.get().equals(passwordInput)){
            System.out.println("Ne-am conectat");
        }else{
            System.out.println("parola invalida");
        }

    }
}
