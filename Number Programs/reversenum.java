//REVERSE THE NUMBER
// class reversenum{
//     public static void main(String args[]){
//         int orgnum = 12334;
//         int revnum=0;

//         while(orgnum!=0){
//             revnum = revnum *10 + orgnum %10;
//             orgnum = orgnum /10;
//         }

//         System.out.println(revnum);
//     }
// }

//Check the number is palindrome or not
class reversenum{
    public static void main(String args[]){
        int orgnum = 124321;
        int temp = orgnum;
        int revnum=0;

        while(orgnum!=0){
            revnum = revnum *10 + orgnum %10;
            orgnum = orgnum /10;
        }

        if(temp==revnum){
            System.out.println("Palindrome");
        }
        else{
            System.out.println(" not Palindrome");
           
        }
    }
}
