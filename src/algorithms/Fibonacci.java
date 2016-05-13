/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

/**
 *
 * @author jovanimartinezrico
 */
public class Fibonacci {

    public int getFibonacci(int num) {
        if (num == 0) return 0;
        int[] sum = new int[num+1];
        sum[0] = 0;
        for (int i = 1; i <= num; i++) {
            if(i == 1){
                sum[1] = 1;
                continue;
            }
            sum[i] = sum[i-2]+sum[i-1];
        }
        return sum[num];
    }
}
