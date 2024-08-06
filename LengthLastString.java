class LengthLAstString{
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int count=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' ')
            count++;
            else
            break;
        }
        return count;
    }
    public static void main(String args[]){
        String str="Hello World";
        LengthLAstString obj= new LengthLAstString();
        int length=obj.lengthOfLastWord(str);
        System.out.println(length);
        System.out.println(str);
    }
}
