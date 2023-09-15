package Arrays;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class CountItemsMatchingRule {
    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<List<String>>();
        items = Arrays.asList(Arrays.asList("phone","blue","pixel"),
                Arrays.asList("computer","silver","lenovo"),
                Arrays.asList("phone","gold","iphone"));

        String ruleKey = "color";
        String ruleValue = "silver";

        int ans = countMatches(items,ruleKey,ruleValue);
        System.out.println(ans);
    }

    static int countMatches(List<List<String>> items, String ruleKey,String ruleValue){
        int res = 0;
        for (int i = 0; i < items.size(); i++) {
            if(ruleKey.equals("type") && ruleValue.equals(items.get(i).get(0))){
                res++;
            }
            else if(ruleKey.equals("color") && ruleValue.equals(items.get(i).get(1))){
                res++;
            }else if (ruleKey.equals("name") && ruleValue.equals(items.get(i).get(2))){
                res++;
            }
        }
        return res;
    }
}