//Swapping without temp variable
// class swapnum{
//     public static void main(String args[]){
//        int a = 23;
//        int b = 45;
       
//     System.out.println("Before swapping: "+ a + " " +b);  
//        a=a+b;
//        b=a-b;
//        a=a-b;
//     System.out.println("After swapping: "+ a + " " +b);
//     }
// }

//Swapping of three numbers
// class swapnum{
//     public static void main(String args[]){
//         int a = 12;
//         int b = 34;
//         int c = 78;
//      System.out.println("Before swapping: "+ a + " " +b+" "+c);

//      a=a+b+c;
//      b=a-(b+c);
//      c=a-(b+c);
//      a=a-(b+c);  
//      System.out.println("After swapping: "+ a + " " +b+" "+c);
      
//     }
// }
class swapnum{
    public static void main(String args[]){
        int a = 12;
        int b = 34;
        int c = 78;
     System.out.println("Before swapping: "+ a + " " +b+" "+c);

     int temp=a;
     a=b;
     b=c;
     c=temp;
     System.out.println("After swapping: "+ a + " " +b+" "+c);
      
    }
}