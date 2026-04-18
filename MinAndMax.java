import java.util.*;
class MinAndMax{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for(int num:arr){
            if(num > max){
                max = num;
            }
            
            if(num < min){
                min = num;
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        res.add(min);
        res.add(max);
    }
}