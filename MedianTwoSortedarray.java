import java.util.*;
class MedianTwoSortedarray {
    public double findMedianSortedArrays(int[] num1, int[] num2) {
        int i,j;
        int ans[]= new int[num1.length+num2.length];
         for(i=0; i<num1.length; i++){
            ans[i]=num1[i];
         }
         for(j=0;j<num2.length; j++){
            ans[i+j] = num2[j];
         }

         Arrays.sort(ans);
         double median;

         if(ans.length%2==0){
            median=(ans[ans.length/2-1] + ans[ans.length/2])/2.0;
         }
         else{
            median=ans.length/2;
         }
         return median;
         
    }

    public static void main(String[] args) {
       MedianTwoSortedarray sol = new MedianTwoSortedarray();
        int[] ar1 = {1, 2};
        int[] ar2 = {3, 4};

        double median = sol.findMedianSortedArrays(ar1, ar2);
        System.out.println("The median is: " + median); // Expected output: 2.5
    }
}
