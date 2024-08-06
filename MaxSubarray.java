public class MaxSubarray {
    static int  MaxsubarraySum(int a[]){

        int max_sum=Integer.MIN_VALUE;
        int cur_sum=0;
        for(int i=0; i<a.length; i++){
            cur_sum=cur_sum+a[i];
            if(max_sum<cur_sum){
                max_sum=cur_sum;
            }
            if(cur_sum<0){
                cur_sum=0;
            }
        }
        return max_sum;
    }
    public static void main(String args[]){
        int arr[]={-2, -3, 4, -1, -2, 1, 5, -3 };
        System.out.println("Maximum Subarray:"+MaxsubarraySum(arr));

    }
}


