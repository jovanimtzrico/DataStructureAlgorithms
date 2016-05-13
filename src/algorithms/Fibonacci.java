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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //            0,1,1,2,3,5,8,13
        System.out.println("Fibonacci: "+ getFibonacci(7));
    }

    public static int getFibonacci(int num) {
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
