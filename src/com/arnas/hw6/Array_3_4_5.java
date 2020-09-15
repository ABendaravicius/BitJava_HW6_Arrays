package com.arnas.nd6;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.Scanner;

public class Array_3_4_5 {
    public static void main(String[] args) {
        // Vartotojas nurodo masyvo dydį
        Scanner userInput = new Scanner(System.in);
        System.out.println("> Nurodykite masyvo dydį -> ");
        int n = Integer.parseInt(userInput.nextLine());

        int[] myArray = new int[n];
        int[] inputArray = new int[n];

        // Vartotojo įvestų skaičių saugojimas
        System.out.println("... Vartotojo įvestų skaičių saugojimas");
        for (int i = 0; i < n; i++) {
            System.out.println("> Įveskite " + (i+1) + "-ąjį masyvo elementą -> ");
            inputArray[i] = Integer.parseInt(userInput.nextLine());
        }

        // Masyvo užpildymas įvestais skaičiais
        System.out.println("... Masyvo užpildymas įvestais skaičiais");
        for (int i = 0; i < n; i++) {
            myArray[i] = inputArray[i];
        }
        System.out.println(Arrays.toString(myArray));

        // Masyvo elementu spausdinimas
        System.out.println("... Masyvo elementu spausdinimas");
        for (int i : myArray) {
            System.out.println(i);
        }

        // Masyvo elementų suma naudojant Arrays sum() metodą
        System.out.println("... Masyvo elementų suma naudojant Arrays sum() metodą");
        int suma1 = Arrays.stream(myArray).sum();
        System.out.println(suma1);

        // Masyvo elementų suma naudojant for each ciklą
        System.out.println("... Masyvo elementu suma naudojant for each ciklą");
        int suma2 = 0;
        for (int i : myArray) {
            suma2 += i;
        }
        System.out.println(suma2);

        // Masyvo elementų vidurkis naudojant Arrays average() metodą
        System.out.println("... Masyvo elemento vidurkis naudojant Arrays average() metodą");
        OptionalDouble average = Arrays.stream(myArray).average();
        double average1 = average.orElse(0);
        System.out.println(average1);

        // Masyvo elementų vidurkis naudojant / operatorių
        System.out.println("... Masyvo elementų vidurkis naudojant / operatorių");
        double average2 = suma2 / n;
        System.out.println(average2);
    }
}
