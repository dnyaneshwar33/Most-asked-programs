class removewhitespace{
    public static void main(String args[]){
        String str="Your   NA me";

        String str2 = str.replaceAll(" ","");
        System.out.print(str2);
        
        str=str.replaceAll(str.toLowerCase(),str.toUpperCase());
        System.out.print(str);

    }
}