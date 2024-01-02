//Program to copy all elements of one array into another array
import java.util.*;
class copyelement{
    public static void main(String args[]){
        int arr1[]={12,34,56,78,98,34};
        int arr2[]=new int[arr1.length];

        for(int i=0;i<arr1.length;i++){
           
                arr2[i]=arr1[i];
            
        }
        System.out.print(Arrays.toString(arr2));
    }
}