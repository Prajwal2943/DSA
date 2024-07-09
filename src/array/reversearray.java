package array;

public class reversearray {
    public static void reversearray(int arr[]){
        int first=0,last=arr.length-1;
        while(first<last){
           int temp=arr[first];
           arr[first]=arr[last];
           arr[last]=temp;

           first++;
           last--;

        }

    }
    public static void main(String[] args){
        int arr[]={2,4,6,8,10};
        int n=arr.length;
        System.out.println("The Original Array is : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        reversearray(arr);
        System.out.println("\nThe reverse is: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }



    }
}
