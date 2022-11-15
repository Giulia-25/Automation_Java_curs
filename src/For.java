public class For {
    public static void main(String[] args) {
        // for = loop; structura repetitiva
        // de unde incepem?
        // pana unde mergem?
        // pasul de parcurgere (pacing)?

        // problema: printam 101 dalmatieni
        for (int i = 1; i <= 101; i++) {
            // i = 1
            System.out.println("Dalmatianul cu nr " + i);
        }
        // ne ajuta sa parcurgem un array prin intermediul indexului

        int [] numere = {3, 7, 10, 20}; // numere [0] = 3
        for (int i = 0; i < numere.length; i++) {
            System.out.println("elementul are index " + i + " si valoarea " + numere[i]);
        }

        // for each = parcurge toate elementele din array si ajunge direct la valoare
        for (int numar : numere) {
            System.out.println("Numarul este: " + numar);
        }

        // parcurgem array de culori
        String [] culori = {"alb", "rosu", "galben"};
        for (String culoare : culori) {
            System.out.println("Culoarea actuala este: " + culoare);
        }

        // suma numerelor din array
        int s = 0;
        for (int numar : numere) { //3, 7
            s = s + numar; // 3+7.. 10+10
        }
        System.out.println(s);

    }
}
