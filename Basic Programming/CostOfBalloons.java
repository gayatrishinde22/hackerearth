/*
 * Problem : https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/mojtaba-prepares-contest-29b2a044/
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.*;

class CostOfBalloons {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String args[] ) throws Exception {
        int testCases = Integer.parseInt(br.readLine());
        if(testCases>=1 && testCases<=10){
            for(int i=0;i<testCases;i++){
                int cost = getTestCases();
                System.out.println(cost);
            }
        }
    }
    private static int[][] getScoreMatrix(int numRows, int numCols) throws Exception{
        int[][] matrix = new int[numRows][numCols];
        for(int i=0;i<numRows;i++){
            String[] rowItems = br.readLine().split(" ");
            for(int j=0;j<numCols;j++){
                matrix[i][j]= Integer.parseInt(rowItems[j]);
            }
        }
        return matrix;
    }
    private static int getTestCases() throws Exception{
        String[] costStr = br.readLine().split(" ");
        int costOfGreen = Integer.parseInt(costStr[0]);
        int costOfPurple = Integer.parseInt(costStr[1]);
        int participants = Integer.parseInt(br.readLine());
        if(participants >= 1 && participants <=10){
            int[][] score = getScoreMatrix(participants,2);
            int firstPass=0,secondPass=0;
            for(int i=0;i<participants;i++){
                for(int j=0;j<2;j++){
                    if(j==0 && score[i][j]==1){
                        firstPass++;
                    }
                    if(j==1 && score[i][j]==1){
                        secondPass++;
                    }
                }
            }
            return (costOfGreen*firstPass + costOfPurple*secondPass > costOfPurple*firstPass + costOfGreen*secondPass) ? costOfPurple*firstPass + costOfGreen*secondPass : costOfGreen*firstPass + costOfPurple*secondPass;
        }else{
            return -1;
        }
    }
}
