// Program to print the elements of an array in reverse order
class reverseele{
    public static void main(String args[]){
        int nums[] ={12,34,56,78,89,98};
        for(int i=nums.length-1;i>=0;i--){
            System.out.print(nums[i]+" ");
        }
    }
}