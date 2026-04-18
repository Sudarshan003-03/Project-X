import java.util.*;
class SecondLargest{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int min=Integer.MAX_VALUE;
        int sec=Integer.MAX_VALUE;
        for(int num:arr){
            if(num < min){
                sec = min;
                min = num;
            }
            else if(num>min && num<sec){
                sec = num;
            }
        }
        ArrayList<Integer> res  = new ArrayList<>();
        if(sec == Integer.MAX_VALUE){
            res.add(-1);
        }
        else{
            res.add(min);
            res.add(sec);
        }
        System.out.println(""+res);
    }
}