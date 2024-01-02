// Program to find the frequency of each element in the array
class freqcount{
    public static void main(String args[]){
        int nums[]={12,34,78,65,23,34,34,98};
        int freq[]=new int[nums.length];
        int visited=-1;
        
        for(int i=0;i<nums.length;i++){
          int count=1;
          for(int j=i+1;j<nums.length;j++){
            if(nums[i]==nums[j]){
                count++;
                freq[j]=visited;
            }
          }
          if(freq[i]!=visited){
            freq[i]=count;
          }
          
        }

        for(int i = 0; i < freq.length; i++){  
            if(freq[i] != visited)  
                System.out.println("    " + nums[i] + "    |    " + freq[i]);  
        } 
    }
}