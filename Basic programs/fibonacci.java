//First n numbers in fibonacc series
// class fibonacci{
//     public static void main(String args[]){
//         int n = 12;
//         int a=0;
//         int b=0;
//         int c=1;
//        System.out.print("First "+ n + " numbers in fibonacci series are :");

//         for(int i=0;i<n;i++){
//             a=b;
//             b=c;
//             c=a+b;
            
//         System.out.print(a+" ");
//         }

//     }
// }

class fibonacci{
    public static void main(String args[]){
        int n =10;
        int num1 =0;
        int num2 =1;
        int num3;

        System.out.print(num1 +" "+num2+" ");

        for(int i=2;i<n;i++){
            num3=num1+num2;

            System.out.print(num3+" ");
            num1=num2;
            num2=num3;
            

        }
    }
}

//fibonacci series till n number 
// class fibonacci{
//     public static void main(String args[]){
//         int n = 12;
//         int a=0;
//         int b=0;
//         int c=1;
//         System.out.print("Fibonacci series till "+ n + " is :");
//         while(a<=n){
        
//             a=b;
//             b=c;
//             c=a+b;
            
//         System.out.print(a+" ");
//         }
//         }
//     }
