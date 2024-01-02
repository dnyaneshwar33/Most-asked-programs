// Java Program to find Second Largest Number in an Array
class secondlargest{
    static int secondlarge(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr[arr.length-2];
    }
    public static void main(String args[]){
        int nums[]={12,56,33,78,98,43};
        System.out.println(secondlarge(nums));
    }
}

// Java Program to find Second smallest Number in an Array
