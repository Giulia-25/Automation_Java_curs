import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Liste {
    public static void main(String[] args) {
        // declaram o lista goala
        List<String> fructe = new ArrayList<>(); // importam liste cu Alt+Enter
        // au o dimensiune dinamica

        // cum se adauga elemente in lista
        fructe.add("mar");
        fructe.add("banana");
        fructe.add("portocala");

//        // cum se iau elemente din lista
        fructe.get(0);
        System.out.println(fructe.get(0));

        // cum se afla indexul unui element
        System.out.println(fructe.indexOf("banana"));

        // este lista goala?
        System.out.println(fructe.isEmpty());

        if (!fructe.isEmpty()) { // daca NU este goala
            System.out.println("avem ce manca");
        } else {
            System.out.println("nu avem ce manca");
        }

//        // elimin toate elementele din lista
//        fructe.clear();

        if (!fructe.isEmpty()) { // daca NU este goala
            System.out.println("avem ce manca");
        } else {
            System.out.println("nu avem ce manca");
        }

        // scoatem un element din lista
        fructe.remove("mar");

        // listam elemente din lista
        System.out.println(Arrays.toString(fructe.toArray()));

        // aflam dimensiunea listei
        System.out.println(fructe.size());

        // declaram o lista imutabila si o initializam cu valori
//        List<String> list = Arrays.asList(new String[]{"foo", "bar"});
        List<Integer> numere = Arrays.asList(new Integer[]{1, 33, 77});
        System.out.println(Arrays.toString(numere.toArray()));

        // declaram o lista dinamica
        String[] flowers = {"Ageratum", "Allium", "Poppy", "Catmint"};
        List<String> flowersList = new ArrayList<>(Arrays.asList(flowers));
        flowersList.add("Rose");
        System.out.println(Arrays.toString(flowersList.toArray()));

        // aflam unde este Poppy
        int poppy_index = flowersList.indexOf("Poppy");
        // stergem ce este in acea pozitie
        flowersList.remove(poppy_index);
        System.out.println(Arrays.toString(flowersList.toArray()));

        // scoatem in fucntie de valoare
        flowersList.remove("Catmint");
        System.out.println(Arrays.toString(flowersList.toArray())); // varianta veche pt afisarea unei liste

        System.out.println(flowersList); // varianta noua pt afisarea unei liste

    }
}
