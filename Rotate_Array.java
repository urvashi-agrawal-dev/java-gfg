import java.util.Arrays;
public class Rotate_Array {
    public void leftrotate(int[] arr,int d){
        int n=arr.length;
        d=d%n;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }
    private void reverse(int[] arr,int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        Rotate_Array obj = new Rotate_Array();
        int[] arr1={1,2,3,4,5};
        obj.leftrotate(arr1,2);
        System.out.println(Arrays.toString(arr1));
    }
}
