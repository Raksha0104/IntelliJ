package Bitwise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> ans = generate(numRows);
            System.out.println(ans);
    }

    static List<List<Integer>> generate(int numRows){
        List<List<Integer>> arr = new ArrayList<List<Integer>>();
        if(numRows<=0){
            return arr;
        }
        ArrayList<Integer> prev = new ArrayList<Integer>();
        prev.add(1);
        arr.add(prev); // Adding 1 to the first row
        for(int i=2;i<=numRows;i++){
            ArrayList<Integer> curr = new ArrayList<Integer>();
            curr.add(1);//stores the first value in row
            for(int j=0;j< prev.size()-1;j++){
                curr.add(prev.get(j)+ prev.get(j+1)); //stores the middle value in rows.
            }
            curr.add(1);//last value in row
            arr.add(curr);
            prev = curr;
        }
        return arr;
    }
}
