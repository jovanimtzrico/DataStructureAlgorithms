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
public class ConsecutivesNumbers {

    //[4,5,6,2,3,4,5,6,7,8,9]
    public Integer[] findConsecutives(Integer[] numbers) {
        if (numbers.length == 0) {
            return numbers;
        }
        ArrayList<Integer> currentSequence = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        currentSequence.add(numbers[0]);
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i - 1] + 1 == numbers[i]) {
                currentSequence.add(numbers[i]);
            } else {
                if (currentSequence.size() > result.size()) {
                    result.clear();
                    result.addAll(currentSequence);
                }
                currentSequence.clear();
                currentSequence.add(numbers[i]);
            }
        }
        if (currentSequence.size() > result.size()) {
            result.clear();
            result.addAll(currentSequence);
        }
        Integer[] resNum = new Integer[result.size()];
        return result.toArray(resNum);
    }
}
