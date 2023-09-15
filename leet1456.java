import java.util.*;

public class leet1456 {
    public static void main(String[] args) {
        String s = "abciiidef";
        int k =3;
        int ans = maxVowels(s,k);
        System.out.println(ans);
    }

    static int maxVowels(String s, int k) {
        int count = 0;
        char arr[] = s.toCharArray();
        for(int i = 0; i<k; i++){
            if(arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u')
                count++;
        }
        int max = count;
        for(int i = k; i<arr.length; i++){
            if(arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u')
                count++;
            if(arr[i-k] == 'a' || arr[i-k] == 'e' || arr[i-k] == 'i' || arr[i-k] == 'o' || arr[i-k] == 'u')
                count--;
            max = Math.max(count, max);
        }
        return max;
    }
}
