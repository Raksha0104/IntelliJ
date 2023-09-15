package Arrays;

public class HighestAltitude {
    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        int ans = largestAltitude(gain);
        System.out.println(ans);
    }

    static int largestAltitude(int[] gain){
        int n = gain.length;
        int[] gain1 =  new int[n+1];
        int initialStart = 0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<=i;j++){
                gain1[i+1]=initialStart+gain[i]+sum;
                sum = gain1[i+1];
            }
        }
        int ans = getMax(gain1);
        return ans;
    }

    static int getMax(int[] gain1){
        int n = gain1.length;
        int max = 0;
        for(int i=0;i<n;i++){
            if(gain1[i]>=max){
                max = gain1[i];
            }
        }
        return max;
    }
}
