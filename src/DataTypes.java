import java.util.Locale;

public class DataTypes {
    public static void main(String[] args) {
        // cele mai folosite 4 tipuri de date

        // String = sir de caractere delimitate de  " "
        String marca = "Dacia";
        String model = "1310";

        // aflam dimeansiunea unui string
        System.out.println(marca.length());

        // scriem cu litere mari
        System.out.println(marca.toUpperCase(Locale.ROOT));

        // scriem cu litere mici
        System.out.println(marca.toLowerCase());

        // integer = numar intreg, (int)
        int an_fabricatie = 1987;

        // double = numar zecimal
        double pret = 2300.50;

        // boolean = adevarat sau fals
        boolean inmatriculata = false;





    }
}
