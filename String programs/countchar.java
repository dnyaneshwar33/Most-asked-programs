//Java Program to count the total number of characters in a string
class countchar{
    public static void main(String args[]){
        String Name="Dnyaneshwar Vighne";
        int count=0;
        for(int i=0;i<Name.length();i++){
            if(Name.charAt(i)!=' '){
                count++;
            }
        }
        System.out.print(count);
    }
    
}