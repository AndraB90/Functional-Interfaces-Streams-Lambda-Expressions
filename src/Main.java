import java.util.*;
import java.util.stream.Collectors;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static Scanner intScanner = new Scanner(System.in);


    /*
    Sa da clasa Laptop cu urmatoarele campuri: Id, marca, ram, procesor, diagonala si pret
    Creaza clasa si creaza un laptop factory
     */

    public static void main(String[] args) {
        ArrayList<Laptop> laptopArrayList = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            laptopArrayList.add(LaptopFactory.generate());
        }


        /*
        Sa sortez lista dupa fiecare criteriul posibil
         */

        /*
        sort(laptopArrayList);

         */

        /*
        Printeaza cate laptopuri de Marca Dell cu Diagonala de peste 15
         */

        /*
        printHowManyDellLaptopsWithDiagonalOver15(laptopArrayList);
         */

        /*
        Printeaza daca exista cel putin un laptop mai ieftin de 400
         */

        /*
        printAtLeastOneLaptopLessThan400(laptopArrayList);
         */

        /*
        stoceaza intr-un Array preturile tuturor laptopurilor de Marca Samsung, printeaza Array-ul
         */

        /*
        printSamsungPricesArray(laptopArrayList);
         */

        /*
        Sa se printeze daca primele 5 laptopuri au mai mult de 8 RAM
         */

        /*firstFiveLaptopsHigherThan8RAM(laptopArrayList);

         */

        // Printeaza primul laptop de marca Dell

        //findFirstLaptopDell(laptopArrayList);


        // Printeaza toate jocurile laptopurilor

        //printAllLaptopGames(laptopArrayList);

        // User-ul is se va cere urmatoarele functionalitati: marca dorita, ram-ul dorit, procesorul dorit; printeaza toate laptopurile care corespund
        //Daca nu exista nici un laptop care sa corespunda la cele trei cerinte se va printa un mesaj corespunzator
        // Se vor printa mesajele urmatoare daca este cazul:
        //Din specificatiile dorite avem in schimb laptop-uri de marca si procesorul dorit: (printeaza laptopurile)
        //Din specificatiile dorite avem in schimb laptop-uri de marca si ram-ul dorit: (printeaza laptopurile)
        //Din specificatiile dorite avem in schimb laptop-uri de ram-ul si procesorul dorit: (printeaza laptopurile)


        printUserInputLaptopSearchResults(laptopArrayList);

    }

    public static void sort(ArrayList<Laptop> list) {
        list.stream()
                .sorted((o1, o2) -> Integer.compare(o1.getPrice(), o2.getPrice()))
                .forEach(laptop -> System.out.println(laptop));
    }

    public static void printHowManyDellLaptopsWithDiagonalOver15(ArrayList<Laptop> list) {
        long resultat = list.stream()
                .filter(laptop -> laptop.getDiagonal() > 15)
                .filter(laptop -> laptop.getBrand().equals("Dell"))
                .count();

        System.out.println(resultat);
    }

    public static void printAtLeastOneLaptopLessThan400(ArrayList<Laptop> list) {
        boolean exists = list.stream()
                .anyMatch(laptop -> laptop.getPrice() < 400);

        System.out.println(exists);
    }

    public static void printSamsungPricesArray(ArrayList<Laptop> list) {
        Object[] samsungPrices = list.stream()
                .filter(laptop -> laptop.getBrand().equals("Samsung"))
                .map(laptop -> laptop.getPrice())
                .toArray();

        Arrays.stream(samsungPrices).forEach(System.out::println);

    }

    public static void firstFiveLaptopsHigherThan8RAM(ArrayList<Laptop> list) {
        boolean result = list.stream()
                .limit(5)
                .allMatch(laptop -> laptop.getRam() >= 8);

        System.out.println(result);

    }

    public static void findFirstLaptopDell(ArrayList<Laptop> list) {
        Optional<Laptop> dellOptional = list.stream()
                .filter(laptop -> laptop.getBrand().equals("Dell"))
                .findFirst();

        if (dellOptional.isEmpty()) {
            System.out.println("There is no Dell Laptops");
        } else {
            System.out.println(dellOptional.get());
        }
    }

    public static void printAllLaptopGames(ArrayList<Laptop> list) {
        list.stream()
                .flatMap(laptop -> laptop.getGames().stream())
                .map(Game::getName)
                .forEach(System.out::println);
    }

    public static void printUserInputLaptopSearchResults(ArrayList<Laptop> list) {
        System.out.println("Which brand are you looking for? ");
        String chosenBrand = scanner.nextLine();
        System.out.println("Which RAM are you looking for? ");
        int chosenRam = intScanner.nextInt();
        System.out.println("Which processor are you looking for? ");
        String chosenProcessor = scanner.nextLine();

        List<Laptop> collect = list.stream()
                .filter(laptop -> laptop.getBrand().equals(chosenBrand))
                .filter(laptop -> laptop.getRam() == chosenRam)
                .filter(laptop -> laptop.getProcessor().equals(chosenProcessor))
                .collect(Collectors.toList());


        if (collect.isEmpty()) {
            System.out.println("Unfortunately, we have no laptops that match all your criteria");
            List<Laptop> combinatiiBrandRam = list.stream()
                    .filter(laptop -> laptop.getBrand().equals(chosenBrand))
                    .filter(laptop -> laptop.getRam() == chosenRam)
                    .collect(Collectors.toList());

            checkAndPrint(combinatiiBrandRam, "brand and ram");

            List<Laptop> combinatiiBrandProcessor = list.stream()
                    .filter(laptop -> laptop.getBrand().equals(chosenBrand))
                    .filter(laptop -> laptop.getProcessor().equals(chosenProcessor))
                    .collect(Collectors.toList());

            checkAndPrint(combinatiiBrandProcessor, "brand and processor");

            List<Laptop> combinatiiProcessorRam = list.stream()
                    .filter(laptop -> laptop.getProcessor().equals(chosenProcessor))
                    .filter(laptop -> laptop.getRam()==chosenRam)
                    .collect(Collectors.toList());

            checkAndPrint(combinatiiProcessorRam, "processor and ram");

        } else {
            for (Laptop i : collect) {
                System.out.println(i);
            }
        }


    }

    public static void checkAndPrint(List<Laptop> laptopList, String text) {
        if (!laptopList.isEmpty()) {
            System.out.println("From the specifications we have laptops of your desired " + text);
            for (Laptop laptop : laptopList) {
                System.out.println(laptop);
            }
        }
    }


}
