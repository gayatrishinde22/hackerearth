/*
 * Problem : https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/find-product/
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.*;

class FindProduct {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] arrayStr = br.readLine().split(" ");
        double res = 1;
        int num;
        for(int i = 0 ; i < N ; i++){
            num = Integer.parseInt(arrayStr[i]);
            res = (res * num) % ((Math.pow(10, 9)) + 7);
        }
        int a = (int)res;
        System.out.println(a);
    }
}
