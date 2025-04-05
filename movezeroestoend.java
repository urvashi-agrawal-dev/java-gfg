
import java.util.Arrays;

public class movezeroestoend {
    public void move_zeores(int[]arr){
        int n=arr.length;
        int index=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[index++]=arr[i];
            }
        }
        while(index<n){
            arr[index++]=0;
        }
    }
    public static void main(String[] args) {
        movezeroestoend obj=new movezeroestoend();
        int[] arr1={1,2,0,4,3,0,6,7};
        obj.move_zeores(arr1);
        System.out.println(Arrays.toString(arr1));
    }
}
