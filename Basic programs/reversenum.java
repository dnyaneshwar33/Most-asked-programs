//REVERSE A NUMBER
// public class reversenum{
//     public static void main(String args[]){
//         int num = 4321;
//         int rev = 0;
//         while(num !=0){
//             int rem = num % 10;
//             rev = rev*10+rem;
//             num = num/10;
//         }
//         System.out.println(rev);
//     }
// }

//NUM PALINDROME
public class reversenum{
    public static void main(String args[]){
        int org_num = 164361  ;
        int num = org_num;
        int rev = 0;
        while(num !=0){
            
            rev = rev*10+num%10;
            num = num/10;
        }
       

        if(rev==org_num){ 
        System.out.println(rev +" is palindrome");
        }
        else{
        System.out.println(rev +" is not palindrome");
          
        }
        
    }
}