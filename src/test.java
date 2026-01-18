import java.util.Locale;

public class test {
    public static void main(String[] args) {
        String protuct1 =("computer");
        String protuct2 =("office desk ");

        int age =30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println("Products:");
        System.out.printf("%s, which price is R$ %.2f%n ", protuct1, price1);
        System.out.printf("%s, which price is  R$ %.2f%n", protuct2, price2);
        System.out.printf("record: %d years old, code %d and gender:%c%n", age, code, gender);
        System.out.printf(" measure with eight decimal places: %.8f%n", measure);
        System.out.printf("Rouded (three decimal places): %.3f%n ", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal places: %.3f%n ", measure);

    }
}
