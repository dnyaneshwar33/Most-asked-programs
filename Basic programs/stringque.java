//Java Program to count the total number of characters in a string
// public class stringque{
//     public static void main(String args[]){
//         String name ="Yog   esh";
       
//         int count =0; 
//         for(int i=0;i<name.length();i++){
//             if(name.charAt(i)!=' '){
//                 count++;
//             }
//         }
//         System.out.println(count);

//     }
// }

// Find duplicates from the string
import java.util.*;
class stringque{
    public static void main(String args[]){
        String str="Dnyaneshwar Vighne";
        char[] carr =str.toCharArray();

        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                if(carr[i]==carr[j]){
                    System.out.print(carr[j]+" ");
                    break;
                }
            }
        }
    }
}

