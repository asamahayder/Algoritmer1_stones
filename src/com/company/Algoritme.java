package com.company;
import java.util.Arrays;

public class Algoritme {

    public Algoritme() {
    }

    public int maxStoneAlgortihm(int[] stones, int maxWeight){
        int currentWeight=0;
        int numberOfStones=0;
        Arrays.sort(stones);
        int i;

        for (i = 0; i <stones.length ; i++) {
            if (currentWeight>=maxWeight)
                break;
            currentWeight+=stones[i];
            numberOfStones++;
        }

        if (currentWeight>maxWeight){
            currentWeight=currentWeight-stones[i-1];
            numberOfStones--;
        }


        return numberOfStones;
    }
}
