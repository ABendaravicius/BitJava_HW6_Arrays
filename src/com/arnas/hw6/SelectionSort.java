package com.arnas.nd6;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] intArr = { 4, 1, 2, 0, 6 }; // rezultatas turėtų būti: 0, 1, 2, 4, 6
        System.out.println("Prieš rikiavimą: " + Arrays.toString(intArr));
        // Selection Sort rikiavimo algoritmas
        int n = intArr.length;
        int minIdx = 0;
        for (int i = 0; i < n-1; i++) {
            minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (intArr[j] < intArr[minIdx]) {
                    minIdx = j;
                }
            }
            System.out.println("Skaicius " + intArr[minIdx] + " perkeltas iš " + minIdx + " pozicijos masyve į " + i + " poziciją.");
            int temp = intArr[minIdx];
            intArr[minIdx] = intArr[i];
            intArr[i] = temp;
        }
        System.out.println("Po rikiavimo: " + Arrays.toString(intArr));
    }
}
