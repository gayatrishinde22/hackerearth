/*
 *  * Problem : https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/is-zoo-f6f309e7/
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.*;

class Zoos {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        int length = word.length();
        if(length >20){
            System.out.println("Maximum length exceeded");
        }else{
            int zcount=0,ocount=0;
            for(int i=0;i<word.length();i++){
                if(word.charAt(i)=='z'){
                    zcount++;
                }
                if(word.charAt(i)=='o'){
                    ocount++;
                }
            }
            if(zcount*2 == ocount){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
       
    }
}
