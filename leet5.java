public class leet5 {
    private static int low;
    private static int maxLen;
    public static void main(String[] args) {
        String s = "babbad";
        String ans = longestPalindrome(s);
        System.out.println(ans);
    }
    public static String longestPalindrome(String s){
        if(s.length()<2){
            return s;
        }
        for(int i=0;i<s.length()-1;i++){
            forPalindrome(s,i,i); //odd length palindrome
            forPalindrome(s,i,i+1); //even length palindrome
        }
        return s.substring(low,low+maxLen);
    }

    private static void forPalindrome(String s, int j, int k){
        while(j>=0 && k<s.length()&& s.charAt(j)==s.charAt(k)){
            j--;
            k++;
        }
        if(maxLen < k-j-1){
            low = j+1;
            maxLen = k-j-1;
        }
    }
}