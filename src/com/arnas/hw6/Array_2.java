package com.arnas.nd6;

import java.util.Arrays;
import java.util.Scanner;

public class Array_2 {
    public static void main(String[] args) {
        // Vartotojas nurodo masyvo dydį
        Scanner userInput = new Scanner(System.in);
        System.out.println("... Nurodykite masyvo dydį -> ");
        int n = Integer.parseInt(userInput.nextLine());

        int[] myArray = new int[n];
        int[] randomArray = new int[n];

        // Atsitiktinių skaičių generavimas
        System.out.println("... Atsitiktinių skaičių generavimas");
        for (int i = 0; i < myArray.length; i++) {
            randomArray[i] = (int)(Math.random() * 100);
        }

        // Masyvo užpildymas atsitiktiniais skaičiais
        System.out.println("... Masyvo užpildymas atsitiktiniais skaičiais");
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = randomArray[i];
        }
        System.out.println(Arrays.toString(myArray));

        // Masyvo elementu spausdinimas
        System.out.println("... Masyvo elementu spausdinimas");
        for (int i : myArray) {
            System.out.println(i);
        }
    }
}
