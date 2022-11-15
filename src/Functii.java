public class Functii {
    // functie = logica delimitata care poate fi refolosita
    // nu putem folosi spatii in nume
    // nu putem defini o functie in alta functie (nu pot instala firefox in chrome)

    // o functie simpla care ne printeaza ceva pe ecran
    // nu ne da niciun raspuns (nu are return)
    // nu are parametri

    public static void printGreeting () {
        System.out.println("Buna ziua! Bine ati venit!");
    }

    // o functie care saluta clientul in functie de numele lui
    // nu ne da niciun raspuns (nu are return)
    // are nevoie de parametri

    public static void printGreetingUserByName(String nume, String prenume) {
        System.out.println("Buna ziua " + nume + " " + prenume);
    }

    // o functie care calculeaza media a 3 numere
    // ne da un raspuns - suma numerelor va avea return
    // ce tip de date ava avea raspunsul? 3 + 6 / 2 = 4.5 (double)
    // are nevoie de parametri

    public static double mediaNr(int a, int b, int c) {
        double media = (a + b + c) / 3;
        return media;
    }

    // o functie care ne da valoarea lui pi
    // ne da un raspuns? da
    // raspunsul lui pi va fi double
    // are nevoie de parametri? nu

    public static double piValue () {
        // constanta - variabila care nu poate fi suprascrisa
        // o constanta se scrie cu litere mari
        final double PI = 3.14;
        return PI;
    }

    public static void main(String[] args) {
        // intra clientul 1
        printGreeting(); // se apeleaza functia

        // intra clientul 2
        printGreeting(); // Ctrl + click pe functie => ne duce la corpul ei

        // apelam o functie cu parametri, oferim argumente
        printGreetingUserByName("Lazar", "Giulia");
        printGreetingUserByName("Lazar", "Liliana");

        System.out.println(mediaNr(3, 3, 4));


        double media1 = mediaNr(31213, 312313, 423);
        double media2 = mediaNr (35, 324, 41);
        double media3 = mediaNr(33, 11, 11);
        System.out.println(media1);
        System.out.println(media2);
        System.out.println(media3);

        // primim rezultat medie 3.0 si nu 3.333 din cauza "int"
        // se rezolva cu double => public static double mediaNr(double a, double b, double c) {}
        // facem refactory = revenim la cod si il corectam

        System.out.println(piValue());

        // tema - aria unui dreptunghi
        // aria cercului
        // suma a doua nr
        // o functie care returneaza cate caractere are numele + prenumele
        String nume = "Lazar";
        String prenume = "Giulia";
        System.out.println(nume.length());
        // identificati voi probleme










    }
}
