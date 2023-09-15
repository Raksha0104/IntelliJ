package Arrays;

import java.util.Arrays;
import java.util.Collections;

// for 1,1,0 : first flip(reverse) the row, then second: for the reversed row invert the values of 0 and 1.
public class FlippingAndInverting {
    public static void main(String[] args) {
        int[][] image = {{1, 1, 0},  //nxn matrix
                {1, 0, 1},
                {0, 0, 0}
        };
        System.out.println(Arrays.deepToString(flipAndInvertImage(image)));
    }

//    static int[][] flipAndInvertImage(int[][] image) {
//        int[][] newImage = new int[image.length][image[0].length];
//        newImage = Collections.reverse(Arrays.asList(image));
//        for (int i = 0; i < newImage.length; i++) {
//            for (int j = 0; j < newImage[i].length; j++) {
//                if (image[i][j] == 0) {
//                    image[i][j] = 1;
//                }
//                if(image[i][j]==1){
//                    image[i][j] = 0;
//                }
//            }
//        }
//        return image;
//    }
//}

    static int[][] flipAndInvertImage(int[][] image){
        for (int i = 0; i < image.length; i++) { //error i did was initializing start and end before for i.
            int start = 0;
            int end = image[0].length-1;
            while(start<=end){ // error here was (start<end)
                int temp = image[i][start];
                image[i][start] = image[i][end];
                image[i][end] = temp;
                start++;
                end--;
            }
        }
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[0].length;j++){ //error i did was image[i].length
                if(image[i][j]==0){
                    image[i][j]=1;
                }else{
                    image[i][j]=0;
                }
            }
        }
        return image;
    }
}
