package Arrays;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {10,15},
                {7,3},
                {3,25},
                {10,1}
        } ;
        int ans = maximumWealth(accounts);
        System.out.println(ans);
    }

    static int maximumWealth(int[][] accounts){
        int ans = Integer.MIN_VALUE;
        for (int i=0;i< accounts.length;i++){
            int sum =0 ;
            for (int j=0;j<accounts[i].length;j++){
                sum = sum+accounts[i][j];
            }
            if(sum>ans){
                ans=sum;
            }
        }
        return ans;
    }
}
