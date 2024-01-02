// Program to print the elements of an array present on even position

// class eleatevenodd{
//     public static void main(String args[]){
//         int nums[]={12,34,56,76,32,49};
//         for(int i=0;i<nums.length;i++){
//             if(i%2==0){
//                 System.out.print(nums[i]+" ");
//             }
//         }
//     }
// }

// Program to print the elements of an array present on odd position
class eleatevenodd{
    public static void main(String args[]){
        int nums[]={12,34,56,76,32,49};
        for(int i=0;i<nums.length;i++){
            if(i%2!=0){
                System.out.print(nums[i]+" ");
            }
        }
        System.out.println(nums.length);
    }
}
