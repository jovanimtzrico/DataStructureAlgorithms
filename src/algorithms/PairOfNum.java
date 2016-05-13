/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author jovanimartinezrico
 */
public class PairOfNum {

    public ArrayList<Integer> pairNum(ArrayList<Integer> elements, int target) {       
        ArrayList<Integer> pairSum = new ArrayList<>();
        HashMap<Integer, Integer> checkSum = new HashMap<>();
        elements.forEach((num) -> {
            if(checkSum.containsKey(num)){
                pairSum.add(checkSum.get(num));
                pairSum.add(num);
                checkSum.remove(num);
            } else {
                checkSum.put(target-num, num);
            }            
        });
        return pairSum;
    }
}
