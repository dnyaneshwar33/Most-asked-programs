import java.util.*;
class duplichar{
    public static void main(String args[]){
        String str="Dnyaneshwar Vighne";
        char[] carr =str.toCharArray();

        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                if(carr[i]==carr[j]){
                    System.out.print(carr[j]+" ");
                    carr[j]=0;
                    break;
                }
            }
        }
    }
}

