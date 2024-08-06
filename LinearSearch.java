public class LinearSearch {
    static int search(int arr[], int n,int x){
        for(int i=0;i<n;i++){
            if(arr[i]==x)
            return i;
        }
        return -1;
    }
    public static void main(String args[]){
        // LinearSearch ls =new LinearSearch();
        int arr[]={4,6,7,8,9,12};
        int result=search(arr,arr.length,9);
        System.out.println("Index of Searching no is:"+result);
    }
}
