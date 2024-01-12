//Java Program to count the total number of vowels and consonants in a string
class vowelconsocount{
    public static void main(String args[]){
        String Name="Dnyaneshwar V";
        int vowelcount=0;
        int consonantcount=0;
        String str=Name.toLowerCase();
       
        for(int i=0;i<Name.length();i++){
            if(Name.charAt(i)=='o'||Name.charAt(i)=='i'||Name.charAt(i)=='e'||Name.charAt(i)=='a'||Name.charAt(i)=='u'){
                vowelcount++;
            }
            else if(str.charAt(i) >= 'a' && str.charAt(i)<='z'){
                consonantcount++;

            }
        }
        System.out.println(vowelcount);
        System.out.println(consonantcount);
       
    }
    
}