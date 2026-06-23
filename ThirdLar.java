class ThirdLar{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5,6,7,8,9};
        if(arr.size() < 3)
        return -1;
        
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        
        for (int num : arr) {
            if (num >= first) {
                third = second;
                second = first;
                first = num;
            } 
            else if (num >= second) {
                third = second;
                second = num;
            } 
            else if (num >= third) {
                third = num;
            }
        }
    }
}