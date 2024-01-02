// Program to print the duplicate elements of an array
class duplicateele{
    public static void main(String args[]){
        int nums[]={12,34,12,34,76,89};
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    System.out.println(nums[i]);
                }
            }
        }
    }
}