//LEETCODE1281 Solution -
 public class leetcode1281 {
    public int subtractProductAndSum(int n) {
        int p = 1;
        int s = 0;
        while (n!=0){
            p = p * (n%10);
            s = s + (n%10);
            n = n/ 10;
        }
        return p-s;
    }
}

