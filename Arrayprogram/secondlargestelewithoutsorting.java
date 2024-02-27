// Java Program to find Second largest Number in an Array without sorting
class secondlargest{
    public static void main(String args[]){
        int arr[]={12,34,65,78,98};
        int max=0;
        int secondmax=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secondmax=max;
                max=arr[i];
            }
            if(arr[i]<max&&arr[i]>secondmax){
                secondmax=arr[i];
            }
        }
        System.out.println(secondmax);
    }
}
