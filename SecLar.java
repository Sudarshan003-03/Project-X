class SecLar{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int max = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max)
            max = arr[i];
        }
        
        int sec = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > sec && arr[i]!=max)
            sec = arr[i];
        }
        
        System.out.println(sec);
    }
}