public class leet1342 {
    public static void main(String[] args) {
        int num = 123;
        int ans = numberOfSteps(num);
        System.out.println(ans);
    }

    static int numberOfSteps(int num){
        int count = 0;
        while(num!=0){
            if(num%2==0){
                num = num / 2;
                count++;
            }else{
                num = num - 1;
                count++;
            }
            numberOfSteps(num);
        }
        return count;
    }
}
