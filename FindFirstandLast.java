import java.util.Arrays;

public class FindFirstandLast {
    public int[] SearchRange(int nums[], int target){
        if(nums == null || nums.length==0){
            return new int[]{-1,-1};
        }

        int start = -1;
        int end = -1;
        for(int i=0; i < nums.length; i++){
            if(nums[i]== target){
                start = i;
                break;
            }
        }

        for(int i= nums.length-1; i>=0; i--){
            if(nums[i]==target){
                end = i;
                break;
            }
        }
        return new int[]{start,end};
    }
    public static void main(String args[]){
        int arr[]={5,7,7,8,8,10};
        FindFirstandLast obj = new FindFirstandLast();
        System.out.println(Arrays.toString(obj.SearchRange(arr,7)));
    }
}
