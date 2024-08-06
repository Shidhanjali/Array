// import java.util.*;
// import java.io.*;
public class PasswordChecker {
    public String CheckPass(String str1, String str2){
        if(str1.length() != str2.length()){
            return "_NotVerified";
        }

        for(int i=0; i<str1.length(); i++){
            if(str1.charAt(i) != str2.charAt(i)){
                return "_NotVerified";
            }
        }

        return "_Verified";

    }

    public static void main(String args[]){
        PasswordChecker obj = new PasswordChecker();
        String input1 ="ABC123";
        String input2 ="Afgt432";
        System.out.println(input1+obj.CheckPass(input1, input2));
    }
}
