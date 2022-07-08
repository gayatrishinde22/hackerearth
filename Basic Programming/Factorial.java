/*
 * Problem : https://www.hackerearth.com/problem/algorithm/find-factorial/
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.*;

class Factorial {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        if(N >= 1 && N <= 10){
            long factorial = 1;
            while(N > 0){
                factorial = factorial * N;
                N--;
            }
            System.out.println(factorial);
        }
    }
}
