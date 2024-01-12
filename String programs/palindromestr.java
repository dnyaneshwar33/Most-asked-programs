class palindromestr{
    public static void main(String args[]){
        String org = "MaM";
        String rev="";
        int len = org.length();
        for(int i=len-1;i>=0;i--){
            rev=rev+org.charAt(i);
        }
        if(org.equals(rev)){
            System.out.println("Palindrome");
        }
        else 
           System.out.println("not palindrome");
    }
}