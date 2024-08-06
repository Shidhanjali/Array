import java.util.*;
public class LargestNoArray {
    public String largestNumber(int[] num){

        if(num== null || num.length ==0){
            return  " ";
        }

        String s[] = new String[num.length];
        for(int i=0; i<num.length; i++){
            s[i] =  String.valueOf(num[i]);
        }

        // s = [3, 30, 34, 5, 9]

        // Compare 30 and 3:
        // b + a = 303
        // a + b = 330
        // 330 > 303, so 3 comes before 30.

        // Compare 34 and 3:
        // b + a = 343
        // a + b = 334
        // 343 > 334, so 34 comes before 3
        Arrays.sort(s,(a,b) -> {
            String order1 = b + a;
            String order2 = a + b;
            return order1.compareTo(order2);
        });

        StringBuilder result = new StringBuilder();
        for(int i=0; i< s.length; i++){
            result.append(s[i]);
        }

        if(result.charAt(0)=='0')
        return "0";
        else
        return result.toString();
    }
    public static void main(String args[]){
        int arr[] = {3, 30, 34, 5, 9};
        LargestNoArray obj=new LargestNoArray();
        System.out.println(obj.largestNumber(arr));
    }
}
