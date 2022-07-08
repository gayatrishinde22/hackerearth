/*
 * https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/roy-and-profile-picture/
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.*;

class RayProfilePicture {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String args[] ) throws Exception {
        int l = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int w,h,diffw,diffh;
        while(n > 0){
            String[] wh = br.readLine().split(" ");
            w = Integer.parseInt(wh[0]);
            h = Integer.parseInt(wh[1]);
            diffw = w-l;
            diffh = h-l;
            if((diffw == 0 && diffh == 0) || ((diffw > 0 || diffh > 0)&&(w == h)))
                System.out.println("ACCEPTED");
            else if(diffw < 0 || diffh < 0)
                System.out.println("UPLOAD ANOTHER");
            else 
                System.out.println("CROP IT");
            n--;
        }
        
    }
}
