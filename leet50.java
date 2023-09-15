public class leet50 {
    public static void main(String[] args) {
        double x = 2.10000;
        int n = 3;
        double ans = Math.pow(x,n);
        System.out.println(ans);
    }

    static double myPow(double x,int n){
        if(n==0){
            return 1;
        }
        if(n<0){
            n = -n;
            x = 1 /x;
        }
        if(n%2==0){
            return myPow(x*x,n/2);
        }else{
            return x*myPow(x,n-1);
        }
    }
}

/*  Method-01 */
//    public static void main(String[] args) {
//        double x = 2.00000;
//        int n = -2;
//        double ans = Math.pow(x,n);
//        System.out.println(ans);
//    }