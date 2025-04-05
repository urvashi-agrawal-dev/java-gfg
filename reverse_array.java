import java.util.Arrays;
public class reverse_array {
    public void reverseArray(int[]arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        reverse_array obj=new reverse_array();
        int[] arr1={1,2,3,4,5,6};
        obj.reverseArray(arr1);
        System.out.println(Arrays.toString(arr1));
    }
}
