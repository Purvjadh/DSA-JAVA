package TwoPointer;

import java.util.Arrays;

//Time complexity = o(n^2)
public class ThreeSumClosest {
    public static int threeSum(int[] arr,int target){

        //1-sort
        Arrays.sort(arr);

        int n = arr.length;

        //2-storing sum and differnce between target and sum
        int resultSum=arr[0] + arr[1]+arr[2];
        int minDifference= Integer.MAX_VALUE;

        //fixed value which is i with the help of for loop
        for(int i=0;i<n-2;i++){
            int left=i+1;
            int right=n-1;
            int sum= arr[i] + arr[left] + arr[right];
            while(left < right){

                //comparing sum with target
                if(sum == target){
                    return target;
                }else if(sum < target){
                    left++;
                }else{
                    right--;
                }

                //subtracting target from sum
                int diffToTarget = Math.abs(sum - target);

                //storing smallest difference in minDifference and its sum and returning that resultSum(closeset sum to target)
               if(diffToTarget < minDifference){
                    minDifference=diffToTarget;
                    resultSum=sum;
               }
            }


        }
        return resultSum;
    }
    public static void main(String[] args){
         int[] arr={-1,2,1,-4};
         int target = 1;
         int result=threeSum(arr,target);
         System.out.print(result);

    }
}
