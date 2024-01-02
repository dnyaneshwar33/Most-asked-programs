// Java Program to find Second Largest Number in an Array

class secondsmallest{
    static int secondsmallest(int arr[]){
          for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr[arr.length-2];
    }
    public static void main(String args[]){
        int nums[]={12,45,67,89,76,21,11,9};
        System.out.println(secondsmallest(nums));
    }
}