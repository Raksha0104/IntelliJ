package BinarySearch;

public class BinarySearchSQRT {
    public static void main(String[] args) {
        int n = 8;
        int p = 3;
//        System.out.printf("%.3f",sqrt(n,p));
        System.out.println(sqrt(n));
    }


    static int sqrt(int n) {
        int root = (int) Math.sqrt(n);
        return root;
    }

//    static double sqrt(int n,int p){
//        int start=0;
//        int end = n;
//
//        double root = 0.0;
//        while(start<=end){
//            int mid = (start+end)/2;
//            if(mid*mid==n){
//                root = mid;
//                return root;
//            }
//            if(mid*mid>n){
//                end = mid-1;
//            }
//            else{
//                start = mid+1;
//            }
//        }
//        double incr =0.1;
//        for(int i=0;i<p;i++){
//            while (root*root<=n){
//                root=root+incr;
//            }
//            root = root-incr;
//            incr = incr/10;
//        }
//        return root;
//    }
}