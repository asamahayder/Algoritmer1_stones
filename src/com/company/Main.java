package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int arraySize = scan.nextInt();
        int maxWeight = scan.nextInt();

        int[] stones = new int[arraySize];
        Algoritme algoritme = new Algoritme();
        for (int i = 0; i <stones.length ; i++) {
            stones[i]= scan.nextInt();
        }

        System.out.println(algoritme.maxStoneAlgortihm(stones,maxWeight));

    }
}
