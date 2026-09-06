package TwoPointer;

import java.util.*;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] arr){
        if(arr == null || arr.length<3){
            return new ArrayList<>();
        }
        //sorting
        Arrays.sort(arr);
        // created Hashset
        Set<List<Integer>> result=new HashSet<>();

        //fixed element
        for(int i=0;i<arr.length-2;i++){
            int left= i+1;
            int right=arr.length-1;

            //following two sum approach to find out another two elements
            while(left < right){
                int sum = arr[i] + arr[left] + arr[right];
                if( sum == 0){
                    result.add(Arrays.asList(arr[i],arr[left],arr[right]));
                    left++;
                    right--;
                }else if (sum < 0){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return new ArrayList<>(result);
    }

    public static void main(String[] args){
        int[] array = {-1,0,1,2,-1,-4};

        List<List<Integer>> result = threeSum(array);

        System.out.print(result);
    }

}
