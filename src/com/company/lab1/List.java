package com.company.lab1;

import java.util.Arrays;
import java.util.Random;

public class List {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(11);
        }
        System.out.println("Массив : "+ Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.print("Отсортированный массив : " + Arrays.toString(arr));
    }
}
