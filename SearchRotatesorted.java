public class SearchRotatesorted {
    public int Search(int nums[], int target){
        if(nums == null || nums.length ==0){
            return -1;
        }
        for(int i=0;i<nums.length; i++){
            if(nums[i]== target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[]={4,5,6,7,0,1,2};
        SearchRotatesorted obj = new SearchRotatesorted();
        System.out.println(obj.Search(arr, 1));
    }
    
}
