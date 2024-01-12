//Program to count particular char in string
class charcount{
    public static void main(String args[]){
        String str="Dnyaneshwar";
        str=str.toLowerCase();
        char c='n';
        int count=0;
        for(int i=0;i<str.length();i++){
             if(str.charAt(i)==c){
                count++;
             }
        }
        System.out.print(count);
    }
}