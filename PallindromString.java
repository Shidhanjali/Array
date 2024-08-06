import java.util.*;
public class PallindromString {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a String:");
        String str=sc.nextLine();
        sc.close();
        System.out.println(isPallindrom(str));
    }
    public static boolean isPallindrom(String s){
        for(int i=0; i< s.length()/2;){
            int n=s.length();
            if(s.charAt(0)==s.charAt(n-1))
            return true;
            else
            return false;
        }
        return true;
    }
   
}
