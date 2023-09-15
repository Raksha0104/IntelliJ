package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWithGreatestCandies {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies=3;
        List<Boolean> ans = kidsWithCandies(candies, extraCandies);
        for (int i = 0; i < candies.length; i++) {
            System.out.println(ans);
        }
    }

    static List<Boolean> kidsWithCandies(int[] candies,int extraCandies){
        List<Boolean> list = new ArrayList<>();
        int  max = max(candies);
        for(int i =0;i<candies.length;i++){
            int sum =0;
            sum = candies[i]+extraCandies;
            if(sum>=max){
                list.add(true);
            }else{
                list.add(false);
            }
        }
        return list;
    }

    static int max(int[] candies){
        int max=0;
        for(int i=0;i<candies.length;i++){
            if(max<candies[i]){
                max = candies[i];
            }
        }
        return max;
    }
}
