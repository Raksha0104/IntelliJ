package BinarySearch;

import java.util.Arrays;

public class SortedMatrix{
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(Arrays.toString(search(arr,9)));
    }
    // we might need this method as we are searching in individual rows as well.
    static int[] binarySearch(int[][] matrix,int row,int cStart, int cEnd, int target){
        //row: in which row you want to search.
        //cStart: starting from which col you want to search.
        //cEnd: up to which col do you want to search.
        //target: which element do you want to search.
        while (cStart<=cEnd){
            int mid = (cStart+cEnd)/2;
            if(matrix[row][mid]== target){
                return new int[]{row,mid};
            }
            if (matrix[row][mid]<target){
                cStart =mid+1;
            }else{
                cEnd = mid-1;
            }
        }
        return new int[]{-1,-1};
    }
    static int[] search(int[][] matrix, int target){
        //It may be possible that the matrix is of one dimension.
        int rows = matrix.length;
        int cols = matrix[0].length;// Here take care if the matrix is empty. Add a check for that.

        if(rows==1){
            return binarySearch(matrix,0,0,cols-1,target);
        }
        // run the loop until two rows are remaining
        int rStart = 0;
        int rEnd = rows-1;
        int cMid = cols/2;

        while(rStart<(rEnd-1)){//while this is true, there will be only two rows.
            int mid = (rStart+rEnd)/2;
            if(matrix[mid][cMid]==target){
                return new int[]{mid,cMid};
            }
            if(matrix[mid][cMid]<target){
                rStart = mid;
            }else{
                rEnd = mid;
            }
        }

        //now we have two rows
        //check whether the target is in the col of 2 rows
        if(matrix[rStart][cMid]==target){
            return new int[]{rStart,cMid};
        }
        if(matrix[rStart+1][cMid]==target){
            return new int[]{rStart+1,cMid};
        }
        //check in first half.
        if(target<=matrix[rStart][cMid-1]){
            return binarySearch(matrix,rStart,0,cMid-1,target);
        }
        //check in second half.
        if(target>=matrix[rStart][cMid+1]&& target<=matrix[rStart][cols-1]){
            return binarySearch(matrix,rStart,cMid+1,cols-1,target);
        }
        //check in third half.
        if(target<=matrix[rStart+1][cMid-1]){
            return binarySearch(matrix,rStart+1,0,cMid-1,target);
        }
        //check in fourth half.
        else{
            return binarySearch(matrix,rStart+1,cMid+1,cols-1,target);
        }
    }
}

