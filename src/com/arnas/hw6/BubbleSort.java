package com.arnas.nd6;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        // ... rikiavimas (bubble sort algoritmas)
        int[] intArr6 = { 4, 1, 2, 0, 6 }; // rezultatas turėtų būti: 0, 1, 2, 4, 6
        System.out.println("Prieš rikiavimą: " + Arrays.toString(intArr6));
        int iteracijuSkaicius = 0;
        int keitimuSkaicius = 0;
        for (int k = 0; k < intArr6.length - 1; k++) {
            for(int kidx = 0; kidx < intArr6.length - 1; kidx++){
                if(intArr6[kidx] > intArr6[kidx + 1]){
                    int temporary = intArr6[kidx + 1];
                    intArr6[kidx + 1] = intArr6[kidx];
                    intArr6[kidx] = temporary;
                    keitimuSkaicius ++;
                }
                iteracijuSkaicius ++;
            }
        }
        System.out.println("Po rikiavimo: " + Arrays.toString(intArr6));
        System.out.println("BubbleSort rikiavimo algoritmas turėjo atlikti " + iteracijuSkaicius + " iteracijas(-ų)");
        System.out.println("Masyve reikšmes reikėjo sukeisti " + keitimuSkaicius + " kartus(-ų)");
    }
}
