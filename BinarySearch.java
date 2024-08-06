class BinarySearch{
    int findPosisition(int arr[], int n, int target){
        int start=0;
        int end=n-1;
        
        while(start<=end){
            int mid = start+(end -start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;

    }
    public static void main(String args[]){
        BinarySearch Bs = new BinarySearch();
        int arr[]={2,4,5,7,8,9,12};
        int num=arr.length;
        int result=Bs.findPosisition(arr,num,8);
        System.out.println("Position of the given no is:"+result);

    }
}