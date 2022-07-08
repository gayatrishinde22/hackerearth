/*
 * Problem : https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/palindrome-check-2/
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.*;

class PalindromicString {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().trim();
        Stack<Character> stack = new Stack<>();  
        for(int i = 0 ; i < str.length() ; i++){
            stack.push(str.charAt(i));
        }
        boolean isPalindrome = true;
        for(int i = 0 ; i < (str.length() / 2) ; i++){
            if(stack.pop() != str.charAt(i)){
                isPalindrome = false;
            }
        }
        if(isPalindrome)
            System.out.println("YES");
        else    
            System.out.println("NO");
    }
}
