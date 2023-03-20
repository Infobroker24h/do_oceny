package pl.dooceny;

import java.util.Scanner;

public class ListaZadan {

    public static void main(String[] args) {
        //z notatek komenda Scanner
        String kluczWejściowy, prawidłowyKlucz="Igor";
        Scanner wejście = new Scanner(System.in);

        System.out.println("Wpisz klucz:");

        kluczWejściowy = wejście.nextLine();

        if (kluczWejściowy.equals(prawidłowyKlucz)) {

            System.out.println("Klucz prawidłowy. Wejście do programu.");
            System.out.println("Wpisz zadanie do wykonania:");

        }  else  {
            System.out.println("Klucz nieprawidłowy. Wpisz prawidłowy klucz:");
            kluczWejściowy = wejście.nextLine();

        }




    }


}
