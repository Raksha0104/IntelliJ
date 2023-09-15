package JavaPrograms;

public class RightmostSetBit {
    public static void main(String[] args) {
        int n = 36;
        int ans = pos(n);
        System.out.println(ans);
    }

    static int pos(int n){
        int ans = 1;
        while(n > 0){
            if((n & 1) == 1){
                return ans;
            }
            ans = ans * 2;
            n = n >> 1;
        }
        return ans;
    }
}
