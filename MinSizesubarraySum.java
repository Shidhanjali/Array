// Time complexity O(n^2)


// public class MinSizesubarraySum {
//     public static void main(String args[]){
//         int arr[]={2,3,1,2,4,3};
//         System.out.println("Minimum Length:"+ minSubarrayLen(7,arr));

//     }
//     public static  int minSubarrayLen(int target, int[] num) {
//         int min_length=num.length+1;
//         for(int i=0; i<num.length; i++){
//             int cur_sum=0;
//             for (int j = i; j < num.length; j++) {
//                 cur_sum += num[j];
//                 if (cur_sum >= target) {
//                     min_length = Math.min(min_length, j - i + 1);
//                     break; // Exit the inner loop since we found a valid subarray
//                 }
//             }
//         }
//         if (min_length == num.length + 1) {
//             return 0;
//         } else {
//             return min_length;
//         }
//         // return (min_length == num.length + 1) ? 0 : min_length;  
//     }
// }




// time complexity  O(N)

public class MinSizesubarraySum {
    public static void main(String args[]){
        int arr[] = {2, 3, 1, 2, 4, 3};
        System.out.println("Minimum Length: " + minSubarrayLen(7, arr));
    }

    public static int minSubarrayLen(int target, int[] num) {
        int n = num.length;
        int min_length = n + 1;
        int j = 0;
        int sum = 0;
        
        // i=rigth, j=left
        for (int i = 0; i < n; i++) {
            sum += num[i];

            while (sum >= target) {
                min_length = Math.min(min_length, i - j + 1);
                sum -= num[j++];
            }
        }

        return (min_length == n + 1) ? 0 : min_length;
    }
}


