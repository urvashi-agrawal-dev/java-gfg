public class secondlargest {
    public int second_largest(int[]arr){
        int largest=Integer.MIN_VALUE;
        int second_largest=-1;
        for(int num:arr){
            if(num>largest){
                second_largest=largest;
                largest=num;
            } else if(num>second_largest && num<largest){
                second_largest=num;
            }
        }
        return second_largest==Integer.MIN_VALUE?-1:second_largest;
    }
    public static void main(String[] args) {
        secondlargest finder =new secondlargest();
        int[]arr1={12,34,45,65,23,67};
        System.out.println(finder.second_largest(arr1));
    }
}
