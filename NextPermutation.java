import java.util.*;

public class NextPermutation {
    public void findNextPer(int a[]){
        int id1=-1;
        for(int i=a.length-2; i>=0; i--){
            if(a[i]<a[i+1]){
                id1=i;
                break;
            }
        }

        if(id1 ==-1){
            Arrays.sort(a);
        }else{
            for(int i=a.length-1; i>=0; i++){
                if(a[id1]<a[i]){
                    int temp = a[i];
                    a[i]=a[id1];
                    a[id1]=temp;
                    break;
                }
            }
            int left=id1+1;
            int right=a.length-1;

            while(left<right){
                int temp=a[left];
                a[left]=a[right];
                a[right]=temp;
                left++;
                right--;
            }
        }
    }
    public static void main(String args[]){
        int num[]={1,2,3};
        NextPermutation obj=new NextPermutation();
        obj.findNextPer(num);
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
    }
}