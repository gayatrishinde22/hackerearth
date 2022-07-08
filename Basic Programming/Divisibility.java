/*
 * Problem : https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/divisible-or-not-81b86ad7/
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.*;

class Divisibility {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int lastInt,currInt,finalInt=0;
        lastInt = Integer.parseInt(str[n-1]);
        if(lastInt % 10 == 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
    }
}
