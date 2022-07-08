/*
 * Problem : https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/life-the-universe-and-everything/
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.*;

class LifeTheUniverseAndEverything {
    public static void main(String args[] ) throws Exception {
        Scanner scanner = new Scanner(System.in); 
        int i;
        while(scanner.hasNext()){
            i = scanner.nextInt();
            if(i == 42)
                break;
            System.out.println(i);
        }
    }
}
