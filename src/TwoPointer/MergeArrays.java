package TwoPointer;

public class MergeArrays {
    public static void mergeArrays(int[] arr1,int[] arr2){
        int left = 0;
        int right = 0;
        int index = 0;
        int n = arr1.length;
        int m = arr2.length;

        //create third array to merge elements of first and second array
        int[] arr3 = new int[n+m];


        //run the loop jab tak first and second array end nahi hota
        while(left < n && right< m){
            if(arr1[left] <= arr2[right]){
                arr3[index] = arr1[left];
                left++;
                index++;
            }else{
                arr3[index]=arr2[right];
                right++;
                index++;
            }
        }

        //when second array ends  , run the loop only for first array
        while(left < n){
            arr3[index]= arr1[left];
            left++;
            index++;
        }

        //when first array ends , run the loop only for second array
        while(right < m){
            arr3[index]=arr2[right];
            right++;
            index++;

        }

        // again put the elements from array3 into arr1 and arr2
        for(int i=0;i<n+m;i++){
            if(i<n){
             arr1[i]=arr3[i];
            }else{
                arr2[i-n]=arr3[i];
            }
        }


    }


    public static void main(String[] args){
        int[] arr1 = {4,5,6,8};
        int[] arr2={9,10,11,12};

        mergeArrays(arr1,arr2);

        //print array one
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i] + " ");
        }

        System.out.print(" ");

        //print array two
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i] + " ");
        }

    }
}
