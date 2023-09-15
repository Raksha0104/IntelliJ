package Arrays;

public class NumbersSmallerThanCurrent {
    public static void main(String[] args) {
        int[] nums ={8,1,2,2,3};
        int[] ans = smallerNumbersThanCurrent(nums);
        for (int i =0;i< nums.length;i++){
            System.out.print(ans[i]+" ");
        }
    }

    static int[] smallerNumbersThanCurrent(int[] nums){
        int[] count = new int[nums.length];
        for(int i=0;i< nums.length;i++){
            for(int j=0;j < nums.length;j++){
                int temp = nums[i];
                if(temp>nums[j] && j!=i){
                    count[i]++;
                }
            }
        }
        return count;
    }
}
