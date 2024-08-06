class MostWaterContain {
   
    public int maxArea(int ar[]){
        int area=0;

         // Time complexity----------> O(N^2)
        // for(int i=0; i<ar.length; i++){
        //     for(int j=0; j<ar.length; j++){
        //         area=Math.max(area,Math.min(ar[i],ar[j])*(j-i));
        //     }
        // }

        // Time complexity  O(N)

        int left=0;
        int right=ar.length-1;
        while(left<right){
            area=Math.max(area, Math.min(ar[left],ar[right])*(right-left));

            if(ar[left]<ar[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return area; 
    }
    public static void main(String args[]){
        int ar[]={1,8,6,2,5,4,8,3,7};
        MostWaterContain obj=new MostWaterContain();
        int result=obj.maxArea(ar);
        System.out.println(result);
    }
}
