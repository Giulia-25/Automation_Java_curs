import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        // Flow control - if else = evalueza conditii si bifurca codul in funcite de rezultat

        System.out.println("pornim radio");
        boolean piesa_faina = false; // invat calculatorul daca piesa e faina sau nu
        // daca imi place piesa, dau mai tare
        if (piesa_faina == true) {
            System.out.println("dau mai tare radioul");
            System.out.println("incep sa fredonez piesa");
        }
            System.out.println("oprim radio");

        // if else
        int nr = 4;
        if (nr % 2 == 0) {
            System.out.println("nr par");
        } else {
            System.out.println("impar");
        }

        if (nr > 0) {
            System.out.println("pozitiv");
        } else {
            System.out.println("nu este pozitiv");
        }

        // if, else if, else
        // luam date de la tastatura
        Scanner sc = new Scanner(System.in);
////        System.out.println("Introdu ora");
////        int ora =  sc.nextInt();
////        if (ora < 0) {
////            System.out.println("ora invalida");
////        } else if (ora <= 11) {
////            System.out.println("neata");
////        } else if (ora <= 18) {
////            System.out.println("buna ziua");
////        } else if (ora <= 21) {
////            System.out.println("buna seara");
////        } else if (ora <= 24) {
////            System.out.println("noapte buna");
////        } else {
////            System.out.println("ora invalida");
//        }



        // flow control
        // switch - se foloseste cand stim valorile posibile

        System.out.println("Alege optiunea");
        int optiunea = sc.nextInt();
        switch (optiunea) {
            case 0:
                System.out.println("meniu anterior");
                break;
            case 1:
                System.out.println("ro");
                break;
            case 2:
                System.out.println("eng");
                break;
            default:
                System.out.println("invalid");
        }

        // <0 viteza invalida, 0 staioneaza, <= 50 localitate, <= 90 drum judetean, autostrada = TEMA

        System.out.println("Status viteza masina");
        int viteza =  sc.nextInt();
        if (viteza < 0) {
            System.out.println("viteza invalida");
        } else if (viteza == 0) {
            System.out.println("stationeaza");
        } else if (viteza <= 50) {
            System.out.println("localitate");
        } else if (viteza <= 90) {
            System.out.println("drum judetean");
        } else if (viteza > 91) {
            System.out.println("autostrada");
        } else
            System.out.println("rezultat inexistent");


    }// inchide functia main
} // inchide clasa
