package TwoPointer;

import java.util.Arrays;

public class sortColors {
    public static int[] SortColors(int[] nums){
        int n=nums.length;
        int low=0;
        int mid=0;
        int high=n-1;

        while(mid<=high){
            if(nums[mid]==0){
                swap(nums,low,mid);
                mid++;
                low++;
            }else if(nums[mid]==1){
                mid++;
            }else{
                swap(nums,mid,high);
                high--;
            }
        }

        return nums;
    }
    public static void swap(int[] arr,int i , int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j]=temp;
    }
    public static void main(String[] args){
        int[] arr = {2,0,2,1,1,0};


        int[] result =  SortColors(arr);

        System.out.print(Arrays.toString(result));


    }
}
