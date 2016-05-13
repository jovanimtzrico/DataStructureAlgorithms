/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

import java.util.ArrayList;

/**
 *
 * @author jovanimartinezrico
 */
public class FindFirstMaxNum {

    public int findNum(ArrayList<Integer> arrayNum) {
        if (arrayNum.isEmpty()) {
            return -1;
        } else if (arrayNum.size() == 1) {
            return arrayNum.get(0);
        }
        int maxNum = arrayNum.get(0);
        for (int i = 1; i < arrayNum.size(); i++) {
            if (maxNum > arrayNum.get(i)) {
                return maxNum;
            }
            maxNum = arrayNum.get(i);
        }
        return maxNum;
    }

    public int findNumLogN(int[] arrayNum) {
        return find(arrayNum, 0, arrayNum.length - 1)[0];
    }

    private int[] find(int[] array, int lowIndex, int highIndex) {
        int maxNum = 0;
        switch (Math.abs(lowIndex - highIndex)) {
            case 0:
                return new int[]{array[lowIndex], lowIndex};
            case 1:
                return array[lowIndex] > array[highIndex] ? new int[]{array[lowIndex], lowIndex} : new int[]{array[highIndex], highIndex};
            default:
                int pivot = Math.floorDiv(lowIndex + highIndex, 2);
                int[] lowArray = find(array, lowIndex, pivot);
                int[] highArray = find(array, pivot + 1, highIndex);
                if (lowArray[0] < highArray[0] && highArray[1] - lowArray[1] <= 2) {
                    if (lowArray[1] == pivot) {
                        return highArray;
                    }
                }
                return lowArray;
        }
    }
}
