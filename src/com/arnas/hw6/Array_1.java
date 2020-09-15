package com.arnas.nd6;

import java.util.Arrays;

public class Array_1 {
    public static void main(String[] args) {
        int[] myArray = new int[5];
        int[] randomArray = new int[5];

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
