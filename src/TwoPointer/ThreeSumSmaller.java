package TwoPointer;

import java.util.*;

public class ThreeSumSmaller {
    public static int threeSum(int[] arr,int target){

        //Sort
        Arrays.sort(arr);

        //triplet count
        int count=0;

        //fix i value
        for(int i=0;i<arr.length-2;i++){
            int left= i+1;
            int right=arr.length-1;


            while(left < right){
                int sum = arr[i] + arr[left] + arr[right];
                if( sum >= target){
                    right--;
                }else {
                    //all the values before right pointer are smaller than target
                    count=count+(right-left);
                    left++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args){
        int[] array = {-2, 0, 1, 3};
        int target=2;

        int count = threeSum(array,target);

        System.out.print(count);
    }

}
