class largest3{
    public static void main(String args[]){
        int num1 = 23;
        int num2 = 435;
        int num3 = 87;

        if(num1>num2 && num1 > num3){
            System.out.println("Number " + num1+" is greater");
        }
        else if(num2>num1 && num2 > num3){
            System.out.println("Number " + num2+" is greater");
        }
        else{
            System.out.println("Number " + num3+" is greater");

        }
    }
}