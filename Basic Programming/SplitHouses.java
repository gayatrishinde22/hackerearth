/*
 * Problem : https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/split-house-547be0e9/
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.*;

class SplitHouses {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String args[] ) throws Exception {
        int n = Integer.parseInt(br.readLine());
        if(1<=n && n<=20){
            String result = getResult(n);
            System.out.println(result);
        }
    }
    private static String getResult(int n) throws Exception{
        String laneStr = br.readLine().trim();
        StringBuilder lane =new StringBuilder();
        lane.append(laneStr);
        String no = "NO" , yes="YES";
        char house='H',grid='.',fense='B';
        int replace = laneStr.replace("H", "").length();
        int homeCount = n-replace;
    
        if(laneStr.indexOf("H")==-1){
            return yes+"\n"+laneStr.replace(grid, fense);
        }else if(n==1 && homeCount==1){
            return yes+"\n"+laneStr;
        }
        else if(laneStr.contains("HH")){
            return no;
        }else if(homeCount == laneStr.length()){
            return no;
        }
        boolean isHouse = laneStr.contains("H");
        for(int i=0;i<n;i++){
            if(lane.charAt(i)==grid && isHouse){
                lane.setCharAt(i,fense);
            }
        }   
        if(lane.indexOf("B")==-1){
            return no;
        }else{
            return yes+"\n"+lane;
        }
        
    }
}
