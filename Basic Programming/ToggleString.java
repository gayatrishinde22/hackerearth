/*
 * Problem : https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/modify-the-string/
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.*;

class ToggleString {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String args[] ) throws Exception {
        StringBuilder str = new StringBuilder();
        str.append(br.readLine().trim());
        int length = str.length();
        if(length >= 1 && length <= 100){
            for(int i = 0 ; i < length ; i++){
                char ch = str.charAt(i);
                if(Character.isUpperCase(ch)){
                    str.setCharAt(i,Character.toLowerCase(ch));
                }else{
                    str.setCharAt(i,Character.toUpperCase(ch));
                }
            }
            System.out.println(str);
        }
    }
}
