import java.util.*;
class majorityele {
    public List<Integer> findMajority(int[] arr) {
        int n =arr.length;
        int cd1=Integer.MIN_VALUE,cd2=Integer.MIN_VALUE;
        int count1=0,count2=0;
        for(int num:arr){
            if(num==cd1){
            count1++;
            }
            else if(num==cd2){
                count2++;
            }else if(count1==0){
                cd1=num;
                count1=1;
            } else if(count2==0){
                cd2=num;
                count2=1;
            } else{
                count1--;
                count2--;
            }
        }
        count1=0;
        count2=0;
        for(int num : arr){
            if(num==cd1)count1++;
            else if(num==cd2)count2++;
        }
        List<Integer>result=new ArrayList<>();
        if(count1>n/3)result.add(cd1);
        if(count2>n/3)result.add(cd2);
        Collections.sort(result);
        return result;
    }
    public static void main(String[] args) {
        majorityele finder=new majorityele();
        int[]arr1={1,2,2,4,4,2,2,3,3,3,3,3,3};
        System.out.println(finder.findMajority(arr1));
    }
}