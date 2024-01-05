//print prime num till n 
import java.util.*;
class nthprime{
    public int isprime(int n){
         for(int i=1;i<n;i++){
            int count=0;
            for(int j =1;j<n;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println(i);
            }
        }
        return 0;
    }
    public static void main(String args[]){
        
        nthprime obj= new nthprime();
        int nums =obj.isprime(20);
        
        
       


       
    }
}